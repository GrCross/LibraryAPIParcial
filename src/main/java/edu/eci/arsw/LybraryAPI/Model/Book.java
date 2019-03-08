/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.LybraryAPI.Model;

/**
 *
 * @author 2134840
 */
public class Book {
    
    int id;
    String nombre;
    String autor;
    String sinopsis;
    

    public Book(int id, String nombre, String autor, String sinopsis) {
        this.id = id;
        this.nombre = nombre;
        this.autor = autor;
        this.sinopsis = sinopsis;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
    
    
    
    
}
