package me.skipperguy12.DeviseBridge;

import java.util.Date;
import java.util.Random;

import me.skipperguy12.DeviseBridge.database.mongo.MongoConnectionManager;
import me.skipperguy12.DeviseBridge.database.mongo.MongoDatabase;
import me.skipperguy12.DeviseBridge.database.mongo.MongoDatabaseContext;
import me.skipperguy12.DeviseBridge.database.mongo.User;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;
import org.mindrot.jbcrypt.BCrypt;

import com.mongodb.BasicDBObject;
import com.sk89q.bukkit.util.CommandsManagerRegistration;
import com.sk89q.minecraft.util.commands.CommandException;
import com.sk89q.minecraft.util.commands.CommandPermissionsException;
import com.sk89q.minecraft.util.commands.CommandUsageException;
import com.sk89q.minecraft.util.commands.CommandsManager;
import com.sk89q.minecraft.util.commands.MissingNestedCommandException;
import com.sk89q.minecraft.util.commands.WrappedCommandException;

/**
 * Bukkit plugin
 * 
 * @author skipperguy12
 * 
 */
public class DeviseBridge extends JavaPlugin {
    public static void main(String[] args) {

	MongoDatabase database = new MongoDatabase(new MongoConnectionManager(
		new MongoDatabaseContext("", "".toCharArray(), "localhost",
			"27017", "mongo_forem_devise_development")));
	database.getConnectionManager().connect();

	String encrypted_password = BCrypt.hashpw("test", BCrypt.gensalt(10));

	String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	Random rnd = new Random();
	final StringBuilder sb = new StringBuilder(20);

	for (int i = 0; i < 20; i++) {
	    sb.append(AB.charAt(rnd.nextInt(AB.length())));
	}
	String confirmation_token = sb.toString();

	User test = new User("fake", "fake@me.com", encrypted_password,
		confirmation_token);

	database.register(test);

	System.out.println("Registered user " + test.toString() + " in Mongo!");

    }

}
