package me.skipperguy12.DeviseBridge.database;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

/**
 * Encapsulates information to connect to a server
 * 
 * @author skipperguy12
 * 
 */
public interface DatabaseContext {
    /**
     * Gets the username that is used to connect to the server
     * 
     * @return The username
     */
    public @Nullable
    Object getUsername();

    /**
     * Gets the password that is used to connect to the server
     * 
     * @return The password
     */
    public @Nullable
    Object getPassword();

    /**
     * Gets the IP that is used to connect to the server
     * 
     * @return The IP
     */
    public @Nonnull
    Object getIP();

    /**
     * Gets the port that is used to connect to the server
     * 
     * @return The port
     */
    public @Nonnull
    Object getPort();

    /**
     * Gets the Database
     * 
     * @return
     */
    public @Nonnull
    Object getDatabase();

}
