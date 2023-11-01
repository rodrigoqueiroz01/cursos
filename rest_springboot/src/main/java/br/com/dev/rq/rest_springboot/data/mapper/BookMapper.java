package br.com.dev.rq.rest_springboot.data.mapper;

import br.com.dev.rq.rest_springboot.data.model.Book;
import br.com.dev.rq.rest_springboot.data.vo.BookVO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Objects.isNull;

@Component
public class BookMapper {

    public static Book toBook(BookVO bookVO) {
        var mapper = new ModelMapper();
        return mapper.map(bookVO, Book.class);
    }

    public static BookVO toBookVO(Book book) {
        var mapper = new ModelMapper();
        return mapper.map(book, BookVO.class);
    }

    public static List<BookVO> toBookVOList(List<Book> bookList) {
        if (isNull(bookList) || bookList.isEmpty()) return new ArrayList<>();
        return bookList.stream().map(BookMapper::toBookVO).collect(Collectors.toList());
    }

}
