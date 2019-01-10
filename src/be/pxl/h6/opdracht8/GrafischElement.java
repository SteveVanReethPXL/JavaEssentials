package be.pxl.h6.opdracht8;

public abstract class GrafischElement{
    private int x;
    private int y;
    public static int aantal;
    public GrafischElement(int x, int y) {
        this.x= x;
        this.y= y;
        aantal++;
    }
    public void setPositie(int x, int y) {
        this.x= x;
        this.y= y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public abstract double getOppervlakte();
    public abstract double getOmtrek();

    public static int getAantal(){
        return aantal;
    }
}
