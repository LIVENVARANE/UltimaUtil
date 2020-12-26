package fr.groupeultima.org.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.craftbukkit.v1_15_R1.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class Ping implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("ping")) {
			if(sender instanceof Player) {
				CraftPlayer player = (CraftPlayer) sender;
				int ping = player.getHandle().ping;
				sender.sendMessage(ChatColor.DARK_AQUA + "[Ultima] " + ChatColor.GREEN + "Votre ping est: " + ping + "ms.");
			}
			else {
				sender.sendMessage(ChatColor.RED + "[UltimaUtil] Console cannot execute \"/" + label + "\" command.");
			}
		}
	return false;
	}
}