package com.company;

import java.util.Scanner;

public class Sphere {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long radius = sc.nextInt();
        System.out.printf("VOLUME = %.3f\n", volume(radius));
    }

    private static double volume(long radius) {
        return (4/3.0)*3.14159*(radius*radius*radius);
    }
}
