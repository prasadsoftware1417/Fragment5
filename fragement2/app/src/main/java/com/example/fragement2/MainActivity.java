package com.example.fragement2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static FragmentManager fragementManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragementManager = getSupportFragmentManager();
        FragmentTransaction ft = fragementManager.beginTransaction();
        ft.add(R.id.f1, new personal(), "1");
        ft.commit();


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        ;
    }
}