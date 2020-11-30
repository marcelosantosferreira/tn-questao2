package com.msferreira;

public class Main {

    public static void main(String[] args) {

        int[] vetor = {5, 3, 2, 4, 7, 1, 0, 6};
        int posicaoMax = vetor.length;
        int pElemento; //primeiro elemento (ou à esquerda)
        int sElemento; //segundo elemento (ou à direita)
        int loops = 0;

        //* se o maior número é o último então o MAX da iteração será length-1
        //* iniciar com max iteração = length e decrementar

        while (posicaoMax != 0) {
            for (int i = 0; i < posicaoMax; i++) {

                if ((i + 1) < posicaoMax) {
                    pElemento = vetor[i];
                    sElemento = vetor[i + 1];
                    if (pElemento > sElemento) {
                        vetor[i + 1] = pElemento;
                        vetor[i]= sElemento;

                        System.out.println("\nTrocando " + vetor[i] + " com " + vetor[i + 1]);

                        // Verificando como o vetor está...
                        printVetor(vetor);
                    }
                }

            }
            System.out.println("\n------------------------");
            posicaoMax--;
        }
    }

    public static void printVetor(int[] v){

        for(int i=0;i<v.length;i++){
            System.out.print(v[i]+((i+1)==v.length? "":", "));
        }
    }
}
