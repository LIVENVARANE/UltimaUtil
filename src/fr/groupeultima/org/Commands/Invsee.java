package fr.groupeultima.org.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class Invsee implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("invsee")) {
			if(sender instanceof Player) {
				if(args.length != 0) {
					if(args.length == 1) {
						Player player = Bukkit.getPlayerExact(args[0]);
						if(player != null) {
							Inventory targetInv = player.getInventory();
							((Player) sender).getPlayer().openInventory(targetInv);
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