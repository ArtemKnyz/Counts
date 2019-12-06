package examp1;

import java.util.*;

import java.util.Scanner;

public class Examp1 {
    public static int n = 0;

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scan.nextInt();
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                arr.add(i);
                if (arr.size() <= a) {
                    System.out.print(i + " ");
                    System.out.print(arr.size() + "; ");
                }
            }
            n=arr.size();
        }
    }
    void razryad(){
        
        System.out.println("asdf");
    }

}
