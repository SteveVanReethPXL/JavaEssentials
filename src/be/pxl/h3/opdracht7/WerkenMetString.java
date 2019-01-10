package be.pxl.h3.opdracht7;

public class WerkenMetString {
    public static void main(String[] args) {
        String text = "Hallo, goeiemorgen";

        System.out.println(text);
        System.out.println(text.length());

        text = text.replace('a', 'o');
        System.out.println(text);

        int aantalE= text.length() - text.replace("e", "").length();
        System.out.println(aantalE);

        String text2 = "Test";
        System.out.println(text.equals(text2));

        String allemaalKleineLetters = "abcdefghi";
        if(allemaalKleineLetters.length() % 2 == 0){
            int midden = (int) allemaalKleineLetters.length()/2;
            System.out.println(allemaalKleineLetters.substring(midden, midden + 1).toUpperCase());
        }else{
            System.out.println(allemaalKleineLetters.substring(text.length() / 2 ).toUpperCase());
        }
    }
}
