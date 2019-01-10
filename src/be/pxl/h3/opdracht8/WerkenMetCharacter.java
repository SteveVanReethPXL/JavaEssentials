package be.pxl.h3.opdracht8;

import java.util.Scanner;
import java.lang.Character;

public class WerkenMetCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Geef code in: ");
        String code = input.nextLine();

        boolean resultaat = true;
        for (int i = 0; i < 5; i++ ){
            char testCharacter = code.charAt(i);
            if (i < 2 && !Character.isLetter(testCharacter)){
                resultaat = false;
            }else if(i > 1 && i < 4 && !Character.isDigit(testCharacter)) {
                resultaat = false;
            }else if(i > 3  && Character.isWhitespace(testCharacter)){
                resultaat = false;
            }else{
                resultaat = false;
            }
        }
        if(resultaat){
            System.out.println("Code is correct");
        }else{
            System.out.println("Code is foutief");
        }

        /* Oplossing lector */

        if(Character.isLetter(code.charAt(0)) && Character.isLetter(code.charAt(1))
                 && Character.isDigit(code.charAt(2)) && Character.isDigit(code.charAt(3)) && code.length() == 4){
            System.out.println("Code is correct");
        }else{
            System.out.println("Code is foutief");
        }
    }
}
