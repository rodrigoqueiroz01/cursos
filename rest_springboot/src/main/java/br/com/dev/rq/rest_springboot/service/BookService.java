package br.com.dev.rq.rest_springboot.service;

import br.com.dev.rq.rest_springboot.controller.BookController;
import br.com.dev.rq.rest_springboot.data.mapper.BookMapper;
import br.com.dev.rq.rest_springboot.data.model.Book;
import br.com.dev.rq.rest_springboot.data.vo.BookVO;
import br.com.dev.rq.rest_springboot.exception.EntityNotFoundException;
import br.com.dev.rq.rest_springboot.exception.RequiredObjectIsNullException;
import br.com.dev.rq.rest_springboot.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository repository;

    public List<BookVO> findAll() {
        var books = BookMapper.toBookVOList(repository.findAll());
        books.forEach(vo -> vo.add(linkTo(methodOn(BookController.class).findById(vo.getId())).withSelfRel()));
        return books;
    }

    public BookVO findById(Long id) {
        var vo = BookMapper.toBookVO(repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Livro não encontrado")));
        vo.add(linkTo(methodOn(BookController.class).findById(id)).withSelfRel());
        return vo;
    }

    public BookVO save(BookVO bookVO) {
        if (Objects.isNull(bookVO)) throw new RequiredObjectIsNullException();

        var book = BookMapper.toBook(bookVO);
        var vo = BookMapper.toBookVO(repository.save(book));
        vo.add(linkTo(methodOn(BookController.class).findById(vo.getId())).withSelfRel());

        return vo;
    }

    public BookVO update(BookVO bookVO, Long id) {
        var book = repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Livro não encontrado"));
        var vo = BookMapper.toBookVO(repository.save(book));
        vo.add(linkTo(methodOn(BookController.class).findById(bookVO.getId())).withSelfRel());
        return vo;
    }

    public void delete(Long id) {
        var book = findById(id);
        repository.deleteById(book.getId());
    }

}
