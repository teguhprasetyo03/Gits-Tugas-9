package com.kelascoding.tugas9;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class Login extends AppCompatActivity {
    TextInputLayout edtEmail,edtPass;
    AppCompatButton btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Menghilangkan Title Bar
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        setContentView(R.layout.activity_login);
        edtEmail = findViewById(R.id.edtEmail);
        edtPass = findViewById(R.id.edtPass);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logicLogin();
            }
        });

    }

    private void logicLogin() {
        String text = String.valueOf(edtEmail.getEditText().getText());
        String pass =  String.valueOf(edtPass.getEditText().getText());
        if (text.isEmpty() || pass.isEmpty()) {
            Toast.makeText(this, "data harus di isi", Toast.LENGTH_SHORT).show();
        } else  if (text.equals("anditeguh185@gmail.com") && pass.equals("andi")){
            startActivity(new Intent(Login.this, MainActivity.class));
            finish();
        } else {
            Toast.makeText(this, "pass salah", Toast.LENGTH_SHORT).show();
        }
    }
}