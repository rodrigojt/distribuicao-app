package com.dmf.distribuicaoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void realizarLogin(View view) {
        redirecionarParaTelaPrincipal();
    }

    private void redirecionarParaTelaPrincipal() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}
