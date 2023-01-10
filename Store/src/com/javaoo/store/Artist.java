package com.javaoo.store;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;

public class Artist {
	
	public Artist() {
		memberNames = new TreeSet<String>();
		memberInstruments = new TreeMap<String, SortedSet<String>>();
	}
	
	public Artist(String name, Map<String, SortedSet<String>> memberInstruments, SortedSet<String> memberNames) {
		super();
		this.name = name;
		this.memberInstruments = memberInstruments;
		this.memberNames = memberNames;
	}

	public Artist(String name) {
		this();
		setName(name);
	}
	
	public void addMember(String name, SortedSet<String> instruments) {
		memberNames.add(name);
		memberInstruments.put(name,  instruments);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public SortedSet<String> getMembers(){
		return memberNames;
	}

	public SortedSet<String> getInstruments(String name){
		return memberInstruments.get(name);
	}
	
	private String name;
	private Map<String, SortedSet<String>> memberInstruments;
	private SortedSet<String> memberNames;
}
