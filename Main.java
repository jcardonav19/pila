/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 * Filename:    Main.java
 * Description: Clase principal para ejecutar las pruebas de la pila y validador de paréntesis.
 *
 * Author:      TU NOMBRE
 * Date:        2025-09-29
 * Version:     1.0
 */
public class Main {
    public static void main(String[] args) {
        // ===== Prueba de la Pila =====
        System.out.println("=== Prueba de MyStack ===");
        MyStack<Integer> pila = new MyStack<>();

        pila.push(10);
        pila.push(20);
        pila.push(30);

        System.out.println("Contenido de la pila: " + pila);
        System.out.println("Elemento en la cima (peek): " + pila.peek());
        System.out.println("Elemento removido (pop): " + pila.pop());
        System.out.println("Pila después del pop: " + pila);
        System.out.println("Tamaño actual: " + pila.size());

        // ===== Prueba del Validador de Paréntesis =====
        System.out.println("\n=== Prueba de ParenthesesValidator ===");
        String[] expresiones = {
            "(a + b) * (c - d)",
            "([{}])",
            "((a)",
            "a + b)",
            "{ [ ( ) ] }",
            "{ [ ( ] ) }",
            "((()))[]{}",
            "[(])"
        };

        for (String expr : expresiones) {
            boolean balanceada = ParenthesesValidator.isBalanced(expr);
            System.out.printf("Expresión: %-15s -> %s%n", expr, balanceada ? "Balanceada" : "No balanceada");
        }
    }
}
