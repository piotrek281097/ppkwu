package com.example.ppkwu.services;

import org.springframework.stereotype.Service;

@Service
public class RevService {

    public String getReversedText(String text) {
        StringBuilder input = new StringBuilder();
        return input.append(text).reverse().toString();
    }
}
