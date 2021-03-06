//package com.globussoft;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class Question2 {
    static long dp[];
    public static void main(String arg[]){
        dp=new long[41];
        Arrays.fill(dp,-1);
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        for (int j=0;j<N;j++){
            int val=sc.nextInt();
            HashSet<Integer> listofPrime=setPrime(val);      
            System.out.println(listofPrime.size());
        }
    }
    static boolean isPrime(int a){
        for (int i=2;i*i<=a;i++){
            if(a%i==0)
                return false;
        }
        return true;
    }
    static HashSet<Integer> setPrime(int n){
    	HashSet<Integer> hs=new HashSet<>();
        for (int i=2;i<n;i++){
            if(isPrime(i))
                hs.add(i);
        }
       return hs;
    }

}