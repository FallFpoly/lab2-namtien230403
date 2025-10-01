/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int cn;
        System.out.println("+----------------+");
        System.out.println("1: Giai PT bac 1");
        System.out.println("2: Giai PT bac 2");
        System.out.println("3: Tinh tien dien");
        System.out.println("4: Ket thuc");
        System.out.println("+----------------+");
        System.out.print("Chon chuc nang: ");
        cn = sc.nextInt();
        switch (cn) {
            case 1:
                giaiPTbac1();
                break;
            case 2:
                giaiPTbac2();
                break;
            case 3:
                tienDien();
                break;
            case 4:
                System.out.print("Chuong trinh ket thuc !");
                break;
            default:
                System.out.println("Chon sai !");
                break;
        }
    }

    public static void giaiPTbac1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap a: ");
        double a = sc.nextDouble();
        System.out.print("Nhap b: ");
        double b = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.print("PT vo so nghiem");
            } else {
                System.out.println("PT vo nghiem");
            }
        } else {
            double x = -b / a;
            System.out.print("Nghiem cua PT la: " + x);
        }
    }

    public static void giaiPTbac2() {
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

    public static void tienDien() {
        Scanner sc = new Scanner(System.in);
        int SoDien;
        System.out.print("Nhap so dien: ");
        SoDien = sc.nextInt();
        if (SoDien < 50) {
            System.out.print("Tien dien la: " + SoDien * 1000);
        } else {
            System.out.print("Tien dien la: " + SoDien * 1200);
        }
    }
}
