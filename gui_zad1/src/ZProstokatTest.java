public class ZProstokatTest {

    public static void main(String[] args) {

        ZProstokat zp[] = {
                new ZProstokat(4, 'a', 'e'),		// konstruktor z 3 parametrami
                new ZProstokat(5, 3 , '*', '+'),	// konstruktor z 4 parametrami
                new ZProstokat(1, 2, 'a','a'),
                new ZProstokat(3, 3, '+', 'x'),
                new ZProstokat(1, 2, 'x', 'y'),
                new ZProstokat(3, 4, '^', '$')
        };

        for (ZProstokat z : zp)
            try {
                z.rysuj();
            } catch(ZProstokatException e) {
                System.out.println(e.getMessage());
            }
    }
}

class ZProstokat{

    private int w, h;

    private char b;	// border
    private char i;

    private  static int p = 1;
    private  static int p2 = 1;

    private   String  name;

    private  int num;
    private  int num2;






    //...

    public ZProstokat(int w, int h, char i, char b){

        this.w=w;
        this.h=h;
        this.i=i;
        this.b=b;


        if(w==h) {
            name = "Kwadrat";
            num = p++;
        }
        else {
            name = "Prostokat";
            num2 = p2++;

        }

    }

    public ZProstokat(int w, char i, char b){
        this(w,w,i,b);
    }



    public void rysuj() throws ZProstokatException {

        int znak;
        if(i==b) {
            znak = w * h;
                System.out.print(this.name+ "(" );
        if(w==h)
            System.out.print(this.num);
        else
            System.out.print(this.num2);
            System.out.print(")"+" rozmiaru " + w + " x " + h + ", " + i + "=" + znak);
            System.out.println();
        }
        if ((h == 1 || w ==1) && i!=b){

            System.out.print(this.name+ "(" );
            if(w==h)
                System.out.print(this.num);
            else
                System.out.print(this.num2);
            System.out.print(")"+" rozmiaru " + w + " x " + h);
            System.out.println();
            throw new ZProstokatException("Bledny Prostokat");

        }
        if(i!=b) {
            int znak1 = (w - 2) * (h - 2);
            int znak2 = w * h - znak1;

            System.out.print(this.name+ "(" );
        if(w==h)
            System.out.print(this.num);
        else
            System.out.print(this.num2);
            System.out.print(")"+" rozmiaru " + w + " x " + h + ", " + i + "=" + znak1 + ", " + b + " =" + znak2);
            System.out.println();
        }


            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (i == 0 || i == h - 1 || j == 0 || j == w - 1)
                        System.out.print(b + " ");
                    else
                        System.out.print(this.i + " ");
                }
                System.out.println();
            }
        }




}

class ZProstokatException extends Exception {

    public ZProstokatException(String message) {
        super(message);
    }
}
