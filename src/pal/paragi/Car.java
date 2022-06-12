package pal.paragi;

public class Car {

    private int doors; //alapból private változókat használunk a classon belül
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    // itt készítünk egy methodot, hogy a fenti private class változókhoz a main.java-ból is hozzá lehessen férni
    public void setModel(String model) {
        String validModel = model.toLowerCase(); // ellenőrzéshez bevezetünk egy új változót, hogy a Main.java-n elérhető adatokból válasszon létezőt, és így univerzálisan használható legyen a methode
        if (validModel.equals("carrera") || validModel.equals("commodo")){
            this.model = model; // itt a fenti private model variable-t updateljük a setModel(String model) paraméter értékével. nem direkt férünk hozzá a fenti private (restricted) változókhoz, hanem ezzel a módszerrel, egy public methodon keresztül.
        } else {
            this.model = "Unknown"; // ha a fenti if ellenőrzés nem találja a Main.java-n a keresett modellt, hibaüzenetet dob a modellre.
        }

    }

    public String getModel() {
        return this.model;
    }

}
