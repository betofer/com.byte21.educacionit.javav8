/*
 * @(#CollectionApp.java 04/01/2017
 * Copyright 2017 Byte21, Inc. All rights reserved.
 * Byte21/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.standard;


// Packages and classes to import of jdk 1.8
import java.util.*;
import java.time.LocalDate;

// Packages and classes to import of apache commons.
import static org.apache.commons.lang3.RandomStringUtils.randomNumeric;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;

// Packages and classes to import of slj4j.
import org.apache.log4j.*;

// Packages and classes own  to import
import com.byte21.educacionit.java8.standard.model.User;
import java.util.stream.Collectors;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.standard.CollectionApp</code> is a tester for
 *     java collections framework.  
 *  
 *  @author  Raul Geomar Pena (raul.pena@hotmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   04/01/2017
 * */
public class CollectionApp {
    
    
    // Private class fields declarations.
    // User list.
    private static final List<User> users = new ArrayList<> ();
    
    // Logger object.
    private static final Logger logger = Logger.getLogger (LambdaApp.class);
    
    
    // Static initialization.
    static {
    
        // Load users.
        users.add (new User (randomNumeric (10), "raul.pena", randomAlphabetic (10), "raul.pena@hotmail.com", LocalDate.now ()));
        users.add (new User (randomNumeric (10), "homer.simpson", randomAlphabetic (10), "homer.simpson@hotmail.com", LocalDate.now ()));
        users.add (new User (randomNumeric (10), "marge.simpson", randomAlphabetic (10), "marge.simpson@hotmail.com", LocalDate.now ()));
        users.add (new User (randomNumeric (10), "bart.simpson", randomAlphabetic (10), "bart.simpson@hotmail.com", LocalDate.now ()));
        users.add (new User (randomNumeric (10), "lisa.simpson", randomAlphabetic (10), "lisa.simpson@hotmail.com", LocalDate.now ()));
        
        users.add (new User (randomNumeric (10), "luke.skywalker", randomAlphabetic (15), "luke.skywalker@gmail.com", LocalDate.now ()));
        users.add (new User (randomNumeric (10), "han.solo", randomAlphabetic (15), "han.solo@gmail.com", LocalDate.now ()));
        users.add (new User (randomNumeric (10), "chewbacca", randomAlphabetic (15), "chewbacca@gmail.com", LocalDate.now ()));
        users.add (new User (randomNumeric (10), "r2d2", randomAlphabetic (15), "r2d2@gmail.com", LocalDate.now ()));
        users.add (new User (randomNumeric (10), "c3po", randomAlphabetic (15), "c3po@gmail.com", LocalDate.now ()));
    }
    
    
    // Public class fields declarations.
    /**
     * 
     *  <p>Execution main method.
     * 
     *  @param args Arguments.
     */
    public static void main (String[] args) {
 
        // Test collections without generics.
        // testWithoutGeneric ();
        
        //testWithGeneric ();
        
        testArrayList ();
    }
    
    public static void testWithoutGeneric () {
        
        ArrayList objects = new ArrayList ();
        
        try {
         
            objects.add ("String");
            objects.add (Integer.valueOf (1));
            
            System.out.println ((String) objects.get (0));
            System.out.println ((String) objects.get (1));
        
        } catch (Exception e) {
           
            System.err.println ("Uyyy ocurrio una falla... " + e.getMessage ());
        }
    }
    
    
    public static void testWithGeneric () {
        
        ArrayList<String> strings = new ArrayList<> ();
        
        try {
         
            strings.add ("String");
            strings.add (Integer.valueOf (1).toString ());
            
            System.out.println (strings.get (0));
            System.out.println (strings.get (1));
        
        } catch (Exception e) {
           
            System.err.println ("Uyyy ocurrio una falla... " + e.getMessage ());
        }
    }
    
    
    public static void testArrayList () {
        
        // Creo el ArrayList.
        List<String> names = new ArrayList<> ();
        
        // Agrego valores al ArrayList.
        names.add ("Nelson Muntz");
        names.add ("Captain Lance Murdock");
        names.add ("Apu Nahasapeemapetilon");
        names.add ("Waylon Smithers");
        System.out.print ("El ArrayList es : " + names);
        System.out.println (" Y tiene (" + names.size () + ") items.");
        
        // Elimino valores del ArrayList.
        names.remove ("Lisa");
        System.out.print ("El ArrayList es : " + names);
        System.out.println (" Y sigue tiendo (" + names.size () + ") items.");
        
        // Chequeo si esta o no vacio el ArrayList.
        System.out.println ("El ArrayList esta vacío : " + names.isEmpty ());
        
        // Jugando con los valores.
        System.out.println ("El nombre en la posicion 3 es : " + names.get (2));
        names.add (2, "Drederick Tatum");
        System.out.println ("El nombre en la posicion 3 es : " + names.get (2));
        System.out.println ("El nombre en la posicion 4 es : " + names.get (3));
        System.out.println ("El nombre en la posicion 5 es : " + names.get (4));
        System.out.println ("El nombre de Lisa esta guardado aca ? " + names.contains ("Lisa"));
        
        // Obtengo un arreglo.
        String [] names2 = names.toArray (new String[names.size ()]);
        System.out.println ("Array de un ArrayList : " + names2);
        
        // Emilino valores.
        names.remove (0);
        names.remove (1);
        System.out.print ("El ArrayList es : " + names);
        System.out.println (" Y tiene (" + names.size () + ") items.");
        
        // Limpio el LinkedHashSet.
        names.clear ();
        System.out.println ("El ArrayList esta vacío : " + names.isEmpty ());
    }
}