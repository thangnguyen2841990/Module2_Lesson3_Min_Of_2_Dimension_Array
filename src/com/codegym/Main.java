package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int[][] matrix;
        int size;
        do {
            System.out.println("Nhập kích cỡ cho mảng 2 chiều");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Kích cỡ của mảng <= 20!");
            }
        } while (size > 20);
        // gán giá trị ngẫu nhiên cho ma trận 2 chiều
        matrix = new int[size][size];
        System.out.println("Mảng 2 chiều " + size + " hàng " + size + " cột");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * (100 - 1) + 1);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
//        // tìm giá trị lớn nhất của mảng 2 chiều
        int min = matrix[0][0];
        int indexRow = -1;
        int indexCol = -1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    indexRow = i;
                    indexCol = j;
                }
            }
        }
        System.out.print("Giá trị lớn nhất của ma trận là: " + min + " ở vị trí hàng: " + indexRow + " và cột: " + indexCol);
    }
}
