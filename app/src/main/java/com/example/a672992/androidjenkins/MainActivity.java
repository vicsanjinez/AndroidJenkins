package com.example.a672992.androidjenkins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(getApplicationContext(), "hola", Toast.LENGTH_LONG).show();

        Toast.makeText(getApplicationContext(), "hola2", Toast.LENGTH_LONG).show();
        Toast.makeText(getApplicationContext(), "hola firma", Toast.LENGTH_LONG).show();
    }
}
