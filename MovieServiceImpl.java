package com.ncu.iqiyi.service.impl;

import com.ncu.iqiyi.dao.MovieDao;
import com.ncu.iqiyi.entity.Movie;
import com.ncu.iqiyi.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieDao movieDao;

    @Override
    public List<Movie> findByName(String name) {
        return movieDao.findByName(name);
    }
}
