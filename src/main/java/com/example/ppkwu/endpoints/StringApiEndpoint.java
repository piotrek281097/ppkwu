package com.example.ppkwu.endpoints;

import com.example.ppkwu.services.StringApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api/")
public class StringApiEndpoint {
    private StringApiService stringApiService;

    @Autowired
    public StringApiEndpoint(StringApiService stringApiService) {
        this.stringApiService = stringApiService;
    }

    @GetMapping("recognize/all-lower-case-letters/{text}")
    public ResponseEntity<List<Character>> recognizeLowerCaseLetters(@PathVariable String text) {
        return new ResponseEntity<>(stringApiService.getLowerCaseLetters(text), HttpStatus.OK);
    }

    @GetMapping("recognize/all-upper-case-letters/{text}")
    public ResponseEntity<List<Character>> recognizeUpperCaseLetters(@PathVariable String text) {
        return new ResponseEntity<>(stringApiService.getUpperCaseLetters(text), HttpStatus.OK);
    }

    @GetMapping("recognize/all-digits/{text}")
    public ResponseEntity<List<Character>> recognizeDigits(@PathVariable String text) {
        return new ResponseEntity<>(stringApiService.getDigits(text), HttpStatus.OK);
    }

    @GetMapping("recognize/all-other-signs/{text}")
    public ResponseEntity<List<Character>> recognizeOtherSigns(@PathVariable String text) {
        return new ResponseEntity<>(stringApiService.getOtherSigns(text), HttpStatus.OK);
    }

    @GetMapping("recognize/amount-category-characters/{text}")
    public ResponseEntity<HashMap<String, Integer>> recognizeCategoryCharacters(@PathVariable String text) {
        return new ResponseEntity<>(stringApiService.getAmountOfCategoryCharactersInString(text), HttpStatus.OK);
    }
}
