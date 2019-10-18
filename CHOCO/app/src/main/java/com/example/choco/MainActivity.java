package com.example.choco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn_1(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class );
        startActivity(intent);
    }

    public void btn_2(View view) {
        Intent intent = new Intent(MainActivity.this, activity_third.class );
        startActivity(intent);
    }

    public void btn_3(View view) {
        Intent intent = new Intent(MainActivity.this, activity_fourth.class );
        startActivity(intent);
    }

    public void btn_4(View view) {
        Intent intent = new Intent(MainActivity.this, activity_fifth.class );
        startActivity(intent);
    }

    public void btn_5(View view) {
        Intent intent = new Intent(MainActivity.this, activity_sixth.class );
        startActivity(intent);
    }
}
