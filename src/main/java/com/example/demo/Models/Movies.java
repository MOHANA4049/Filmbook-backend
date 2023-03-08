package com.example.demo.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Movies {
@Id
private int id;
private String moviename;
private String actor;
private String actress;
private String director;
private String musiby;
public Movies(int id, String movieName, String director, String actor, String actress, String musiBy) {
	super();
	this.id = id;
	this.moviename = movieName;
	this.actor = actor;
	this.actress = actress;
	this.musiby = musiBy;
	this.director = director;
}
public Movies() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMoviename() {
	return moviename;
}
public void setMoviename(String movieName) {
	this.moviename = movieName;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public String getActor() {
	return actor;
}
public void setActor(String actor) {
	this.actor = actor;
}
public String getActress() {
	return actress;
}
public void setActress(String actress) {
	this.actress = actress;
}
public String getMusiby() {
	return musiby;
}
public void setMusiby(String musiBy) {
	this.musiby = musiBy;
}
}
