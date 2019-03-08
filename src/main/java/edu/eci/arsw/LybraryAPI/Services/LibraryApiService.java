/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.LybraryAPI.Services;

import edu.eci.arsw.LybraryAPI.Model.Book;
import edu.eci.arsw.LybraryAPI.Model.Library;
import java.util.*;
import org.springframework.stereotype.Service;

/**
 *
 * @author 2134840
 */
@Service
public class LibraryApiService {
    
    private List<Library> libraries = new ArrayList<Library>();

    public LibraryApiService() {
    }
    
    public void addLibrary(Library library){
        
        libraries.add(library);
    }

    public List<Library> getLibraries() {
        return libraries;
    }
    
    public Library getLibrary(int id){
    	Library lib = null;
        for (Library library : libraries) {
            if(library.getId() == id)lib = library;
        }
        lib.getBooks();
        return lib;
    }

    public void addBook(Book book, int id) {
        Library library = getLibrary(id);
        
        library.addBook(book);
    }

	public Book getBook(int id,int idBook) {
		Library library = this.getLibrary(id);
		Book book = library.getBook(idBook);
		book.getAutor();
		return book;
	}


	public void deleteLibrary(int id) {
		Library library = this.getLibrary(id);
		if(library.getBooks().isEmpty()) {
			libraries.remove(library);
		}
		
		
	}
    
    
    
    
}
