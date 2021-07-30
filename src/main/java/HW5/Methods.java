package HW5;

import java.util.Arrays;

public class Methods extends Thread {
     static final int size = 100000;
     static final int h = size / 2;
     static float[] arr = new float[size];
     static float[] arr1 = new float[size];


    public static void main(String[] args) {
        Methods method = new Methods();
        method.full();
        method.full1();
        System.out.println(Arrays.equals(arr, arr1));
    }
     public static void full() {
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
         for (int i = 0; i < arr.length; i++) {
             arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
         }
         System.out.println("Время выполнения  метода 1 = " +(System.currentTimeMillis() - a));
     }


     public static void full1() {
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        Arrays.fill(arr1, 1);
        long a = System.currentTimeMillis();
        System.arraycopy(arr1, 0, a1, 0, h);
        System.arraycopy(arr1, h, a2, 0, h);

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < a1.length; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = h; i < a2.length; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        t1.start();
        t2.start();


         System.arraycopy(a1, 0, arr1, 0, h);
        System.arraycopy(a2, 0, arr1, h, h);

        System.out.println("Время выполнения всего метода 2 = " + (System.currentTimeMillis() - a));
     }

}
