package com.example.practical520;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final EditText e =(EditText) findViewById(R.id.ede1);
        final EditText e1 =(EditText) findViewById(R.id.ede2);
        final EditText e2 =(EditText) findViewById(R.id.ede3);

        Button bb = (Button) findViewById(R.id.btn1);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Name="+e.getText().toString()+"\nage="+e1.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}