package ru.vsu.cs.baturin_v_a;
import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.print("Введите высоту = ");
        int h = readVar();

        System.out.print("Введите ширину = ");
        int w = readVar();

        printLines(h, w);
    }

    private static int readVar(){
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        if (k < 3) {
            System.out.println("Error < 3");
            System.exit(0);
        }

        return k;
    }

    private static void printLine(int h, int w){
        System.out.print("*");

        for (int i = 0; i < (w - 2); i++){
            System.out.print("-");
        }

        System.out.println("*");
    }

    private static void printLines(int h, int w){
        printLine(h, w);

        for (int i = 0; i < (h - 2); i++){
            System.out.print("|");

            for (int j = 0; j < (w - 2); j++){
                System.out.print(" ");
            }

            System.out.println("|");
        }

        printLine(h, w);
    }
}
