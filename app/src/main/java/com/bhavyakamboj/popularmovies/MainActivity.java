package com.bhavyakamboj.popularmovies;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements MoviesFragment.OnMovieSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(savedInstanceState == null){
            FragmentManager fm = getSupportFragmentManager();
            Fragment fragment = fm.findFragmentById(R.id.container);
            if(fragment == null){
                fragment = MoviesFragment.newInstance(null,null);
                fm.beginTransaction()
                        .add(R.id.container,fragment)
                        .commit();
            }
        }
    }

    @Override
    public void onMovieSelection(String movieId) {

    }
}