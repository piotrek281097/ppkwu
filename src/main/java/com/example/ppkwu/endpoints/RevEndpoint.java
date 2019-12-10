package com.example.ppkwu.endpoints;

import com.example.ppkwu.services.RevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class RevEndpoint {

    private RevService revService;

    @Autowired
    public RevEndpoint(RevService revService) {
        this.revService = revService;
    }

    @GetMapping("rev/{text}")
    public ResponseEntity<String> reverse(@PathVariable String text) {
        return new ResponseEntity<>(revService.getReversedText(text), HttpStatus.OK);
    }
}
