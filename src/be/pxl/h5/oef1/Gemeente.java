package be.pxl.h5.oef1;

public class Gemeente {
    private int postcode;
    private String gemeenteNaam;

    public Gemeente(int postcode, String gemeenteNaam) {
        this.postcode = postcode;
        this.gemeenteNaam = gemeenteNaam;
    }

    public void setPostcode(int postcode) {
        int lengte = String.valueOf(postcode).length();
        if (lengte > 4){
            postcode = (int) (postcode / Math.pow(10,(lengte - 4)));
        }else{
            while(lengte < 4){
                postcode *= 10;
                lengte += 1;
            }
        }
        this.postcode = postcode;
    }

    public void setGemeenteNaam(String gemeenteNaam) {
        StringBuilder newGemeenteNaam = new StringBuilder();
        boolean eersteKarater = true;
        for (int i = 0; i < gemeenteNaam.length(); i++){
            char karakter = gemeenteNaam.charAt(i);
            if(karakter == ' ' || karakter == '-'){
                eersteKarater = true;
                newGemeenteNaam.append(karakter);
            }else if(karakter == '\''){
                newGemeenteNaam.append(karakter);
            }else if(Character.isLetter(karakter)){
                if(eersteKarater){
                    newGemeenteNaam.append(Character.toUpperCase(karakter));
                    eersteKarater = false;
                }else {
                    newGemeenteNaam.append(Character.toLowerCase(karakter));
                }
            }
        }
        this.gemeenteNaam = newGemeenteNaam.toString();
    }

    public int getPostcode() {
        return postcode;
    }

    public String getGemeenteNaam() {
        return gemeenteNaam;
    }

    @Override
    public String toString() {
        return  postcode + " " + gemeenteNaam ;
    }
}
