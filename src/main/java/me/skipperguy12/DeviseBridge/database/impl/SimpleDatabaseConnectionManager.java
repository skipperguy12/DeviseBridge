package me.skipperguy12.DeviseBridge.database.impl;

import me.skipperguy12.DeviseBridge.database.ConnectionManager;
import me.skipperguy12.DeviseBridge.database.DatabaseContext;

/**
 * Simple implementation of ConnectionManager
 * 
 * @author skipperguy12
 * 
 */
public class SimpleDatabaseConnectionManager implements ConnectionManager {
    // Variable for the DatabaseContext
    protected DatabaseContext context;

    public SimpleDatabaseConnectionManager(DatabaseContext context) {
	this.context = context;
    }

    public DatabaseContext getDatabaseContext() {
	return context;
    }

    public void setDatabaseContext(DatabaseContext newContext) {
	context = newContext;
    }

    public void connect() {
    }

}
