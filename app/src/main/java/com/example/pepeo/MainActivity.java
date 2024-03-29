package com.example.pepeo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        String[] languages = {"Wine", "Martini", "Vodka", "Beer", "Shots", "Whiskey","Tequila","Brandy"," Gin","Negroni","Margarita","Mojito","Rum","Bourbon","Champagne"};
        recyclerView.setAdapter(new RecyclerAdapter(languages));

    }
}