package com.javaoo.store;
import java.util.Date;

public class ClassicalCD extends Item {

	public ClassicalCD() {
	}

	public ClassicalCD(String title, double price, int quantity) {
		super(title, price, quantity);
	}
	
	public ClassicalCD(String title, double price, int quantity,
			String composer, String[] performers, String recordingLocation, Date releaseDate) {
		super(title, price, quantity);
		setComposer(composer);
		setRecordingLocation(recordingLocation);
		setReleaseDate(releaseDate);
		
		for(String performer: performers) {
			if(performer != null)
				addPerformer(performer);
		}
	}
	
	public void addPerformer(String performer) {
		if(getPerformerCount() >= performers.length)
			System.err.println("Too many performers!");
		else {
			performers[getPerformerCount()] = performer;
			setPerformerCount(getPerformerCount() + 1);
			
		}
	}
	
	public void showPerformers() {
		if(getPerformerCount() == 0)
			System.err.println("No performers!");
		else {
			for(int i = 1; i < getPerformerCount(); i++)
				System.out.println(performers[i]);
		}
	}
	
	
	public int getPerformerCount() {
		return performerCount;
	}

	public void setPerformerCount(int performerCount) {
		this.performerCount = performerCount;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getRecordingLocation() {
		return recordingLocation;
	}

	public void setRecordingLocation(String recordingLocation) {
		this.recordingLocation = recordingLocation;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	private int performerCount;
	private String composer;
	private String[] performers = new String[5];
	private String recordingLocation;
	private Date releaseDate;

}
