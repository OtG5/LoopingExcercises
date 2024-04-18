package com.pluralsight;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 1;
        boolean lovesJava = true;
        while(lovesJava) {
            System.out.println("I love Java ");
            count++;
            if (count > 5) {
                lovesJava = false;
            }
        }

    }
}
