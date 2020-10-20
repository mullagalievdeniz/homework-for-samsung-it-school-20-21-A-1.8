package com.company;



import java.util.Scanner;

public class h1h6v2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();


        }


            int curr_max=0,index_max;

            for(int i=0; i<n-1; i++){
                int count = 0;
                for(int j=i+1;j<n;j++){
                    count++;

                }
                if(curr_max<count){
                    curr_max=count;
                    index_max = i;
                }
            }


    }
}
