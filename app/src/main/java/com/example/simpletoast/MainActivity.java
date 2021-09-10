package com.example.simpletoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnClick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick=findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You Pressed a Button", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

//TODO:1.Create Project and Design an xml Layout
//TODO:2.Crate a class of Button and make refrence variable of it.    Line No 11
//TODO:3.findViewById                                                 Line No 18
//TODO:4.Make clickListenter of that Button and                       Line No 19
//TODO://Make Toast,give context,message and duration                 Line No 22