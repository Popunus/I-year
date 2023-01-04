public class Guitest {
    public static void main(String[] args) {
        ArrayBox<Osoba>  bo = new ArrayBox<>(2);

        bo.add(new Osoba("Kowalski", 19));
        bo.add(new Student("Kowalska", 18, 100));
        bo.add(new Student("Kowalska", 20, 200));

        Osoba[] to = new Osoba[] {new Osoba("Nowak", 21), new Student("Nowak", 22, 200)};
        bo.addAll(to);
        System.out.println("TEST 1");
        bo.print();
        System.out.println("min element:\n"+bo.min());
        System.out.println("max element:\n"+bo.max());
        System.out.println(bo.swap(1,2));
        System.out.println(bo.swap(1,20));
        System.out.println("swap");
        bo.print();
        System.out.println();
        System.out.println("TEST2");
        ArrayBox<Student> bst = new ArrayBox<>(1);
        bst.add(new Student("Nowacka", 24, 100));
        bst.add(new Student("Nowacka", 24, 300));
        bst.add(new Student("Nowacka", 24, 200));

        ArrayBox<Integer> bi = new ArrayBox<>(2);
        Integer[] ti = new Integer[] {Integer.valueOf(1), 2, 3};
        bi.addAll(ti);

        bi.print();                                                                          // 1, 2, 3

        ArrayBox<String> bs = new ArrayBox<>(1);
        String[] ts = new String[] {"cpp", new String("java")};
        bs.addAll(ts);
        bs.swap(0,1);
        bs.print();                                                                         // java, cpp
        System.out.println("search");
        System.out.println(bs.search("cpp"));
        System.out.println(bs.search("cwp"));
        System.out.println("remove");
        bs.remove("cpp");
        bs.print();
    }
}
