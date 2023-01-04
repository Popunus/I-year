class ArrayBox<T extends Comparable> {
    int size;
    Object[] arr;

    ArrayBox(int c) {
        this.arr = new Object[c];
        this.size = c;
    }

    boolean add(T e) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == e) {
                return false;
            }
        }
        for (int i = 0; i < size; i++) {
            if (arr[i] == null) {
                arr[i] = e;
                return true;
            }
        }
        Object[] arr_temp = new Object[size + 1];
        for (int i = 0; i < arr_temp.length; i++) {
            if (i < size)
                arr_temp[i] = arr[i];
            else
                arr_temp[i] = e;
        }
        size = arr_temp.length;
        arr = arr_temp;
        return true;
    }

    void print() {
        for (Object es : arr)
            System.out.println(es);
    }

    boolean addAll(T[] array) {

        boolean check_array[] = new boolean[array.length];
        int if_any=0;
        for (int i = 0; i < array.length; i++) {
            if (add(array[i]) == true)
                if_any++;
        }
        if(if_any==0)
            return false;
        for (int i = 0; i < array.length; i++) {
            add(array[i]);
            check_array[i] = add(array[i]);
        }

        return true;
    }

    T min() {

        T min = (T) arr[0];
        int i = 0;

        while (i < arr.length) {
            if (min.compareTo((T) arr[i]) > 0)
                min = (T) arr[i];
            i++;
        }
        return min;
    }


    T max() {

        T max = (T) arr[0];
        int i = 0;

        while (i < arr.length) {
            if (max.compareTo((T) arr[i]) < 0)
                max = (T) arr[i];
            i++;
        }
        return max;
    }

    int search(T d) {
        for (int i = 0; i < arr.length; i++) {
            if (d == (T) arr[i]) {
                return i;
            }

        }
        return -1;
    }

    boolean swap(int left, int right) {
        Object temp, temp2;
        if (left < arr.length && right < arr.length) {
            temp = arr[left];
            temp2 = arr[right];
            for (int i = 0; i < arr.length; i++) {
                if (i == left) {
                    arr[i] = temp2;
                }
                if (i == right) {
                    arr[i] = temp;
                    return true;
                }
            }
        }
        return false;
    }

    boolean remove(T h) {
        boolean wpp = false;
        for (Object es : arr) {
            if (es == h) {
                int counter = 0;
                Object[] temp_arr = new Object[arr.length - 1];
                for (int i = 0; i < temp_arr.length; i++) {
                    if (arr[i] != h)
                        temp_arr[i] = arr[counter++];
                }
                arr = temp_arr;
                size = temp_arr.length;
                wpp = true;
                return wpp;
            }
        }
        return wpp;
    }
}

class Osoba implements Comparable<Osoba> {
    String nazwisko;
    int wiek;

    public Osoba(String nazwisko, int wiek) {
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public int getWiek() {
        return wiek;
    }

    public String getNazwisko() {
        return nazwisko;
    }


    @Override
    public String toString() {
        return "Osoba{" +
                "nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    // porównujemy 2 obiekty this, o
    // można korzystać z compareTo(...) z klasy String
    public int compareTo(Osoba o) {
        if (this.getNazwisko().compareTo(o.getNazwisko()) < 0)
            return -1;
        else if (this.getNazwisko().compareTo(o.getNazwisko()) > 0)
            return 1;
        if (this.wiek - o.wiek < 0)
            return -1;
        else if (this.wiek - o.wiek > 0)
            return 1;
        else
            return 0;
    }

}


class Student extends Osoba {
    int numerGrupy;

    public Student(String nazwisko, int wiek, int numerGrupy) {
        super(nazwisko, wiek);
        this.numerGrupy = numerGrupy;
    }


    public String toString() {
        return "Student{" +
                "nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", numerGrupy=" + numerGrupy +
                '}';
    }

    public int compareTo(Osoba o) {
        if (o.getClass() == Student.class) {
            Student s = (Student) o;
            if (this.nazwisko.compareTo(s.nazwisko) < 0)
                return -1;
            if (this.nazwisko.compareTo(s.nazwisko) > 0)
                return 1;
            if (this.wiek - s.wiek < 0)
                return -1;
            if (this.wiek - s.wiek > 0)
                return 1;
            if (this.numerGrupy - s.numerGrupy < 0)
                return -1;
            if (this.numerGrupy - s.numerGrupy > 0)
                return 1;
            else
                return 0;
        } else
            return super.compareTo(o);
        // porównujemy 2 obiekty: this, o

        // jeśli o jest typu Student to
        // Student s = (Student)o;
        // ... s.nrGrupy()...

        // jak sprawdzić typ:
        // if (o instanceof Student)...
        // lub
        // if (o.getClass() == Student.class)

        // ...
        // jeśli o jest tylko typu Osoba
        // ...
        // ... super.compareTo(o)
    }


}




