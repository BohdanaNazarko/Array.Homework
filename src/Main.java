public class Main {
    public static void main(String[] args) {
        int[] array = {2, 5, -3, 11, 193, -2};
        int[] sumNew = new int[array.length - 1];
        for (int i = 0; i < array.length - 2; i++) {
            sumNew[i] = array[i] + array[i + 1];
        }
        for (int o : sumNew)//take one number from array and print it
            System.out.print(o + " ");

        System.out.println("Homework 2");
        int[] ar = {10, 7, 5, 2};
        int[] difference = new int[ar.length - 1];
        for (int h = 0; h <= ar.length - 2; h++)
            difference[h] = ar[h] - ar[h + 1];
        for (int k : difference) {
            System.out.print(k + " ");
        }

        System.out.println("Homework 3");
        int[] values = {-3, 2, 5, 4, 7};
        boolean result = true;
        for (int N = 1; result = true && N < 5; N++) {
            if (values[N] < values[N - 1])
                result = false;
        }
        System.out.println(result);


        System.out.println("Homework 4");

        int[] array1 = {5, 4, -7, -2, -1};
        int[] reversed = new int[array1.length];
        int a = 0;
        for (int i = array1.length - 1; i >= 0; i--) {
            reversed[a] = array1[i];
            a++;
        }
        for (int r : reversed)
            System.out.println(r);

        System.out.println("Homework 5");

        int[] originalArray = {-3, 2, 6, -11};
        int[] cumulativeSum = new int[originalArray.length];
        int cumulSum= 0;
        for (int g = 0; g <= originalArray.length - 1; g++) {
            cumulativeSum[g]=cumulSum += originalArray[g];
        }
        for (int c : cumulativeSum)
            System.out.println(c);

        /*System.out.println("Homework 6");
        int[] array2={4,-3,-5,9,1,11};
        int m=1;
        for (int k=0;k<=array2.length-1;k++){
            if (array2[k]<m){
            }
            else
        }*/


    }
}



