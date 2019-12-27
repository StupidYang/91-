package com.ncu.iqiyi.dao;

import com.ncu.iqiyi.entity.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface MovieDao {

    @Select("select * from movie where name like \"%\"#{name}\"%\"")
    List<Movie> findByName(String name);
}
