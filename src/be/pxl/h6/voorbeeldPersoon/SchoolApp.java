package be.pxl.h6.voorbeeldPersoon;

public class SchoolApp {
    public static void main(String[] args) {
        Persoon persoon = new Persoon();
        Student student = new Student();

        student.setNaam("Balboa");
        student.setVoornaam("Rocky");
        student.wijzigLeerkrediet(250);
        persoon.print();
        student.print();
    }
}
