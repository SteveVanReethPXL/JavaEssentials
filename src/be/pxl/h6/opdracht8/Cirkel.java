package be.pxl.h6.opdracht8;

public class Cirkel extends GrafischElement{
    private double straal;

    public Cirkel(int x, int y, int straal){
        super(x, y);
        this.straal = straal;
    }

    @Override
    public double getOppervlakte() {
        return Math.PI * Math.pow(straal, 2);
    }

    @Override
    public double getOmtrek() {
        return Math.PI * 2 * straal;
    }
}
