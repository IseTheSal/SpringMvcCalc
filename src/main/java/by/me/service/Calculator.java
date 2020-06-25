package by.me.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

    public char checkSymbol(String op){
        switch (op){
            case "plus":
                return '+';
            case "minus":
                return '-';
            case "divide":
                return '/';
            case "power":
                return '*';
        }
        throw new IllegalArgumentException();
    }
}
