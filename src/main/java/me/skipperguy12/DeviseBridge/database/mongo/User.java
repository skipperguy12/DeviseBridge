package me.skipperguy12.DeviseBridge.database.mongo;

import java.util.Date;

import lombok.Data;
import lombok.Getter;

/**
 * Encapsulates data for a user
 * 
 * @author skipperguy12
 * 
 */
public @Data
class User {
    // parser, to
    // insert usable
    // time formats
    // into mongo
    // documents
    private @Getter
    String name;
    private @Getter
    String email;
    private @Getter
    String encrypted_password;
    private @Getter
    Date confirmation_sent_at;
    private @Getter
    String confirmation_token;

    /**
     * Constructor for User
     * 
     * @param name
     * @param email
     * @param encrypted_password
     * @param confirmation_token
     */
    public User(String name, String email, String encrypted_password,
	    String confirmation_token) {
	this.name = name;
	this.email = email;
	this.encrypted_password = encrypted_password;
	this.confirmation_token = confirmation_token;
    }

}
