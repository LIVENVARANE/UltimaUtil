package fr.groupeultima.org.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Toggledownfall implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("toggledownfall")) {
			if(sender instanceof Player) {
				if(args.length == 0) {
					Player player = (Player) sender;
					if(player.getWorld().hasStorm() == true) {
						player.getWorld().setStorm(false);
						sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Toggled downfall.");
					}
					else {
						player.getWorld().setStorm(true);
						sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Toggled downfall.");
						
					}
				}
				else {
					sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Too many arguments. Please use \"/" + label + "\".");
				}
			}
			else {
				sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.DARK_RED + "Console cannot execute \"/" + label + "\" command.");
			}
		}
	return false;
	}
}