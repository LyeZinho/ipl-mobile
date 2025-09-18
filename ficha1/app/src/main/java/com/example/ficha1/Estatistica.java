package com.example.ficha1;

public class Estatistica {

    float calcMedia(float[] valores) {
        float sum = 0;
        for (int i = 0; i < valores.length; i++) {
            sum += valores[i];
        }
        return sum / valores.length;
    };

    float calcMediaForeach(float[] valores) {
        float sum = 0;
        for (float num : valores) {
            sum += num;
        }
        return sum / valores.length;
    };

    boolean calcMaior(float valor1, float valor2) {
        return valor1 > valor2;
    }

    boolean calcMenor(float valor1, float valor2) {
        return valor1 < valor2;
    }

    float sumArr(float[] arraySoma){
        float sum = 0;
        for (int i = 0; i < arraySoma.length; i++) {
            sum += arraySoma[i];
        }
        return sum;
    }

    float sumArrForeach(float[] arraySoma){
        float sum = 0;
        for (float num : arraySoma) {
            sum += num;
        }
        return sum;
    }

    float sumArrCond(float[] arraySoma, float condicao){
        float sum = 0;
        for (int i = 0; i < arraySoma.length; i++) {
            sum += arraySoma[i] > condicao ?  arraySoma[i] : 0; // caso Maior que a condição soma
        }

        return sum;
    }

    float sumArrCondForeach(float[] arraySoma, float condicao){
        float sum = 0;
        for (float num : arraySoma) {
            sum += num > condicao ?  num : 0;
        }

        return sum;
    }

    int sumArrCondCounter(float[] arraySoma, float condicao){
        int sum = 0;
        for (int i = 0; i < arraySoma.length; i++) {
            sum += arraySoma[i] > condicao ?  1 : 0; // caso Maior que a condição soma
        }
        return sum;
    }

    int sumArrCondCounterForeach(float[] arraySoma, float condicao){
        int sum = 0;
        for (float num : arraySoma) {
            sum += num > condicao ?  1 : 0;
        }
        return sum;
    }

    float calcPercentagemPositivos(float limPos, float[] v) {
        float sumCounter = sumArrCondCounter(v, limPos);
        return  ( sumCounter / v.length ) * 100;
    }

    float calcPercentagemPositivosForeach(float limPos, float[] v) {
        float sumCounter = sumArrCondCounterForeach(v, limPos);
        return  ( sumCounter / v.length ) * 100;
    }
}