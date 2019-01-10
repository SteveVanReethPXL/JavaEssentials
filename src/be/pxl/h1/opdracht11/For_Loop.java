package be.pxl.h1.opdracht11;

import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Deel 1");
        for (int i = 0; i < 10; i++){
            System.out.println(i * 10);
        }

        System.out.println("Deel 2");

        String start = scanner.nextLine();
        System.out.println(("Geef startkarakter: "));
        char karakter = start.charAt(0);

        System.out.println("Geef aantal gewenste lijnen:");
        int lijnen = scanner.nextInt();
        if (lijnen <= 0){
            lijnen = 1;
        }

        for (int i = 0; i < lijnen; i++){
           for (int j = 0; j < i+1; j++){
               System.out.print(karakter + " ");
               if (karakter == 'Z'){
                   karakter = 'A';
               } else {
                   karakter++;
               }
            }
            System.out.println();
        }
    }
}
