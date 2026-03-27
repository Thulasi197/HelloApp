package com.example.helloapp;
//HELLOAPP UC2
import java.util.*;
public class App {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Hello " + args[0]);
        } else {
            System.out.println("Hello User");
        }
    }
}