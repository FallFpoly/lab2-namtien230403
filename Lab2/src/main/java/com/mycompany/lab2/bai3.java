/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int SoDien;
        System.out.print("Nhap so dien: ");
        SoDien=sc.nextInt();
        if(SoDien<50){
            System.out.print("Tien dien la: "+SoDien*1000);
        } else {
            System.out.print("Tien dien la: "+SoDien*1200);;
        }
    }
}
