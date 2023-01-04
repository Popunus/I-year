abstract class Figura  {

    private int x, y;

    // konstruktor
    public Figura(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    // metody abstrakcyjne
    public abstract String fig();
    public abstract void pozycja(int x, int y);

    @Override
    public String toString()
    {
        return fig();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


}


class Kolo extends Figura {

    private int promien;

    // konstruktor
    public Kolo(int x, int y, int r)
    {
        super(x,y);
        promien=r;

    }

    @Override
    public String fig() {
        return "Koło";
    }

    @Override
    public void pozycja(int x, int y)
    {
        double b=2;
        int odleglosc=(int)Math.sqrt((int)Math.pow((((double)((x-getX())))+((double)(y-getY()))), b));

    if(odleglosc<=promien) {
        System.out.println("Punkt("+x+","+y+")"+"znajduje sie wewnatrz kola");
    }
    if(odleglosc>promien){
        System.out.println("Punkt("+x+","+y+")"+"znajduje sie na zewnatrz kola");
    }
    }

    @Override
    public String toString()
    {
        return super.toString()+"\nSrodek -("+getX()+","+getY()+")"+"\nPromien -"+promien;
    }


    //...
}

class Prostokat extends Figura  {

    protected int szer, wys;

    // konstruktor
    public Prostokat(int x, int y, int s, int w)
    {
        super(x,y);
        szer=s;
        wys=w;

    }



    @Override
    public String fig() {
        return "Prostokat";
    }

    @Override
    public void pozycja(int x, int y)
    {
        boolean a=false;
        boolean b=false;
        if(x>getX()-wys&&x<getX()){
            a=true;
        }
        if(y>getY()-szer&&y<getY()){
            b=true;
        }
        if(a && b && a && b){
            System.out.println("Punkt("+x+","+y+")"+"znajduje sie  wewnatrz prostokata");
        }
        else
            System.out.println("Punkt("+x+","+y+")"+"znajduje sie na zewnatrz prostokata");
    }

    @Override
    public String toString()
    {
        return super.toString() + "\nLewy górny - (" + getX() + ',' + getY() + ")" + "\nSzerokość: " + szer + ", " + "Wysokość: " + wys + "\n";
    }

}






