package fr.groupeultima.org.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetWorld implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("getworld")) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.BLUE + "You are currently in the world \"" + ChatColor.BOLD + "" + player.getWorld().getName() + ChatColor.RESET + "" + ChatColor.BLUE + "\".");
			}
			else {
				sender.sendMessage(ChatColor.RED + "[UltimaUtil] Console cannot execute \"/" + label + "\" command.");
			}
		}
	return false;
	}
}