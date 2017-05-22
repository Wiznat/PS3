package pkgLibrary;

import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.*;

import pkgMain.XMLReader;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	@XmlAttribute
	int id;	
	
	@XmlElement(name="book")
	ArrayList<Book> books;
	
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public static void main(String args[]){
		
		System.out.println("cat ID " +getBook("Idk"));
		
		
	}
	public static Catalog getBook(String id){
		
	Catalog books = XMLReader.ReadCatalog();
	
	System.out.println("cat ID " + books.getId());
	System.out.println("Book count: " + books.getBooks().size());
	return books;
		
	}
	
	


	}
	
	


	
	
	
	

