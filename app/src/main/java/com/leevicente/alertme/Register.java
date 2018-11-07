package com.leevicente.alertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void buttonClickRegister(View v){
        Intent i;
        if (v.getId() == R.id.backLogin) {
            i = new Intent(this, Login.class);
            startActivity(i);
        } else if (v.getId() == R.id.nextPage) {
            i = new Intent(this, Register2.class);
            startActivity(i);
        }
    }
}
