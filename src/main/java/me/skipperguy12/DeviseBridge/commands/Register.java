package me.skipperguy12.DeviseBridge.commands;

import org.bukkit.command.CommandSender;

import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandContext;
import com.sk89q.minecraft.util.commands.CommandException;

public class Register {
    @Command(aliases = { "register" }, desc = "Registers an account with your username on the site ", usage = "[email]", min = 1, max = 1)
    public static void register(CommandContext args, CommandSender sender)
	    throws CommandException {
	// Example: /register [email]
	String email = args.getString(0);
	// TODO: Insert logic to register user
    }
}
