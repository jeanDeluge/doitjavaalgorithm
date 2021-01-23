package chapter3;

import java.util.Scanner;

public class SeqSearchSenToFor {
    static int seqSearchSen(int[] a, int n , int key){

        int idx = 0;

        a[n] = key; //add sentinel

        for(int i = 0; i < n ; i++){
            if(a[i] == key)
                break;
            idx++;
        }
        return idx == n ? -1 : idx; 
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("요솟수: " );
        int num = stdIn.nextInt();
        int x[] = new int[num+1];
        for(int i = 0; i < num; i++){
            System.out.println("x["+i+"]");
            x[i] = stdIn.nextInt();
        }

        System.out.println("검색할 ");
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if(idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println(ky+"은(는) x["+idx+"]에 있습니다." );

        stdIn.close();
    }
}
