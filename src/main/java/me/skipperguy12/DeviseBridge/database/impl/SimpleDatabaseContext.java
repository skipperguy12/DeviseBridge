package me.skipperguy12.DeviseBridge.database.impl;

import javax.annotation.Nonnull;

import lombok.Getter;
import me.skipperguy12.DeviseBridge.database.DatabaseContext;

/**
 * Basic implementation of DatabaseContext, encapsulates generic database
 * information
 * 
 * @author skipperguy12
 * 
 */
public class SimpleDatabaseContext implements DatabaseContext {
    // Username
    protected @Getter
    String username = null;

    // IP
    protected String ip = null;

    // Port
    protected @Getter
    String port = null;

    // Password
    protected @Getter
    char[] password = null;

    // Database name
    protected @Getter
    String database = null;

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
    public SimpleDatabaseContext(String user, char[] password,
	    @Nonnull String ip, @Nonnull String port, @Nonnull String database) {
	this.username = user;
	this.password = password;
	this.ip = ip;
	this.port = port;
	this.database = database;
    }

    @Override
    public Object getIP() {
	return ip;
    }

}
