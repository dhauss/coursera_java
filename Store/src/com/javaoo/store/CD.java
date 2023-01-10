package com.javaoo.store;
import java.util.Date;

public class CD extends Item {

	public CD() {}

	public CD(String title, double price, int quantity) {
		super(title, price, quantity);
	}
	
	public CD(String title, double price, int quantity, Artist artist, Date releaseDate) {
		super(title, price, quantity);
		setArtist(artist);
		setReleaseDate(releaseDate);
	}
	
	
	
	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}



	private Artist artist;
	private Date releaseDate;

}
