package com.example.onasume.startupeau;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    public void BtnOK() {
        MyDialog myDialog1 = new MyDialog();
        myDialog1.MyDialog(this,"บันทึก","บันทึกแล้วครับ");

    }
}
