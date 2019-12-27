package com.ncu.iqiyi.service;

import com.ncu.iqiyi.entity.Movie;

import java.util.List;

public interface MovieService {

    List<Movie> findByName(String name);
}
