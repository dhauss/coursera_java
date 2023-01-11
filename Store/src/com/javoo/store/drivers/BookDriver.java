package com.javoo.store.drivers;
import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

import com.javaoo.store.Book;


public class BookDriver {

	public static void main(String[] args) {
		String location = "/Users/dave/git/coursera_java/Store/src/com/javoo/store/drivers/books.txt";
		List<Book> books = readBooksFromFile(location);
		
		for(Book book: books) {
			out.println(book);
		}
	}
	
	public static List<Book> readBooksFromFile(String inFile){
		ArrayList<Book> books = new ArrayList<>();
		FileInputStream fStream = null;
		InputStreamReader inReader = null;
		LineNumberReader lineReader = null;
		
		try {
			fStream = new FileInputStream(inFile);
			inReader = new InputStreamReader(fStream);
			lineReader = new LineNumberReader(inReader);

			String title = lineReader.readLine();
			while(title != null) {
				String author = lineReader.readLine();
				Double price = Double.parseDouble(lineReader.readLine());
					
				books.add(new Book(title, price, 5, author, "PubsInc", "Fiction"));
					
					
				title = lineReader.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
				try {
					if(fStream != null)
						fStream.close();
					if(inReader != null)
						inReader.close();
					if(lineReader != null)
						lineReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
		return books;
		
	}

}
