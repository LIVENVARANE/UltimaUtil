package fr.groupeultima.org.Commands;

import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Time implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("time")) {
			if(sender instanceof Player) {
				if(args.length > 1) {
					if(args[0].equalsIgnoreCase("set")) {
						if(args[1].equalsIgnoreCase("day")) {
							World world = ((Player) sender).getWorld();
							world.setTime(26000);
							sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "The time of \"" + world.getName() + "\" to day.");
						}
						else if(args[1].equalsIgnoreCase("night")) {
							World world = ((Player) sender).getWorld();
							world.setTime(18000);
							sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "The time of \"" + world.getName() + "\" to night.");
						}
						else {
							try {
								long time = Long.parseLong(args[1]);
								World world = ((Player) sender).getWorld();
								world.setTime(time);
								sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "The time of \"" + world.getName() + "\" to " + time + ".");
							} catch(NumberFormatException | NullPointerException e) {
								sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Wrong arguments (time is not numbers). Please use \"/" + label + " [add/set] [time]\".");
							}
						}
					}
					else if(args[0].equalsIgnoreCase("add")) {
							try {
								long timeToAdd = Long.parseLong(args[1]);
								World world = ((Player) sender).getWorld();
								long time = timeToAdd + world.getTime();
								world.setTime(time);
								sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "The time of \"" + world.getName() + "\" to " + time + ".");
							} catch(NumberFormatException | NullPointerException e) {
								sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Wrong arguments (time is not numbers/day/night). Please use \"/" + label + " [add/set] [time]\".");
							}
					}
					else {
						sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Wrong arguments. Please use \"/" + label + " [add/set] [time]\".");
					}
				}
				else {
					sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Missing arguments. Please use \"/" + label + " [add/set] [time]\".");
				}
			}
			else {
				sender.sendMessage(ChatColor.RED + "[UltimaUtil] Console cannot execute \"/" + label + "\" command.");
			}
		}
	return false;
	}
}