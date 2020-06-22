package com.example;
import java.util.*;

public class TriangullarPattern {

        public static void  invert(int n)
        {
            if(n==0)
            {
                System.out.print(n+ " ");
            }
            else
            {
                System.out.print(n+" ");
                invert(n-1);
                System.out.print(n+" ");
            }

        }
    }

    class num{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any positive number : ");
        int i= sc.nextInt();
        TriangullarPattern tr = new TriangullarPattern();
        tr.invert(i);
    }
}

