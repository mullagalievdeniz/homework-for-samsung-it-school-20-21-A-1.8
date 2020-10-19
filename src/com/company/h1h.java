package com.company;

import java.util.Scanner;

public class h1h {
    public static void main(String[] args) {
        int[] name;
        name = new int[]{23, 34, 56};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 1");
        int N;
        N = sc.nextInt();
        if(N == name[1])
            System.out.println(N);
        if(N <= name[1])
            System.out.println("No");
        if(N == name[0])
            System.out.println(N);
        if(N == name[2])
            System.out.println(N);
        if(N <= name[0])
            System.out.println("No");
        if(N <= name[2])
            System.out.println("No");
    }
}

