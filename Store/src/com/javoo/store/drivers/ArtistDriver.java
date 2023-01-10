package com.javoo.store.drivers;
import java.util.TreeSet;

import com.javaoo.store.Artist;

public class ArtistDriver {
	private static void printMemberInstruments(Artist artist, String name) {
		System.out.println(artist.getName() + " band member " + name + " plays:");
		for(String instrument: artist.getInstruments(name)) {
			System.out.println("\t" + instrument);
		}
	}

	public static void main(String[] args) {
		TreeSet<String> instruments1 = new TreeSet<String>();
		TreeSet<String> instruments2 = new TreeSet<String>();
		Artist hotplate = new Artist("Hotplate");
		
		instruments1.add("Piano");
		instruments1.add("Clarinet");
		instruments1.add("Hurdy Gurdy");
		instruments1.add("Tuba");
		
		instruments2.add("Bass");
		instruments2.add("Guitar");
		instruments2.add("Sitar");
		instruments2.add("Spoons");
		
		hotplate.addMember("Tom", instruments1);
		hotplate.addMember("Steve", instruments2);
		
		printMemberInstruments(hotplate, "Tom");
		printMemberInstruments(hotplate, "Steve");

		
	}

}
