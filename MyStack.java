package com.mycompany.trabajo;

/**
 * Implementación de una pila genérica (LIFO) usando nodos enlazados.
 * @param <T> tipo de dato que almacenará la pila
 */
public class MyStack<T> {

    // Clase interna para los nodos
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node<T> top;
    private int size;

    public MyStack() {
        top = null;
        size = 0;
    }

    /** Inserta un elemento en la cima (push). */
    public void push(T item) {
        top = new Node<>(item, top);
        size++;
    }

    /** Saca y devuelve el elemento de la cima (pop). */
    public T pop() {
        if (isEmpty()) throw new EmptyStackException("Pila vacía - no se puede hacer pop");
        T value = top.data;
        top = top.next;
        size--;
        return value;
    }

    /** Devuelve el elemento de la cima sin eliminarlo (peek). */
    public T peek() {
        if (isEmpty()) throw new EmptyStackException("Pila vacía - no se puede hacer peek");
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[top] ");
        Node<T> cur = top;
        while (cur != null) {
            sb.append(cur.data).append(" ");
            cur = cur.next;
        }
        sb.append("[bottom]");
        return sb.toString();
    }
}
