package com.example.franciscoandrade.recyclerview.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.franciscoandrade.recyclerview.Movie;
import com.example.franciscoandrade.recyclerview.R;
import com.example.franciscoandrade.recyclerview.view.MovieViewHolder;

import java.util.List;

/**
 * Created by franciscoandrade on 11/11/17.
 */

public class MovieAdapter extends RecyclerView.Adapter<MovieViewHolder>{


    private List<Movie> movieList;

    public MovieAdapter(List<Movie> movieList) {
        this.movieList = movieList;
    }


    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.movie_itemview, parent, false);
        return new MovieViewHolder(childView);    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie movie = movieList.get(position);
        holder.onBind(movie);
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }
}
