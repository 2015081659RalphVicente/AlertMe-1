package com.leevicente.alertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register3);
    }

    public void buttonClickRegister3(View v){
        Intent i;
        if (v.getId() == R.id.backPage2) {
            i = new Intent(this, Register2.class);
            startActivity(i);
        } else if (v.getId() == R.id.registerDone) {
            i = new Intent(this, Login.class);
            startActivity(i);
        }
    }
}
