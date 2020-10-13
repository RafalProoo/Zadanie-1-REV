package com.example.rev;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseController {
    @RequestMapping("/{sequence}")
    public String reverseMethod(@PathVariable("sequence") String sequence) {

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = sequence.length() - 1; i >= 0; i--) {
            stringBuilder.append(sequence.charAt(i));
        }
        return stringBuilder.toString();
    }
}
