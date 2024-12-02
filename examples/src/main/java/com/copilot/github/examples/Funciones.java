package com.copilot.github.examples;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Funciones {
    
    @GetMapping("/fibonacci/{n}")
    public int fibonacci(@PathVariable int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    @GetMapping("/factorial/{n}")
    int factorial(@PathVariable int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    
    @GetMapping("/palindrome")
    boolean palindrome(@RequestParam String s) {
        int n = s.length();
        for (int i = 0; i < (n / 2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    //función que cuenta la cantidad de la ocurrencia de una palabra en una cadena
    @GetMapping("/countWords")
    int countWords(@RequestParam String s, @RequestParam String word){
        int count = 0;
        String[] words = s.split(" ");
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }
}