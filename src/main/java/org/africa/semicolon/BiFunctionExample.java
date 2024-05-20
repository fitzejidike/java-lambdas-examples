package org.africa.semicolon;

import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        BiFunction<Integer,String,String> biFunction =(a,b)-> a+b;
            System.out.println(biFunction.apply(234,"fitz"));
        }
    }

