package pal.paragi;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car(); // a másik fájlban lévő Car classhoz hozom létre a porsche objektumot. a Car classt template-ként használja.
        Car holden = new Car(); // egy másik objektumot hozok lérte egy másik kocsimárkához, szintén a Car class mint template alapján.
        porsche.setModel("Carrera"); // a porsche változót 2 sorral fentebb inicializáltuk a new keyworddel, ez szükséges
        holden.setModel("Commodo");

        //első modellünk - porsche carrera:
        System.out.println("Model is " + porsche.getModel()); // így tudjuk kiíratni, a getModel-re hivatozva, amely a másik fájlban van létrehozva return értékként. viszont maga az érték innen, 1 sorral fentebbről jön, csak kanyargós úton.
        //szóval: 1. Car.java-ban private String model változót létrehozom, majd ugyanott public setModel method-ot készítek.
        //2. itt a Main.java-ban létrehozzuk a porsche változót a new keyworddel, majd porsche.setModel("Carrera"), ezt szippantja majd be a következő lépés
        //3. Car.java-ban public String getModel() >> ennek lesz return értéke
        //4. a return értéket a Main.java-ban már kitudjuk íratni, megfelelően hivatkozva a Car.java-ban lévő return adatra
        //tehát a oda-vissza ugrálunk, és a végén megkapjuk a várt eredményt

        //második modellünk - helden commodo:
        System.out.println("Model is " + holden.getModel());
    }

}
