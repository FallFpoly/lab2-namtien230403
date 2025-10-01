/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        System.out.print("Nhap c: ");
        double c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.print("PT vo so nghiem");
                } else {
                    System.out.println("PT vo nghiem");
                }
            } else {
                double x = -c / b;
                System.out.print("Nghiem cua PT la: " + x);
            }
        } else if (a != 0) {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.print("PT vo nghiem");
            } else if (delta == 0) {
                System.out.print("PT co nghiem kep: " + (-b / (2 * a)));
            } else {
                System.out.println("X1 = " + (-b + Math.sqrt(delta) / (2 * a)));
                System.out.println("X2 = " + (-b - Math.sqrt(delta) / (2 * a)));
            }
        }
    }
}
