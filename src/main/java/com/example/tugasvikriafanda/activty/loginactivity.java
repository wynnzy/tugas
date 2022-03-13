package com.example.tugasvikriafanda.activty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasvikriafanda.R;

public class loginactivity extends AppCompatActivity {

    Button login;
    EditText username,password;
    protected void onCreate(Bundle saveIntanceState) {
        super.onCreate(saveIntanceState);

        setContentView(R.layout.login_layout);

        login = (Button) findViewById(R.id.btn_sign_in);
        username = (EditText) findViewById(R.id.Username);
        password = (EditText) findViewById(R.id.Passowrd);

        login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                if (password.getText().toString().toUpperCase().equals("12345")) {
                    login_sukses();

                } else {
                    Toast.makeText(getApplicationContext(), "Salah Password", Toast.LENGTH_LONG).show();

                }
            }
        }
        );

    }

    private void login_sukses() {
        Intent i = new Intent(this,MainActivity.class);
        //kirimkan username ke tampilan utama
        i.putExtra("USERNAME","User");
        startActivity(i);

    }
}

