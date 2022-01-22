package ru.geekbrains.test;

import java.util.Arrays;
import java.util.Scanner;

public class classApp {
    public static void main(String[] args){
        int[] ww;
        int n;
786512DfL
        786512Dfl
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число : ");
        n = scanner.nextInt();
        ww = new int[n];

        for (int i = 0; i < n; i++){
            System.out.print("Введите число в " + " [ " + (i + 1) + " ] " + " : ");
            ww[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(ww));
    }
}
