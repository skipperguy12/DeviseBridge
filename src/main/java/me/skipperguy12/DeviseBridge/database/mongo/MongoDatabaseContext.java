package me.skipperguy12.DeviseBridge.database.mongo;

import javax.annotation.Nonnull;

import me.skipperguy12.DeviseBridge.database.impl.SimpleDatabaseContext;

/**
 * Class that encapsulates Mongo connection information
 * 
 * @author skipperguy12
 * 
 */
public final class MongoDatabaseContext extends SimpleDatabaseContext {
    /**
     * Constructor for Database
     * 
     * @param user
     *            Username
     * @param password
     *            Password
     * @param ip
     *            Internet Protocal Address
     * @param port
     *            Port for ip
     * @param database
     *            Database name
     */
    public MongoDatabaseContext(String user, char[] password,
	    @Nonnull String ip, @Nonnull String port, @Nonnull String database) {
	super(user, password, ip, port, database);
    }

}
