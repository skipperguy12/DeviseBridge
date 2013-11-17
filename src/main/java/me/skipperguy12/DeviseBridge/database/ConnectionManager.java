package me.skipperguy12.DeviseBridge.database;

/**
 * Represents a database connector
 * 
 * @author skipperguy12
 * 
 */
public interface ConnectionManager {
    /**
     * Gets the Database Context
     * 
     * @return The database
     */
    public DatabaseContext getDatabaseContext();

    /**
     * Sets the DatabaseContext
     * 
     * @param newContext
     *            The new context
     */
    public void setDatabaseContext(DatabaseContext newContext);

    /**
     * Connects to the Database
     */
    public void connect();
}
