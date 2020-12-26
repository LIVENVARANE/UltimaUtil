package fr.groupeultima.org.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Kill implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("kill") || label.equalsIgnoreCase("suicide")) {
			if(sender instanceof Player) {
				if(args.length == 0) {
					((Player) sender).setHealth(0);
					sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "You have been killed. (/kill)");
				}
				else if(args.length == 1) {
					Player player = Bukkit.getPlayerExact(args[0]);
					if(player != null) {
						player.setHealth(0);
						sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Player \"" + ChatColor.BOLD + "" + args[0] + ChatColor.RESET + "" + ChatColor.GREEN + "\" has been killed.");
					}
					else {
						sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Player \"" + args[0] + "\" is not online. Please use a connected player name.");
					}
				}
				else {
					sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Too many arguments. Please use \"/" + label + " [player/nothing]\".");
				}
			}
			else {
				sender.sendMessage(ChatColor.RED + "[UltimaUtil] Console cannot execute \"/" + label + "\" command.");
			}
		}
	return false;
	}
}