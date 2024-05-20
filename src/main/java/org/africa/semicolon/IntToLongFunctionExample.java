package org.africa.semicolon;

import java.util.function.IntToLongFunction;

public class IntToLongFunctionExample {
    public static void main(String[] args) {
        IntToLongFunction intToLongFunction = (a) -> a*2;
        System.out.println(intToLongFunction.applyAsLong(10));
    }
}
