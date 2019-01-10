package be.pxl.h1.opdracht13;

public class DimensionaleArrays {
    public static void main(String[] args) {
        int [][] tabel = new int [4][6];
        for (int rij = 0; rij < tabel.length; rij++){
            for (int kolom = 0; kolom < tabel[rij].length; kolom++){
                tabel[rij][kolom ]= (rij + 1) * (kolom + 1);

            }
        }
        for (int[] kolom : tabel){
            for (int cel : kolom){
                System.out.print( cel + "\t" );
            }
            System.out.println();
        }
    }
}
