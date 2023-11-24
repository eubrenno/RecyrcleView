package br.com.etecia.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView RecyclerFilmes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerFilmes = findViewById(R.id.RecyclerFilmes);

        RecyclerFilmes.setLayoutManager(new GridLayoutManager(getApplicationContext(),2));
        RecyclerFilmes.setHasFixedSize(true);
        //RecyclerFilmes.setAdapter(adapter);

    }
}