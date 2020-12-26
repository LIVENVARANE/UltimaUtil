package fr.groupeultima.org.Commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class Skull implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
if(label.equalsIgnoreCase("skull")) {
			
			if(args.length != 0) {
				if(args.length == 1) {
					Player player = (Player) sender;
					@SuppressWarnings("deprecation")
					final OfflinePlayer oplayer = Bukkit.getServer().getOfflinePlayer(args[0]);
					ItemStack skull = new ItemStack(Material.PLAYER_HEAD);
					SkullMeta meta = (SkullMeta) skull.getItemMeta();
					meta.setOwningPlayer(oplayer);
					skull.setItemMeta(meta);
					player.getInventory().addItem(skull);
					sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GREEN + "Giving you the head of player \"" + ChatColor.BOLD + "" + args[0] + ChatColor.RESET + "" + ChatColor.GREEN + "\".");
				}
				else {
					sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Too many arguments. Please use \"/" + label + " [player]\".");
				}
			}
			else {
				sender.sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Missing arguments. Please use \"/" + label + " [player]\".");
			}
		}
	return false;
	}
}