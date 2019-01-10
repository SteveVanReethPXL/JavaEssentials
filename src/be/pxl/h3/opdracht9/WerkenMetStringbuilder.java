package be.pxl.h3.opdracht9;

import java.util.Scanner;
import java.lang.Character;

public class WerkenMetStringbuilder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Geef code in: ");
        String code = input.nextLine();

        if(Character.isLetter(code.charAt(0)) && Character.isLetter(code.charAt(1))
                && Character.isDigit(code.charAt(2)) && Character.isDigit(code.charAt(3)) && code.length() == 4){
            System.out.println("Code is correct");
        }else{
            System.out.println("Code is foutief");
        }

        StringBuilder codeBewerk = new StringBuilder();
        codeBewerk.append(Character.toUpperCase(code.charAt(0)));
        codeBewerk.append(code.substring(1,4));
        code = codeBewerk.toString();
        System.out.println("Aangepaste code: " + code);
    }
}
