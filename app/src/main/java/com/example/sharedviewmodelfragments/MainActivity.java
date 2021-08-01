package com.example.sharedviewmodelfragments;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;

import com.example.sharedviewmodelfragments.fragments.FragmentA;
import com.example.sharedviewmodelfragments.fragments.FragmentB;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.container_a, new FragmentA())
                .add(R.id.container_b, new FragmentB())
                .commit();
    }
}