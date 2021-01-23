package chapter3;

import java.util.Scanner;

public class SeqSearchFor {

    static int seqSearch(int[] a, int n, int key){
        for(int i = 0; i < n ;i++){
            if(a[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("num of elements");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for(int i = 0; i < num; i++){
            System.out.println("x["+i+"]");
            x[i]=stdIn.nextInt();
        }
     System.out.println("value :");   
     int ky = stdIn.nextInt();

     int idx = seqSearch(x, num, ky);

     if(idx == -1)
            System.out.println("doesn't exist ");
     else
            System.out.println("exist : x["+idx+"]" );
    
    stdIn.close();
    }
}
