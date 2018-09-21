package icu.cyclone.alex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Type string: ");
        System.out.println(new CharStatistic(sc.nextLine()));
    }

}
