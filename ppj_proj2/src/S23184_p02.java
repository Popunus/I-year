public
    class S23184_p02 {

    public static void main(String[] args) {
        int tab_length=(int)(Math.random()*100);
        char tab_char []=new char[tab_length];
        int tab_int []=new int[tab_length];
        float tab_float []=new float[tab_length];
        double tab_double []=new double[tab_length];

        for(int i=0;i<tab_length;i++){
            tab_char[i]=(char)(Math.random()*100);
            tab_int[i]=(int)(Math.random()*100);
            tab_double[i]=Math.random()*100;
            tab_float[i]=(float)(Math.random()*100);
        }
        sortChar(tab_char);
        sortInt(tab_int);
        sortDouble(tab_double);
        sortFloat(tab_float);

    }
    public static void sortInt(int[ ]numbers){
        long startTime = System.nanoTime();
        int [] insertion=numbers;
        int [] selection=numbers;
        int [] buble=numbers;
        int [] radix=numbers;
        int [] quick=numbers;
        int [] merge=numbers;
        int [] heap=numbers;
        insertionSort(insertion);
        selectionSort(selection);
        bubbleSort(buble);
        radixSort(radix);
        quickSort(quick,0, numbers.length-1);
        mergeSort(merge,0, numbers.length-1);
        heapSort(heap);
        System.out.println("Czas posortowania tablicy int:   "+startTime);


    }
    public static void sortDouble(double[ ]numbers){
        long startTime = System.nanoTime();
        double [] insertion=numbers;
        double [] selection=numbers;
        double [] buble=numbers;
        double [] radix=numbers;
        double [] quick=numbers;
        double [] merge=numbers;
        double [] heap=numbers;
        insertionSort(insertion);
        selectionSort(selection);
        bubbleSort(buble);
        radixSort(radix);
        quickSort(quick,0, numbers.length-1);
        mergeSort(merge,0, numbers.length-1);
        heapSort(heap);
        System.out.println("Czas posortowania tablicy double:"+startTime);
    }
    public static void sortChar(char[ ]numbers){
        long startTime = System.nanoTime();
        char [] insertion=numbers;
        char [] selection=numbers;
        char [] buble=numbers;
        char [] radix=numbers;
        char [] quick=numbers;
        char [] merge=numbers;
        char [] heap=numbers;
        insertionSort(insertion);
        selectionSort(selection);
        bubbleSort(buble);
        radixSort(radix);
        quickSort(quick,0, numbers.length-1);
        mergeSort(merge,0, numbers.length-1);
        heapSort(heap);
        System.out.println("Czas posortowania tablicy char:  "+startTime);
    }
    public static void sortFloat(float[ ]numbers){
        long startTime = System.nanoTime();
        float [] insertion=numbers;
        float [] selection=numbers;
        float [] buble=numbers;
        float [] radix=numbers;
        float [] quick=numbers;
        float [] merge=numbers;
        float [] heap=numbers;

        insertionSort(insertion);
        selectionSort(selection);
        bubbleSort(buble);
        radixSort(radix);
        quickSort(quick,0, numbers.length-1);
        mergeSort(merge,0, numbers.length-1);
        heapSort(heap);
        System.out.println("Czas posortowania tablicy float: "+startTime);
    }


    public static void insertionSort(int[] insertiontab) {

        for (int i = 1; i < insertiontab.length; i++) {
            int key = insertiontab[i];
            int j = i - 1;
            while (j >= 0 && insertiontab[j] > key) {
                insertiontab[j + 1] = insertiontab[j];
                j--;
            }
            insertiontab[j + 1] = key;
        }

    }

    public static void insertionSort(char[] insertiontab) {
        for (int i = 1; i < insertiontab.length; i++) {
            char key = insertiontab[i];
            int j = i - 1;
            while (j >= 0 && insertiontab[j] > key) {
                insertiontab[j + 1] = insertiontab[j];
                j--;
            }
            insertiontab[j + 1] = key;
        }
    }

    public static void insertionSort(float[] insertiontab) {
        for (int i = 1; i < insertiontab.length; i++) {
            float key = insertiontab[i];
            int j = i - 1;
            while (j >= 0 && insertiontab[j] > key) {
                insertiontab[j + 1] = insertiontab[j];
                j--;
            }
            insertiontab[j + 1] = key;
        }
    }

    public static void insertionSort(double[] insertiontab) {
        for (int i = 1; i < insertiontab.length; i++) {
            double key = insertiontab[i];
            int j = i - 1;
            while (j >= 0 && insertiontab[j] > key) {
                insertiontab[j + 1] = insertiontab[j];
                j--;
            }
            insertiontab[j + 1] = key;
        }
    }

    public static void selectionSort(int[] selectiontab) {
        for (int i = 0; i < selectiontab.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < selectiontab.length; j++)
                if (selectiontab[j] < selectiontab[min_idx])
                    min_idx = j;
            int temp = selectiontab[min_idx];
            selectiontab[min_idx] = selectiontab[i];
            selectiontab[i] = temp;
        }
    }

    public static void selectionSort(char[] selectiontab) {
        for (int i = 0; i < selectiontab.length - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < selectiontab.length; j++)
                if (selectiontab[j] < selectiontab[min_idx])
                    min_idx = j;
            char temp = selectiontab[min_idx];
            selectiontab[min_idx] = selectiontab[i];
            selectiontab[i] = temp;
        }
    }

    public static void selectionSort(float[] selectiontab) {
        for (int i = 0; i < selectiontab.length - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < selectiontab.length; j++)
                if (selectiontab[j] < selectiontab[min_idx])
                    min_idx = j;
            float temp = selectiontab[min_idx];
            selectiontab[min_idx] = selectiontab[i];
            selectiontab[i] = temp;
        }
    }

    public static void selectionSort(double[] selectiontab) {
        for (int i = 0; i < selectiontab.length - 1; i++) {

            int min_idx = i;
            for (int j = i + 1; j < selectiontab.length; j++)
                if (selectiontab[j] < selectiontab[min_idx])
                    min_idx = j;
            double temp = selectiontab[min_idx];
            selectiontab[min_idx] = selectiontab[i];
            selectiontab[i] = temp;
        }
    }

    static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static void bubbleSort(double arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static void bubbleSort(float arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    float temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static void bubbleSort(char arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    static int getMax(int arr[]) {
        int n = arr.length;
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    static void countSort(int arr[], int n, int exp) {
        int output[] = new int[n];
        int i;
        int count[] = {0,0,0,0,0,0,0,0,0,0};


        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;


        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];


        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }


        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }


    static void radixSort(int arr[]) {
        int n = arr.length;

        int m = getMax(arr);

        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);

    }

    static int getMax(char arr[]) {
        int n = arr.length;
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }


    static void countSort(char arr[], int n, int exp) {
        char output[] = new char[n];
        int i;
        int count[] = {0,0,0,0,0,0,0,0,0,0};


        for (i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;


        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];


        for (i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }


        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }


    static void radixSort(char arr[]) {
        int n = arr.length;

        int m = getMax(arr);


        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);

    }

    static double getMax(double arr[]) {
        int n = arr.length;
        double mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }


    static void countSort(double arr[], int n, int exp) {
        double output[] = new double[n];
        int i;
        int count[] = {0,0,0,0,0,0,0,0,0,0};


        for (i = 0; i < n; i++)
            count[(int) ((arr[i] / exp) % 10)]++;


        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];


        for (i = n - 1; i >= 0; i--) {
            output[count[(int) ((arr[i] / exp) % 10)] - 1] = arr[i];
            count[(int) ((arr[i] / exp) % 10)]--;
        }


        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }


    static void radixSort(double arr[]) {
        int n = arr.length;

        double m = getMax(arr);

        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);

    }

    static float getMax(float arr[]) {
        int n = arr.length;
        float mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }

    static void countSort(float arr[], int n, int exp) {
        float output[] = new float[n];
        int i;
        int count[] = {0,0,0,0,0,0,0,0,0,0};


        for (i = 0; i < n; i++)
            count[(int) ((arr[i] / exp) % 10)]++;

        for (i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (i = n - 1; i >= 0; i--) {
            output[count[(int) ((arr[i] / exp) % 10)] - 1] = arr[i];
            count[(int) ((arr[i] / exp) % 10)]--;
        }

        for (i = 0; i < n; i++)
            arr[i] = output[i];
    }

    static void radixSort(float arr[]) {
        int n = arr.length;

        float m = getMax(arr);

        for (int exp = 1; m / exp > 0; exp *= 10)
            countSort(arr, n, exp);

    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (arr[j] < pivot) {

                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {


            int pi = partition(arr, low, high);


            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(char[] arr, int low, int high) {

        char pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {


            if (arr[j] < pivot) {

                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(char[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void swap(double[] arr, int i, int j) {
        double temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(double[] arr, int low, int high) {

        double pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            if (arr[j] < pivot) {

                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(double[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void swap(float[] arr, int i, int j) {
        float temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(float[] arr, int low, int high) {

        float pivot = arr[high];

        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {


            if (arr[j] < pivot) {

                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    static void quickSort(float[] arr, int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void merge(char arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        char L[] = new char[n1];
        char R[] = new char[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(char arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }

    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void merge(float arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        float L[] = new float[n1];
        float R[] = new float[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(float arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void merge(double arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;

        double L[] = new double[n1];
        double R[] = new double[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        int i = 0, j = 0;
        int k = l;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(double arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2;

            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
    }

    public static void heapSort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static void heapSort(char arr[]) {
        int n = arr.length;


        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {

            char temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, i, 0);
        }
    }


    public static void heapify(char arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;


        if (largest != i) {
            char swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;


            heapify(arr, n, largest);
        }
    }

    public static void heapSort(double arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {
            double temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }


    public static void heapify(double arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            double swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void heapSort(float arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        for (int i = n - 1; i > 0; i--) {
            float temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void heapify(float arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            float swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }





}




