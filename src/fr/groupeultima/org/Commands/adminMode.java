package fr.groupeultima.org.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class adminMode implements CommandExecutor {
	@Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("adminmode") || label.equalsIgnoreCase("am")) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				if(player.getPlayer().getUniqueId().toString().equals("d330ff2b-149d-47fc-9188-2c9ccf3e6e5c") || player.getPlayer().getUniqueId().toString().equals("6d588f8a-ce08-4797-9ddf-88d911702d34")) {
					if(args.length != 0) {
						if(args.length == 1) {
							if(args[0].equalsIgnoreCase("on")) {
								if(sender.isOp() == false) {
									sender.setOp(true);
									sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "You are now in AdminMode.");
								}
								else {
									sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.YELLOW + "You already are in AdminMode! " + ChatColor.RED + "(Already op.)");
								}
							}
							else if(args[0].equalsIgnoreCase("off")) {
								if(sender.isOp() == true) {
									sender.setOp(false);
									sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "You are no longer in AdminMode.");
								}
								else {
									sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.YELLOW + "You are not in AdminMode! " + ChatColor.RED + "(Not op.)");
								}
							}
							else {
								sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Wrong argument. Please use \"/adminmode [on/off]\".");
							}
						}
						else {
							sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Too many arguments. Please use \"/adminmode [on/off]\".");
						}
					}
					else {
						if(((Player) sender).getPlayer().isOp() == true) {
							sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.YELLOW + "You are currently in " + ChatColor.GREEN + "AdminMode" + ChatColor.YELLOW + ". Do \"/adminmode [on/off]\".");
						}
						else {
							sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.YELLOW + "You are not currently in " + ChatColor.RED + "AdminMode" + ChatColor.YELLOW + ". Do \"/adminmode [on/off]\".");

						}
					}
				}
				else {
					sender.sendMessage(ChatColor.RED + "I'm sorry, but you don't have to permission to use this command.");
				}
			}
			else {
				sender.sendMessage(ChatColor.RED + "[UltimaUtil] Console cannot execute \"/adminmode\" command.");
			}
		}
	return false;
	}
}