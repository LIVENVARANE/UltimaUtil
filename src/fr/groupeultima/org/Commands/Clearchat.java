package fr.groupeultima.org.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Clearchat implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("clearchat") || label.equalsIgnoreCase("cc")) {
			if(sender instanceof Player) {
				if(args.length == 0) {
					for (int i = 0; i < 150; i++) {
						for(Player pl : Bukkit.getOnlinePlayers()) {
							pl.sendMessage(" ");
						}
			        }
					Bukkit.broadcastMessage(ChatColor.BLUE+"["+ChatColor.DARK_AQUA+"Ultima"+ChatColor.BLUE+"] "+ ChatColor.GOLD+ "Le chat à été vidé");
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