package fr.groupeultima.org.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Sudo implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("sudo")) {
			if(args.length != 0) {
				if(args.length != 1) {
					Player player = Bukkit.getPlayerExact(args[0]);
					if(player != null) {
						StringBuilder sb = new StringBuilder();
				        for(int i = 1; i < args.length; i++) {
				            if (i > 1) sb.append(" ");
				            sb.append(args[i]);
				        }
				        player.chat(sb + "");
						sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Player \"" + ChatColor.BOLD + "" + args[0] + ChatColor.RESET + "" + ChatColor.GREEN + "\" executed command \"" + sb + "\".");
					}
					else {
						sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Player \"" + args[0] + "\" is not online. Please use a connected player name.");
					}
				}
				else {
					sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Missing arguments. Please use \"/" + label + " [player] [command]\".");
				}
			}
			else {
				sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Missing arguments. Please use \"/" + label + " [player] [command]\".");
			}
		}
	return false;
	}
}