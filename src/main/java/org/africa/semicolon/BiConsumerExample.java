package org.africa.semicolon;

import java.util.function.BiConsumer;

public class BiConsumerExample {
        public static void main(String[] args) {
            BiConsumer<String, String> biConsumer = (firstName, age)-> System.out.println(firstName + "is " + age+ "years old");
            biConsumer.accept("john", "12");
        }
    }