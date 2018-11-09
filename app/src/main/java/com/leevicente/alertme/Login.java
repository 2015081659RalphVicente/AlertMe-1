package com.leevicente.alertme;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v4.widget.NestedScrollView;
import android.widget.Button;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    private static EditText username;
    private static EditText password;
    private static Button login_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void buttonClickLogin(View v){
        username = (EditText)findViewById(R.id.username);
        password = (EditText)findViewById(R.id.password);
        login_button = (Button)findViewById(R.id.loginBtn);
        Intent i;
        if(!username.getText().toString().trim().equals("") || !password.getText().toString().trim().equals("")){
            if (v.getId() == R.id.loginBtn) {
                if(username.getText().toString().trim().equals("admin") && password.getText().toString().trim().equals("admin")){
                    Toast.makeText(Login.this,"Username and password is correct", Toast.LENGTH_SHORT).show();
                    i = new Intent(this, Main.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(Login.this,"Username and password is NOT correct", Toast.LENGTH_SHORT).show();
                }

            }
        }
        else{
            Toast.makeText(Login.this,"No input in Username and/or Password", Toast.LENGTH_SHORT).show();
        }
    }


//    private void emptyInputEditText(){
//        username.setText(null);
//        password.setText(null);
//    }
}
