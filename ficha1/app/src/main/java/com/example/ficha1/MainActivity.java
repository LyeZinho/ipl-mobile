package com.example.ficha1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        int val1 = 3;
        int val2 = 10;
        boolean result = eMaiorIf(val1, val2);

        if (result == true){
            System.out.println("Primeiro numero é maior que o segundo!");
        } else {
            System.out.println("Segundo numero é maior que o primeiro!");
        }

        Estatistica est = new Estatistica();

        //[12, 14, 10, 15, 8, 6, 18, 9, 17, 11]
        float[] notas = {12, 14, 10, 15, 8, 6, 18, 9, 17, 11};

        System.out.println("Média de notas: " + est.calcMedia(notas));

        System.out.println("Média de notas fre: " + est.calcMediaForeach(notas));

        System.out.println("Porcentagem positivas: " + est.calcPercentagemPositivos(9, notas));

        System.out.println("Porcentagem positivas fre: " + est.calcPercentagemPositivosForeach(9, notas));

    }

    boolean eMaiorIf(int valor1, int valor2) {
        return valor1 > valor2 ? true : false;
    }
}

