package br.com.dev.rq.rest_springboot.controller;

import br.com.dev.rq.rest_springboot.exception.UnsupportedMathOperationException;
import br.com.dev.rq.rest_springboot.service.MathService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MathController {

    private final MathService mathService;

    @GetMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(@PathVariable(value = "numberOne") String numberOne,
                      @PathVariable(value = "numberTwo") String numberTwo) throws Exception {
        if (!mathService.isNumeric(numberOne) || !mathService.isNumeric(numberTwo)) throw new UnsupportedMathOperationException("Please set a numeric value!");
        return mathService.convertToDouble(numberOne) + mathService.convertToDouble(numberTwo);
    }

}
