package org.africa.semicolon;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (firstName) -> System.out.println(firstName  );
        consumer.accept("Fitzgerald");
    }

    }