package com.company;

public class Main {
    public static void main(String[] args){
        int a[] = new int[5];
        a[0]=34;
        a[1]=29;
        a[2]=69;
        a[3]=33;
        a[4]=62;

        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length - 1;j++){
                if (a[j]>a[j+1]){
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j]=temp;
                }
            }
        }

        for (int i=0;i<a.length;i++){
            System.out.print(a[i]);
            System.out.println("");
        }
    }

}