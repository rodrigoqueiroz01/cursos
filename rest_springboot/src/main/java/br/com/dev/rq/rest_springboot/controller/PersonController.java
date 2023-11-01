package br.com.dev.rq.rest_springboot.controller;

import br.com.dev.rq.rest_springboot.controller.interfaces.IPersonController;
import br.com.dev.rq.rest_springboot.data.vo.PersonVO;
import br.com.dev.rq.rest_springboot.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/person/v1")
public class PersonController implements IPersonController {

    private final PersonService service;

    @GetMapping
    public ResponseEntity<List<PersonVO>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PersonVO> findById(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @PostMapping
    public ResponseEntity<PersonVO> save(@RequestBody final PersonVO personVO) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(personVO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PersonVO> update(@RequestBody final PersonVO personVO, @PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(service.update(personVO, id));
    }

    @PatchMapping("/{id}")
    public ResponseEntity<PersonVO> disablePerson(@PathVariable(value = "id") Long id) {
        return ResponseEntity.ok(service.disablePerson(id));
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable(value = "id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent();
    }

}
