package com.applenick.FestiveFun.commands;

import org.bukkit.command.CommandSender;

import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandContext;
import com.sk89q.minecraft.util.commands.CommandException;
import com.sk89q.minecraft.util.commands.CommandPermissions;

public class FestiveCommands {
	
	@Command(
			aliases = {"festive"},
			desc = "Festive Fun Commands"
			)
	@CommandPermissions("festive.fun")
    public static void festive(CommandContext args, CommandSender sender) throws CommandException {
		sender.sendMessage("This Command is useless for now.");
	}
	

}
