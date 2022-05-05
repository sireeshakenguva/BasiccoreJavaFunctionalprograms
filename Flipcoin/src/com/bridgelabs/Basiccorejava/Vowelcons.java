package com.bridgelabs.Basiccorejava;

import java.util.Scanner;

public class Vowelcons {
public static void main(String[] args) {

System.out.println("Welcome to Vowels or Consonants program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the alphabet ");
        char ch = scanner.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
}

}