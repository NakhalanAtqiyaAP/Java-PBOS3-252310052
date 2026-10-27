package praktikum.praktikum5;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] angka = new int[2][3];
        angka[0][0] = 10;
        angka[0][1] = 21;
        angka[0][2] = 43;
        angka[1][0] = 90;
        angka[1][1] = 34;
        angka[1][2] = 221;


        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.println(angka[i][j]);
            }
        }
     
        int[][] data = {
            {2,3},
            {4,3}
        };
        
    }
}