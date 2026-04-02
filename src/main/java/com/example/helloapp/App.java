package com.example.helloapp;
import java.util.*;
public class App {
	    public static void main(String[] args) {

	        // If no arguments are passed
	        if (args.length == 0) {
	            System.out.println("Hello, World!");
	        } else {
	            // Loop through all names
	            for (String name : args) {
	                System.out.println("Hello, " + name + "!");
	            }
	        }
	    }
	}
    