package fr.groupeultima.org.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Fly implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("fly")) {
			if(sender instanceof Player) {
				if(args.length == 0) {
					Player player = (Player) sender;
					if(player.isFlying() == true) {
						player.getPlayer().setAllowFlight(false);
						sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Fly disabled.");
					}
					else {
						player.getPlayer().setAllowFlight(true);
						sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Fly enabled.");
					}
					
				}
				else if(args.length == 1) {
					Player player = Bukkit.getPlayerExact(args[0]);
					if(player != null) {
						if(player.isFlying() == true) {
							player.getPlayer().setFlying(false);
							sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Fly disabled for player \"" + ChatColor.BOLD + "" + args[0] + ChatColor.RESET + "" + ChatColor.GREEN + "\".");
						}
						else {
							player.getPlayer().setFlying(true);
							sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Fly toggled for player \"" + ChatColor.BOLD + "" + args[0] + ChatColor.RESET + "" + ChatColor.GREEN + "\".");
						}
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