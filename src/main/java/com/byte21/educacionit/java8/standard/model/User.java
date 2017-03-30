/*
 * @(#User.java 03/30/2017
 * Copyright 2017 Byte21, Inc. All rights reserved.
 * Byte21/CONFIDENTIAL
 * */

package com.byte21.educacionit.java8.standard.model;


// Packages and classes to import of jdk 1.8
import java.time.LocalDate;


/**
 * 
 *  <p>The class <code>com.byte21.educacionit.java8.standard.model.User</code> is a POJOs class
 *     for management the user information.
 *  
 *  
 *  @author  Raul Geomar Pena (raul.pena@hotmail.com)
 *  @version 1.0.0
 *  @since   jdk 1.8
 *  @since   03/30/2017
 * */
public class User {
    
    
    // Private instances fields declarations.
    // User id.
    private String id = "";
    
    // User name.
    private String userName = "";
    
    // User password.
    private String password = "";
    
    // User email.
    private String email = "";
    
    // Creation date.
    private LocalDate creation = LocalDate.now ();
    
 
    // Public constructor declarations.
    /**
     * 
     *  <p>Constructor without parameters.
     * 
     */
    public User () {
        
        // Call to super class.
        super ();
    }
    
    /**
     * 
     *  <p>Constructor with parameters.
     * 
     * @param id User id.
     * @param userName User name.
     * @param password User password.
     * @param email User email.
     * @param creation Creation date.
     */
    public User (String id, String userName, String password,
                 String email, LocalDate creation) {
        
        // Call to super class.
        super ();
        
        // Set the internal values.
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.email    = email;
        this.creation = creation;
    }
    
    
    // Public instance method declarations. (Get/Set)
    /**
     * 
     *  <p>Method that return the user id.
     * 
     *  @return The user id.
     */
    public String getId () {
        
        // Return the value.
        return this.id;
    }

    /**
     * 
     *  <p>Method that set the user id.
     * 
     *  @param id User id.
     */
    public void setId (String id) {
        
        // Set the value.
        this.id = id;
    }

    /**
     * 
     *  <p>Method that return the user name.
     * 
     *  @return The user name.
     */
    public String getUserName () {
        
        // Return the value.
        return this.userName;
    }

    /**
     * 
     *  <p>Method that set the user name.
     * 
     *  @param userName The user name.
     */
    public void setUserName (String userName) {
        
        // Set the value.
        this.userName = userName;
    }

    /**
     * 
     *  <p>Method that return the user password.
     * 
     *  @return The user password.
     */
    public String getPassword () {
        
        // Return the value.
        return this.password;
    }

    /**
     * 
     *  <p>Method that set the user password.
     * 
     *  @param password User password.
     */
    public void setPassword (String password) {
        
        // Set the value.
        this.password = password;
    }

    /**
     * 
     *  <p>Method that return the user email.
     * 
     *  @return The user email.
     */
    public String getEmail () {
        
        // Return the value.
        return this.email;
    }

    /**
     * 
     *  <p>Method that set the user email.
     * 
     *  @param email User email.
     */
    public void setEmail (String email) {
        
        // Set the value.
        this.email = email;
    }

    /**
     * 
     *  <p>Method that return the creation date.
     * 
     *  @return creation date.
     */
    public LocalDate getCreation () {
        
        // Return the value.
        return this.creation;
    }

    /**
     * 
     *  <p>Method that set the creation date.
     * 
     *  @param creation Creation date.
     */
    public void setCreation (LocalDate creation) {
 
        // Set the value.
        this.creation = creation;
    }    
    
    
    // Public instance method declarations extended of java.lang.Object.
    /* (non-Javadoc)
     * @see java.lang.Object#hashCode ()
     */
    @Override
    public int hashCode () {
		
        // Return the value.
	int hash = 0;  
        hash += (this.getId () != null ? this.getId ().hashCode () : 0);  
  
        // Rturn the new value.
        return hash;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals (java.lang.Object)
     */
    @Override
    public boolean equals (Object object) {
		
        // Return the value.
        if (this == object)  {
            return true;
	}
              
        if (object == null) {
            return false;
        }  
              
        if (getClass () != object.getClass ()) {
            return false;
        }  
              
        // Check the classes.
        User other = (User) object;  
        
        // Return the value.
        return this.id.equals (other.getId ()); 
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString ()
     */
    @Override
    public String toString () {
		
        // Return the value
	return this.userName.concat (", creation [").concat (this.creation.toString ()).concat ("]");
    }
}