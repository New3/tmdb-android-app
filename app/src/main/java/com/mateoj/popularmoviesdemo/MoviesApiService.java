package com.mateoj.popularmoviesdemo;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by jose on 10/6/15.
 */
public interface MoviesApiService {
    @GET("/discover/movie?primary_release_date.gte=2014-09-15&primary_release_date.lte=2019-10-22&sort_by=popularity.desc")
    void getPopularMovies(Callback<Movie.MovieResult> cb);
}
