abstract class Spiewak implements Comparable<Spiewak> {
    private String nazwisko;
    private int numerspiewaka;
    private static int numer = 1;

    public Spiewak(String nazwisko) {
        this.nazwisko = nazwisko;
        numerspiewaka = numer;
        numer++;
    }

    public abstract String spiewaj();


    public String toString() {
        return "(" + numerspiewaka + ") " + nazwisko + ": " + spiewaj();
    }

    public int suma() {

        boolean[] isItThere = new boolean[Character.MAX_VALUE];
        for (int i = 0; i < spiewaj().length(); i++) {
            isItThere[spiewaj().charAt(i)] = true;
        }

        int count = 0;
        for (int i = 0; i < isItThere.length; i++) {
            if (isItThere[i] == true) {
                count++;
            }
        }

        return count;
    }

    public int alfabet() {
        int a = Spiewak.this.nazwisko.charAt(0);
        return a;
    }


    public static Spiewak najglosniej(Spiewak[] tablica) {
        Spiewak podstawa = null;
        int najliter = 0;
        for (Spiewak obecny : tablica) {
            String spiew = obecny.spiewaj();
            int litera = 0;
            int sumaliter = 0;
            for (int i = 1; i < 255; i++) {

                for (int j = 0; j < spiew.length(); j++) {

                    if (spiew.charAt(j) == i)
                        litera++;

                }
                if (litera > 0) {
                    sumaliter++;
                }

            }
            if (sumaliter > najliter) {
                najliter = sumaliter;
                podstawa = obecny;
            }
        }
        return podstawa;
    }

    public int compareTo(Spiewak a) {
        if (this.suma() - a.suma() > 0) {
            return -1;
        } else if (this.suma() - a.suma() < 0) {
            return 1;
        }
        if (this.alfabet() - a.alfabet() < 0) {
            return -1;
        }
        if (this.alfabet() - a.alfabet() > 0) {
            return 1;
        }

        if (this.numerspiewaka - a.numerspiewaka < 0) {
            return -1;
        }
        if (this.numerspiewaka - a.numerspiewaka > 0) {
            return 1;
        } else
            return 0;

    }
}