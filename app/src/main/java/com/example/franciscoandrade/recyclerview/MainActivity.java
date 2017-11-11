package com.example.franciscoandrade.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.franciscoandrade.recyclerview.controller.MovieAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView movieRecyclerView = (RecyclerView) findViewById(R.id.movie_recyclerview);
        RecyclerView movieRecyclerView2 = (RecyclerView) findViewById(R.id.movie_recyclerview2);


        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Jaws", "Steven Spielberg", "1975", R.drawable.images ));
        movies.add(new Movie("Star Wars", "George Lucas", "1977", R.drawable.images));
        movies.add(new Movie("Iron Man", "Jon Favreau", "2007", R.drawable.images));
        movies.add(new Movie("The Avengers", "Joss Whedon","2011", R.drawable.images));
        movies.add(new Movie("28 Days Later", "Danny Boyle", "2002", R.drawable.images));
        movies.add(new Movie("Guardians of the Galaxy", "James Gunn", "2014", R.drawable.images));
        movies.add(new Movie("Sneakers", "Phil Alden Robinson", "1992", R.drawable.images));
        movies.add(new Movie("Clear and Present Danger", "Phillip Noyce", "1994", R.drawable.images));

        MovieAdapter movieAdapter = new MovieAdapter(movies);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false);

        movieRecyclerView.setAdapter(movieAdapter);
        movieRecyclerView.setLayoutManager(linearLayoutManager);
//        movieRecyclerView.setLayoutManager(new GridLayoutManager(this, 3));



        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        movieRecyclerView2.setAdapter(movieAdapter);
        movieRecyclerView2.setLayoutManager(linearLayoutManager2);
    }
}
