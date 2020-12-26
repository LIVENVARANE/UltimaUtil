package fr.groupeultima.org.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TPHere implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("tphere") || label.equalsIgnoreCase("s")) {
			if(sender instanceof Player) {
				if(args.length != 0) {
					if(args.length == 1) {
						Player player = Bukkit.getPlayerExact(args[0]);
						if(player != null) {
							if(player.getName() != sender.getName()) {
								player.getPlayer().teleport(((Player) sender).getPlayer());
								sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Player \"" + ChatColor.BOLD + "" + args[0] + ChatColor.RESET + "" + ChatColor.GREEN + "\" has been teleported to you.");
								player.getPlayer().sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.BLUE + "Vous avez été téléporté à \"" + ChatColor.BOLD + "" + sender.getName() + ChatColor.RESET + "" + ChatColor.BLUE + "\".");
							}
							else {
								sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "You cannot teleport to yourself, dawg.");
							}
						}
						else {
							sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Player \"" + args[0] + "\" is not online. Please use a connected player name.");
						}
					}
					else {
						sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Too many arguments. Please use \"/" + label + " [player]\".");
					}
				}
				else {
					sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Missing arguments. Please use \"/" + label + " [player]\".");
				}
			}
			else {
				sender.sendMessage(ChatColor.RED + "[UltimaUtil] Console cannot execute \"/" + label + "\" command.");
			}
		}
	return false;
	}
}