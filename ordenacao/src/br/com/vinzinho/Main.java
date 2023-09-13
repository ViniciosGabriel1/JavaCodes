package br.com.vinzinho;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       int [] numbers = new int []{10,30,3,2,1,5,2,3,57,8,112,12,1000,12345,343434,534545,-1,0,-2000,0,7,};
        Arrays.sort(numbers);



        System.out.println(Arrays.toString(numbers));
    }
}