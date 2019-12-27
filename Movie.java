package com.ncu.iqiyi.entity;

import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public class Movie implements Serializable {
    private Integer id;
    private String name;
    private String director;
    private String star;
    private String location;
    private String time;
    private Double length;
    private String info;
    private String movieurl;
    private String imgurl;

    public Movie() {
    }

    public Movie(Integer id, String name, String director, String star, String location, String time, Double length, String info, String movieurl, String imgurl) {
        this.id = id;
        this.name = name;
        this.director = director;
        this.star = star;
        this.location = location;
        this.time = time;
        this.length = length;
        this.info = info;
        this.movieurl = movieurl;
        this.imgurl = imgurl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getMovieurl() {
        return movieurl;
    }

    public void setMovieurl(String movieurl) {
        this.movieurl = movieurl;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", director='" + director + '\'' +
                ", star='" + star + '\'' +
                ", location='" + location + '\'' +
                ", time='" + time + '\'' +
                ", length=" + length +
                ", info='" + info + '\'' +
                ", movieurl='" + movieurl + '\'' +
                ", imgurl='" + imgurl + '\'' +
                '}';
    }
}
