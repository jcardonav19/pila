/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 * Filename:    ParenthesesValidator.java
 * Description: Valida expresiones con paréntesis usando la pila MyStack.
 *
 * Author:      TU NOMBRE
 * Date:        2025-09-29
 * Version:     1.0
 */
public class ParenthesesValidator {

    /**
     * Verifica si una expresión está balanceada con (), [], {}.
     */
    public static boolean isBalanced(String expr) {
        MyStack<Character> stack = new MyStack<>();

        for (int i = 0; i < expr.length(); i++) {
            char c = expr.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!matches(top, c)) return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean matches(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '[' && close == ']') ||
               (open == '{' && close == '}');
    }

    /** Main para probar rápidamente */
    public static void main(String[] args) {
        String[] tests = {
            "(a + b) * (c - d)",
            "([{}])",
            "((a)",
            "a + b)",
            "{ [ ( ) ] }",
            "{ [ ( ] ) }",
            "((()))[]{}",
            "[(])"
        };

        for (String t : tests) {
            System.out.printf("\"%s\" -> %b%n", t, isBalanced(t));
        }
    }
}
