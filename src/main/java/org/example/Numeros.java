package org.example;

public class Numeros {


    public static void negativNumber(){
        int[] numbers= {1,5,-8,4,-25};
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]<0){
                System.out.println(numbers[i]);
            }
        }
    }

    public static void smalestNumber(){
        int[] numbers={1,5,7,23,-4,-8};
        int min=numbers[0];
        for(int i=0;i<numbers.length; i++){
            if (numbers[i]<min)
                min=numbers[i];
        }
    }
}