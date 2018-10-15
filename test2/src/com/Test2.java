package com;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter value of n!:");

        int factOfNumb = scan.nextInt();

        int n = 0;
        int calc = 1;

        do {

            calc = calc * ++n;

        }
        while (!(factOfNumb == calc) && calc < factOfNumb);

        if (calc > factOfNumb) {

            System.out.println("This is wrong value of factorial!!!");

        } else {

            System.out.println("Number: " + n);

        }
    }

}

