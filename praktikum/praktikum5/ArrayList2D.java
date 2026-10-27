package praktikum.praktikum5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayList2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> angka = new ArrayList<>();
        angka.add(new ArrayList<Integer>());        // row baru
        angka.get(0).add(1,2);

        angka.add(new ArrayList<Integer>(Arrays.asList(3,4,5)));
    }
}