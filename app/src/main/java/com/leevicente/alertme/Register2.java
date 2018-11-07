package com.leevicente.alertme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);
    }

    public void buttonClickRegister2(View v){
        Intent i;
        if (v.getId() == R.id.backPage1) {
            i = new Intent(this, Register.class);
            startActivity(i);
        } else if (v.getId() == R.id.nextpage2) {
            i = new Intent(this, Register3.class);
            startActivity(i);
        }
    }
}
