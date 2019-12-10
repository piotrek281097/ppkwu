package com.example.ppkwu.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class StringApiService {
    public HashMap<String, Integer> getAmountOfCategoryCharactersInString(String text) {
        HashMap<String, Integer> hashMapSigns = new HashMap();
        List<Character> lowerCaseLetters = new ArrayList();
        List<Character> upperCaseLetters = new ArrayList();
        List<Character> digits = new ArrayList();
        List<Character> otherSigns = new ArrayList();

        char[] textArray = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(textArray[i])) {
                lowerCaseLetters.add(textArray[i]);
            } else if (Character.isUpperCase(textArray[i])) {
                upperCaseLetters.add(textArray[i]);
            } else if (Character.isDigit(textArray[i])) {
                digits.add(textArray[i]);
            } else {
                otherSigns.add(textArray[i]);
            }
        }

        hashMapSigns.put("amount of lower case letters", lowerCaseLetters.size());
        hashMapSigns.put("amount of upper case letters", upperCaseLetters.size());
        hashMapSigns.put("amount of digits", digits.size());
        hashMapSigns.put("amount of others signs", otherSigns.size());

        return hashMapSigns;
    }

    public List<Character> getLowerCaseLetters(String text) {
        List<Character> lowerCaseLetters = new ArrayList<>();
        char[] textArray = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(textArray[i])) {
                lowerCaseLetters.add(textArray[i]);
            }
        }
        return lowerCaseLetters;
    }

    public List<Character> getUpperCaseLetters(String text) {
        List<Character> upperCaseLetters = new ArrayList<>();
        char[] textArray = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(textArray[i])) {
                upperCaseLetters.add(textArray[i]);
            }
        }
        return upperCaseLetters;
    }

    public List<Character> getDigits(String text) {
        List<Character> digits = new ArrayList<>();
        char[] textArray = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(textArray[i])) {
                digits.add(textArray[i]);
            }
        }
        return digits;
    }

    public List<Character> getOtherSigns(String text) {
        List<Character> otherSigns = new ArrayList<>();
        char[] textArray = text.toCharArray();

        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(textArray[i]) && !Character.isUpperCase(textArray[i]) && !Character.isLowerCase(textArray[i])) {
                otherSigns.add(textArray[i]);
            }
        }
        return otherSigns;
    }
}

