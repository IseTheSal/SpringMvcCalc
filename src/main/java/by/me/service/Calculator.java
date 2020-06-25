package by.me.service;

import org.springframework.stereotype.Service;

@Service
public class Calculator {
    public double calc(double num1, double num2, String op) throws IllegalArgumentException {
        switch (op) {
            case "plus":
                return num1 + num2;
            case "minus":
                return num1 - num2;
            case "power":
                return num1 * num2;
            case "divide":
                return num1 / num2;
        }
        throw new IllegalArgumentException();
    }
}
