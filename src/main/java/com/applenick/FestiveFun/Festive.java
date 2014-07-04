package com.applenick.FestiveFun;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.applenick.FestiveFun.commands.FestiveCommands;
import com.applenick.FestiveFun.events.FestiveJoin;
import com.applenick.FestiveFun.utils.Alog;
import com.sk89q.bukkit.util.CommandsManagerRegistration;
import com.sk89q.minecraft.util.commands.CommandException;
import com.sk89q.minecraft.util.commands.CommandPermissionsException;
import com.sk89q.minecraft.util.commands.CommandUsageException;
import com.sk89q.minecraft.util.commands.CommandsManager;
import com.sk89q.minecraft.util.commands.MissingNestedCommandException;
import com.sk89q.minecraft.util.commands.WrappedCommandException;

public class Festive extends JavaPlugin {
	
	private static Festive festive = null;
	private CommandsManager<CommandSender> command;
	
	
	public void onEnable(){
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
        this.reloadConfig();
		
		startup();
	}
	
	
	private void startup(){
		festive = this;
		setupCommands();
		setupFireworks();
	}
	
	
	
	public static Festive get(){
		return festive;
	}
	
	
	
	public void setupFireworks(){
		PluginManager PM = getServer().getPluginManager();
		if(Config.joinFireworks()){
			PM.registerEvents(new FestiveJoin(), this);
			Alog.consoleMsg(ChatColor.GREEN + "Join Fireworks Enabled");
		}
	}
	
	private void setupCommands(){
		this.command = new CommandsManager<CommandSender>() {
	        @Override public boolean hasPermission(CommandSender sender, String perm) {
	            return sender.hasPermission(perm);
	        }
	    };
	    
		CommandsManagerRegistration cmdR = new CommandsManagerRegistration(this, this.command);
		cmdR.register(FestiveCommands.class);
	}
	
	
	  @Override
	    public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
	        try {
	            this.command.execute(cmd.getName(), args, sender, sender);
	        } catch (CommandPermissionsException e) {
	            sender.sendMessage(ChatColor.RED + "You don't have permission.");
	        } catch (MissingNestedCommandException e) {
	            sender.sendMessage(ChatColor.RED + e.getUsage());
	        } catch (CommandUsageException e) {
	            sender.sendMessage(ChatColor.RED + e.getMessage());
	            sender.sendMessage(ChatColor.RED + e.getUsage());
	        } catch (WrappedCommandException e) {
	            if (e.getCause() instanceof NumberFormatException) {
	                sender.sendMessage(ChatColor.RED + "Number expected, string received instead.");
	            } else {
	                sender.sendMessage(ChatColor.RED + "An error has occurred. See console.");
	                e.printStackTrace();
	            }
	        } catch (CommandException e) {
	            sender.sendMessage(ChatColor.RED + e.getMessage());
	        }

	        return true;
	    }
	

}
