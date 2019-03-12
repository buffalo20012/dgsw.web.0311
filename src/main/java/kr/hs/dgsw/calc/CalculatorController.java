package kr.hs.dgsw.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping
    public String getString(){
        return "Hello World!";
    }
}
// adf0883395af3bbeb1bc2ca6775d873b5f9302a2
