package chapter3;

import java.util.Scanner;

public class BinSearch {
   
    //end condition
    //if indc === key : success
    //if indf > indl :fail
    static int binSearch(int[] a, int n , int key){
        
        int indf = 0; //firstIndex Of the search Range;
        int indl = n - 1; // last Index Of the search Range;

        do{
            int indc = (indf + indl) / 2; //center index of the search Range;
            if(key == a[indc]){
                return indc;
            }else if(a[indc] < key){
                indl = indc + 1;
            }else{
                indf = indc - 1;
            }

        }while(indf<indl);

        return -1;//검색실패
    }


    public static void main(String[] args) {
        
        Scanner stdIn = new Scanner(System.in);
        
        System.out.println("the number Of the elements");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("enter in ascending order");

        x[0] = stdIn.nextInt();

        for(int i = 1; i<num ;i++){
            do{
                System.out.println("x["+i+"] :");
                x[i]=stdIn.nextInt();

            }while(x[i] < x[i-1]);

        }

        System.out.println("검색할 값:");
        int ky = stdIn.nextInt();

        int idx = binSearch(x, num, ky);

        if(idx == -1){
            System.out.println("doesn't exist");
        }else{
            System.out.println("it locates at the index of"+idx+".");
        }


        stdIn.close();

    }
}

