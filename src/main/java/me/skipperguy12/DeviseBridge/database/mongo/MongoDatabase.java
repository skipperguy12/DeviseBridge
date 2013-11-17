package me.skipperguy12.DeviseBridge.database.mongo;

import java.util.Date;
import java.util.Random;

import lombok.Getter;

import com.mongodb.BasicDBObject;

/**
 * Encapsulates a connection manager for the database, and various methods to be
 * used
 * 
 * @author skipperguy12
 * 
 */
public class MongoDatabase {
    // Connection Manager instance
    protected @Getter
    MongoConnectionManager connectionManager;

    /**
     * Constructor for MongoDatabase
     * 
     * @param connectionManager
     *            ConnectionManager for this class to use
     */
    public MongoDatabase(MongoConnectionManager connectionManager) {
	this.connectionManager = connectionManager;
    }

    /**
     * Registers a user into the database
     * 
     * @param user
     */
    public void register(User user) {

	BasicDBObject obj = new BasicDBObject();
	obj.put("confirmation_sent_at", new Date());
	obj.put("email", user.getEmail());
	obj.put("confirmation_token", user.getConfirmation_token());
	obj.put("encrypted_password", user.getEncrypted_password());

	getConnectionManager().getDB().getCollection("users").insert(obj);
    }
}
