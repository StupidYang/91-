package com.ncu.iqiyi.controller;

import com.ncu.iqiyi.entity.Movie;
import com.ncu.iqiyi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieService movieService;

    @RequestMapping("/search")
    public List<Movie> findByName(@RequestParam String name){
        System.out.println(name);
        List<Movie> list = movieService.findByName(name);
        for (Movie movie : list) {
            System.out.println(movie.toString());
        }
        return list;
    }
}