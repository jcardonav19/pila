/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajo;

/**
 * Filename:    EmptyStackException.java
 * Description: Excepción personalizada para pila vacía.
 *
 * Author:      TU NOMBRE
 * Date:        2025-09-29
 * Version:     1.0
 */
public class EmptyStackException extends RuntimeException {
    public EmptyStackException() { super(); }
    public EmptyStackException(String message) { super(message); }
}
