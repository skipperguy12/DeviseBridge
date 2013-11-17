package me.skipperguy12.DeviseBridge.database.mongo;

import java.net.UnknownHostException;

import me.skipperguy12.DeviseBridge.database.impl.SimpleDatabaseConnectionManager;

import com.mongodb.DB;
import com.mongodb.MongoClient;

/**
 * Represents a Mongo connector
 * 
 * @author skipperguy12
 * 
 */
public final class MongoConnectionManager extends
	SimpleDatabaseConnectionManager {

    // Mongo connector
    private MongoClient mongo;

    // Mongo database
    private DB db;

    public MongoConnectionManager(MongoDatabaseContext context) {
	super(context);
    }

    /**
     * Gets the Database the MongoClient is connected to
     * 
     * @return Mongo DB
     */
    public DB getDB() {
	return db;
    }

    /**
     * Gets the MongoClient
     * 
     * @return MongoClient
     */
    public MongoClient getClient() {
	return mongo;
    }

    @Override
    public void connect() {
	mongo = null;
	try {
	    mongo = new MongoClient(
		    (String) ((MongoDatabaseContext) getDatabaseContext())
			    .getIP(),
		    Integer.valueOf(((MongoDatabaseContext) getDatabaseContext())
			    .getPort()));
	} catch (NumberFormatException e) {
	    e.printStackTrace();
	} catch (UnknownHostException e) {
	    e.printStackTrace();
	}
	db = getClient().getDB(
		((MongoDatabaseContext) getDatabaseContext()).getDatabase());
	boolean auth = db.authenticate(
		((MongoDatabaseContext) getDatabaseContext()).getUsername(),
		((MongoDatabaseContext) getDatabaseContext()).getPassword());
    }

}
