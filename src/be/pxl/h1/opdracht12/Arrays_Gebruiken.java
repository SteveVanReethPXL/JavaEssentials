package be.pxl.h1.opdracht12;

public class Arrays_Gebruiken {
    public static void main(String[] args) {
        int[] lijst = new int[20];
        for (int i =  0; i < lijst.length; i++){
            lijst[i] = i * 7;
        }
        for (int n : lijst){
            System.out.print(n + " ");
        }
        System.out.println();

        int[] lijst_2 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        for (int n : lijst_2){
            System.out.print(n + " ");
        }
        System.out.println();
        for (int i = lijst_2.length - 1; i >= 0; i--){
            System.out.print(lijst_2[i] + " ");
        }
    }

}

