package be.pxl.h6.voorbeeldPersoon;

public class Student extends Persoon {
    private int leerkrediet;
    private String studentnummer;
    private String opleiding;

    private static int aantal = 0;

    public Student(){
        this("onbekend", "onbekend");
    }

    public Student(String naam, String voornaam) {
        this(naam, voornaam, "15999999", "XXX");
    }

    public Student(String naam, String voornaam, String studentnummer, String opleiding) {
        super(naam, voornaam);
        this.studentnummer = studentnummer;
        this.opleiding = opleiding;
        this.leerkrediet = 140;
        aantal++;
    }
    public Student(Student student){
        this(student.getNaam(),student.getVoornaam(),student.getStudentnummer(), student.getOpleiding());
    }

    public void setLeerkrediet(int leerkrediet) {
        this.leerkrediet = checkLeerkrediet(leerkrediet);
    }

    public void setStudentnummer(String studentnummer) {
        this.studentnummer = studentnummer;
    }

    public void setOpleiding(String opleiding) {
        this.opleiding = opleiding;
    }

    public int getLeerkrediet() {
        return leerkrediet;
    }

    public String getStudentnummer() {
        return studentnummer;
    }

    public String getOpleiding() {
        return opleiding;
    }

    private int checkLeerkrediet(int leerkrediet){
        if (leerkrediet < 0){
            leerkrediet = 0;
        }else if(leerkrediet > 140){
            leerkrediet = 140;
        }
        return leerkrediet;
    }

    public void wijzigLeerkrediet(int leerkrediet){
        leerkrediet += getLeerkrediet();
        setLeerkrediet(leerkrediet);
    }
    @Override
    public void print(){
        super.print();
        System.out.println("studentnr: " + studentnummer +"\n" +
                "opleiding: " + opleiding + "\n" +
                "leerkrediet: " + leerkrediet);
    }

    public static int getAantal(){
        return aantal;
    }

}
