/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.LybraryAPI.Model;

import java.util.*;


/**
 *
 * @author 2134840
 */
public class Library {
    
    int id;
    String nombre;
    String direccion;
    String telefono;
    List<Book> books; 

    public Library(int id,String nombre,String direccion,String telefono) {
        
        this.id = id;
        this.direccion = direccion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.books = new ArrayList<Book>();
        
    }
    

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }


	public Book getBook(int idBook) {
		Book bk = null;
		for (Book book : books) {
			if(book.getId() == idBook) bk = book;
		}
		return bk;
	}
    
    
    
    
    
    
    
    
}
