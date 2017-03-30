/*
 * @(#LambdaApp.java 03/30/2017
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
 *  <p>The class <code>com.byte21.educacionit.java8.standard.LambdaApp</code> is a tester for
 *     lambda expressions.  
 *  
 *  @author  Raul Geomar Pena (raul.pena@hotmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   03/30/2017
 * */
public class LambdaApp {
    
    
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
 
        // Print all users. Mode without lambda expresions.
        for (User u: users) {
            logger.info ("Printing without lammda expressions => ".concat (u.toString ()));
        }
        
        logger.info ("\n \n");
        
        // Print all users. Mode with lambda expresions.
        users.stream ().forEach ((u) -> logger.info ("Printing with lammda expressions => ".concat (u.toString ())));
        
        logger.info ("**************************************************************************************************************\n \n \n");
        
        
        
        
        
        // Print all users with hotmail account, Mode without lambda expresions.
        for (User u: users) {
            if (u.getEmail ().endsWith ("hotmail.com")) {
                logger.info ("Printing without lammda expressions => ".concat (u.getEmail ()));
            }    
        }
        
        logger.info ("\n \n");
        
        // Print all users with hotmail account, Mode with lambda expresions.
        users.stream ().filter (u -> u.getEmail ().endsWith ("hotmail.com")).forEach ((u) -> logger.info ("Printing with lammda expressions => ".concat (u.getEmail ())));
        
        logger.info ("**************************************************************************************************************\n \n \n");
        
        
        
        
        
        // Getting all passwords and save it into a collection, Mode without lambda expresions.
        List<String> passwords = new ArrayList<> ();
        for (User u: users) {
            passwords.add (u.getPassword ());
        }
        
        // Print all passwords, Mode without lambda expresions.
        for (String u: passwords) {
            logger.info ("Printing without lammda expressions => ".concat (u));
        }
        
        logger.info ("\n \n");
        
        // Getting all passwords and save it into a collection, Mode with lambda expresions.
        List<String> passwords2 = users.stream ().map (u -> u.getPassword ()).collect (Collectors.toList ());
        
        // Print all passwords, Mode with lambda expresions.
        passwords2.stream ().forEach ((u) -> logger.info ("Printing with lammda expressions => ".concat (u)));
        
        logger.info ("**************************************************************************************************************\n \n \n");
        
        
        
        
        
        // Print count users with gmail account, Mode without lambda expresions.
        int i = 0;
        for (User u: users) {
            if (u.getEmail ().endsWith ("gmail.com")) {
                i++;
            }    
        }
        logger.info ("Printing without lammda expressions => size gmail account : ".concat (String.valueOf (i)));
        
        logger.info ("\n \n");
        
        // Print count users with gmail account, Mode with lambda expresions.
        long j = users.stream ().filter (u -> u.getEmail ().endsWith ("gmail.com")).count ();
        logger.info ("Printing with lammda expressions => size gmail account : ".concat (String.valueOf (j)));
        
        logger.info ("**************************************************************************************************************\n \n \n");
    }
}