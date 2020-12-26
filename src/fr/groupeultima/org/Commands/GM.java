package fr.groupeultima.org.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GM implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("gmc")) {
			if(sender instanceof Player) {
				if(args.length == 0) {
					((Player) sender).getPlayer().setGameMode(GameMode.CREATIVE);
					sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Switching to creative mode.");
				}
				else if(args.length == 1) {
					Player player = Bukkit.getPlayerExact(args[0]);
					if(player != null) {
						player.setGameMode(GameMode.CREATIVE);
						sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Switching player \"" + ChatColor.BOLD + "" + args[0] + ChatColor.RESET + "" + ChatColor.GREEN + "\" to creative mode.");
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
		else if(label.equalsIgnoreCase("gms")) {
			if(sender instanceof Player) {
				if(args.length == 0) {
					((Player) sender).getPlayer().setGameMode(GameMode.SURVIVAL);
					sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Switching to survival mode.");
				}
				else if(args.length == 1) {
					Player player = Bukkit.getPlayerExact(args[0]);
					if(player != null) {
						player.setGameMode(GameMode.SURVIVAL);
						sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Switching player \"" + ChatColor.BOLD + "" + args[0] + ChatColor.RESET + "" + ChatColor.GREEN + "\" to survival mode.");
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
		else if(label.equalsIgnoreCase("gma")) {
			if(sender instanceof Player) {
				if(args.length == 0) {
					((Player) sender).getPlayer().setGameMode(GameMode.ADVENTURE);
					sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Switching to adventure mode.");
				}
				else if(args.length == 1) {
					Player player = Bukkit.getPlayerExact(args[0]);
					if(player != null) {
						player.setGameMode(GameMode.ADVENTURE);
						sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Switching player \"" + ChatColor.BOLD + "" + args[0] + ChatColor.RESET + "" + ChatColor.GREEN + "\" to adventure mode.");
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
		else if(label.equalsIgnoreCase("gmsp")) {
			if(sender instanceof Player) {
				if(args.length == 0) {
					((Player) sender).getPlayer().setGameMode(GameMode.SPECTATOR);
					sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Switching to spectator mode.");
				}
				else if(args.length == 1) {
					Player player = Bukkit.getPlayerExact(args[0]);
					if(player != null) {
						player.setGameMode(GameMode.SPECTATOR);
						sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Switching player \"" + ChatColor.BOLD + "" + args[0] + ChatColor.RESET + "" + ChatColor.GREEN + "\" to spectator mode.");
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