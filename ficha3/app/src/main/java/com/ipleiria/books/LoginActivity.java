package com.ipleiria.books;

import android.os.Bundle;

import android.widget.Button; // <- Must import
import android.widget.EditText; // <- Must Import
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    String userPsw = "";
    String userEmail = "";

    EditText tbEmailLogin;
    EditText tbPasswordLogin;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        // Referências aos elementos do layout
        // (é nessesário buscar primeiro as referencias para trabalhar com as instancias)
        tbEmailLogin = findViewById(R.id.tbEmail);
        tbPasswordLogin = findViewById(R.id.tbPassword);
        btnLogin = findViewById(R.id.btnLogin);

        // Ação do botão
        btnLogin.setOnClickListener(v -> {
            userEmail = tbEmailLogin.getText().toString();
            userPsw = tbPasswordLogin.getText().toString();

            if (userEmail.isEmpty() || userPsw.isEmpty()) {
                Toast.makeText(this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Login com sucesso: " + userEmail, Toast.LENGTH_SHORT).show();
            }
        });
    }
}