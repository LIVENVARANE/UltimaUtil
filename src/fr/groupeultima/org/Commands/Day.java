package fr.groupeultima.org.Commands;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Day implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("day")) {
			if(sender instanceof Player) {
				if(args.length == 0) {
					World world = ((Player) sender).getWorld();
					world.setTime(26000);
					sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "The time of \"" + world.getName() + "\" to day.");
				}
				else {
					sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Too many arguments. Please use \"/" + label + "\".");
				}
			}
			else {
				sender.sendMessage(ChatColor.RED + "[UltimaUtil] Console cannot execute \"/" + label + "\" command.");
			}
		}
	return false;
	}
}