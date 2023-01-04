interface Flyable {
    public String drive();


    public double distance();

    public static Flyable najkrotszy(Flyable[] tablica){
        double najk=tablica[0].distance();
        Flyable kto=tablica[0];

        for(Flyable obecny:tablica){
            if(najk>obecny.distance()){
                najk=obecny.distance();
                kto=obecny;
            }


        }
        return kto;
    }

}

interface Speakable {
    public String speak();
    public static Speakable najglosniejszy(Speakable[] tablica){
        Speakable kto=tablica[0];
        for(Speakable obecny:tablica){
        if(kto.speak().length()<obecny.speak().length())
            kto=obecny;
        }
        return kto;
    }




}

class Plane implements Flyable, Speakable {


    @Override
    public String drive() {
        return "silnik";
    }

    @Override
    public double distance() {
        return 100;
    }

    @Override
    public String speak() {
        return "siuuuu";
    }
    public String toString() {
        return getClass().getName()+" "+drive()+" "+distance()+" "+ speak();
    }

}

class UFO implements Flyable, Speakable {


    @Override
    public String drive() {
        return "napęd nieznany";
    }

    @Override
    public double distance() {
        return 10000;
    }

    @Override
    public String speak() {
        return "????????";
    }
    public String toString() {
        return getClass().getName()+" "+drive()+" "+distance()+" "+ speak();
    }
}

class Virus implements Flyable, Speakable {


    @Override
    public String drive() {
        return "brak";
    }

    @Override
    public double distance() {
        return 1;
    }

    @Override
    public String speak() {
        return "0";
    }
    public String toString() {
        return getClass().getName()+" "+drive()+" "+distance()+" "+ speak();
    }
}

class Bird implements Flyable, Speakable {


    @Override
    public String drive() {
        return "skrzydlo";
    }

    @Override
    public double distance() {
        return 10;
    }

    @Override
    public String speak() {
        return "cwircwir";
    }

    public String toString() {
        return getClass().getName()+" "+drive()+" "+distance()+" "+ speak();
    }


}


