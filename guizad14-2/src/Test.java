import java.lang.Thread;
class Buffer {

    private int[] arr;

    // konstruktor
    public Buffer(int size) {
        this.arr = new int[size];
    }

    //...

    public synchronized void put(int n) {
        int zmienna=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = n;
                break;
            }
        }
        for (int j=0;j<arr.length;j++){
            if(arr[j]!=0)
                zmienna++;
        }

        while (zmienna==arr.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Put: "+n);
        notify();


        //...

        /*
        (pÄ™tla) dopĂłki bufor jest peĹ‚ny
			wait();

        notify();
        */

        //...
    }

/*
		// albo inaczej, za pomocÄ… bloku synchronizowanego
	public void put(int n){

        synchronized (this) {
			//...

			/*
			(pÄ™tla) dopĂłki bufor jest peĹ‚ny
				wait();

			notify();
			*/

    //...


    public synchronized int get() {
        int temp = 0;
        int temp_for_flag=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp = arr[i];
                arr[i] = 0;
                break;
            }
        }
        for (int j=0;j<arr.length;j++) {
            if (arr[j] == 0)
                temp_for_flag++;

        }

        while (temp_for_flag!=arr.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("get: "+temp);
        notify();

        return temp;

        //...

        /*
        (pÄ™tla) dopĂłki bufor jest pusty
			wait();

        notify();
        */

        //...


        // ...
    }
}

class Producer implements Runnable {

    private Buffer buff;

    // konstruktor
    public Producer(Buffer b) {
        this.buff=b;
    }

    @Override
    public void run() {
        while (true){
            int zmienna=(int)(Math.random()*10);
            this.buff.put(zmienna);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                return;
            }

        }
        // ...
        // ...buff.put(...)...
        // usypianie wÄ…tku
        // ...
    }
}

// ...


class Consumer implements Runnable {

    private Buffer buff;

    // konstruktor
    public Consumer(Buffer b) {
        this.buff=b;
    }

    @Override
    public void run() {
        while (true){
            this.buff.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                return;
            }

            // ...
            // ... buff.get() ...
            // usypianie wÄ…tku
            // ...
        }
    }

    // ...
}


public class Test {
    public static void main(String[] args) {

        // ...

        Buffer buffer = new Buffer(10);
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);

        Thread watek_producer = new Thread(producer);
        watek_producer.start();

        Thread watek_consumer = new Thread(consumer);
        watek_consumer.start();

        // utworzenie i uruchomienie wÄ…tkĂłw producenta i konsumenta
        // ...


        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // przerywanie pracy wÄ…tkĂłw producenta i konsumenta
            // ...
            watek_consumer.interrupt();
            watek_producer.interrupt();
        }

        // ...
    }
}
