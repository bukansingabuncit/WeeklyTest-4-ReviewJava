package com.juaracoding;

public class Looping {
    public static void main(String[] args) {

        int baris = 1;
        for (int x = 9; x >= baris; --x) {
            for (int y = baris; y <= x; ++y) {
                System.out.print("");

                if (y % 2 == 1) {
                    System.out.print(y);
                } else if (y % 2 == 0) {
                    System.out.print("_");
                }
            }
            baris = baris + 1;
            System.out.println();
        }
    }
}



