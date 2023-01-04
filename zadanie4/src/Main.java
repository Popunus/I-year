

public class Main {

    public static void main(String[] args) {
        Flyable sokol = new Bird();
        sokol.drive();
        sokol.distance();
        Speakable sokols = new Bird();
        sokols.speak();

        Flyable mitsubishizero = new Plane();
        mitsubishizero.drive();
        mitsubishizero.distance();
        Speakable mitsubishizeros = new Plane();
        mitsubishizeros.speak();

        Flyable area51 = new UFO();
        area51.drive();
        area51.distance();
        Speakable area51s = new UFO();
        area51s.speak();

        Flyable korona = new Virus();
        korona.drive();
        korona.distance();
        Speakable koronas = new Virus();
        koronas.speak();

        Flyable  a[]={korona,sokol,area51,mitsubishizero};
        for (Flyable s : a)
            System.out.println(s);

        System.out.println("\n"+ "najkrotszy:"+ Flyable.najkrotszy(a));
        Speakable b[]={koronas,sokols,area51s,mitsubishizeros};

        System.out.println("\n"+ "najgosniejszy: "+ Speakable.najglosniejszy(b));
    }

}