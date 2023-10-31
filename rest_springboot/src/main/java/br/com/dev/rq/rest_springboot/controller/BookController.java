package br.com.dev.rq.rest_springboot.controller;

import br.com.dev.rq.rest_springboot.controller.interfaces.IBookController;
import br.com.dev.rq.rest_springboot.data.vo.BookVO;
import br.com.dev.rq.rest_springboot.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/book/v1")
public class BookController implements IBookController {

    private final BookService service;

    @GetMapping
    public ResponseEntity<List<BookVO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookVO> findById(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<BookVO> save(@RequestBody final BookVO vo) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(vo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<BookVO> udpate(@RequestBody final BookVO vo, @PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(service.update(vo, id));
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable(value = "id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent();
    }

}
