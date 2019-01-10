package be.pxl.h6.opdracht8;

public class FigurenApp {
    public static void main(String[] args) {
        Cirkel cirkel = new Cirkel(5,6, 6);
        Cirkel cirkel1 = new Cirkel(5,6, 6);
        Cirkel cirkel2 = new Cirkel(5,6, 6);
        Rechthoek rechthoek = new Rechthoek(1, 2, 4, 4);
        System.out.println("opp: " + cirkel.getOppervlakte() +", omtrek: " + cirkel.getOmtrek());
        System.out.println("aantal: " + GrafischElement.getAantal());
    }
}
