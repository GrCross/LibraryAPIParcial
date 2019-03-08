package edu.eci.arsw.LybraryAPI.Controllers;


import edu.eci.arsw.LybraryAPI.Model.Book;
import edu.eci.arsw.LybraryAPI.Model.Library;
import edu.eci.arsw.LybraryAPI.Services.LibraryApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 2134840
 */
@RestController
@RequestMapping("/library")
@Service
public class libraryApiController {
    
    @Autowired
    LibraryApiService las;
    
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllLibraries(){
        try {
            
            
            return new ResponseEntity<>(las.getLibraries(), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("recursos no encontrados",HttpStatus.NOT_FOUND);
        }
    }
    
    @RequestMapping(method = RequestMethod.GET,value = "/{id}")
    public ResponseEntity<?> getLibrary(@PathVariable int id){
        try {
            return new ResponseEntity<>(las.getLibrary(id), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("404 recursos no encontrados",HttpStatus.NOT_FOUND);
        }
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}/{idBook}")
    public ResponseEntity<?> getBookById(@PathVariable int id, @PathVariable int idBook){
        try {
            return new ResponseEntity<>(las.getBook(id,idBook), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("404 recursos no encontrados",HttpStatus.NOT_FOUND);
        }
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> postLibrary(@RequestBody Library library){
        try {
        	
            las.addLibrary(library);
            
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("no fue posible ingresar el recurso",HttpStatus.FORBIDDEN);
        }
    }
    
    @RequestMapping(method = RequestMethod.POST,value = "/{id}")
    public ResponseEntity<?> postBook(@RequestBody Book book,@PathVariable String id){
        try {
            las.addBook(book,Integer.parseInt(id));
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("recursos no encontrados",HttpStatus.FORBIDDEN);
        }
    }
    
    @RequestMapping(method = RequestMethod.DELETE,value = "/{id}")
    public ResponseEntity<?> postBook(@PathVariable String id){
        try {
           las.deleteLibrary(Integer.parseInt(id));
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("recursos no encontrados",HttpStatus.NOT_FOUND);
        }
    }
    
    
    
}
