package com.example.franciscoandrade.recyclerview.view;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.franciscoandrade.recyclerview.Movie;
import com.example.franciscoandrade.recyclerview.R;

/**
 * Created by franciscoandrade on 11/11/17.
 */

public class MovieViewHolder extends RecyclerView.ViewHolder {


    private TextView title;
    private TextView director;
    private TextView year;
    private ImageView picture;

    public MovieViewHolder(View itemView) {
        super(itemView);
        title = (TextView) itemView.findViewById(R.id.movie_title_textview);
        director = (TextView) itemView.findViewById(R.id.movie_director_textview);
        year = (TextView) itemView.findViewById(R.id.movie_year_textview);
        picture = (ImageView)itemView.findViewById(R.id.movie_picture_imageview);

    }

    public void onBind(Movie movie) {
        title.setText("Title: " + movie.getTitle());
        director.setText("Director: " + movie.getDirector());
        year.setText("Year: " + movie.getYear());
        picture.setImageResource(movie.getPicture());

    }
}
