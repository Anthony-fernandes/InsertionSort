package br.com.fafic;

import java.util.Arrays;

public class insertionSort {

    public static void main(String[] args) {

        int[] vetor = {1,3,2,6,4,8,7,5,10,9};

        int pivor;

        for(int i = 1; i < vetor.length; i++ ){
            pivor = vetor[i];
            int j = i -1;
            while( j>= 0 && pivor < vetor[j] ){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = pivor;
        }

        System.out.println(Arrays.toString(vetor));
    }
}
