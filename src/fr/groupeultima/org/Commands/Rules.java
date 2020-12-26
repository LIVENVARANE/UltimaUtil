package fr.groupeultima.org.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Rules implements CommandExecutor {
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		if(label.equalsIgnoreCase("rules") || label.equalsIgnoreCase("regles") || label.equalsIgnoreCase("règles")) {
			if(sender instanceof Player) {
				Player player = (Player) sender;
				player.getPlayer().sendMessage(" ");
				player.getPlayer().sendMessage(ChatColor.DARK_GRAY + "\\_____________________/" + ChatColor.DARK_AQUA + "" + ChatColor.BOLD + "Règles" + ChatColor.RESET + "" + ChatColor.DARK_GRAY + "\\_____________________/");
				player.getPlayer().sendMessage(" ");
				player.getPlayer().sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "1- " + ChatColor.RESET + "" + ChatColor.GOLD + "Les insultes, langage déplacé et menaces ne sont PAS tolérés. Respectez les autres, quoi.");
				player.getPlayer().sendMessage(" ");
				player.getPlayer().sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "2- " + ChatColor.RESET + "" + ChatColor.GOLD + "La publicité, les liens, la vente dans le seveur est interdit. c'est marqué UltimaMarketplace ? Je crois pas");
				player.getPlayer().sendMessage(" ");
				player.getPlayer().sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "3- " + ChatColor.RESET + "" + ChatColor.GOLD + "Ici, on triche/cheat/hack pas! C'est vraiment nul de devoir tricher, MERDE! (Anti-jeu aussi)");
				
				player.getPlayer().sendMessage(" ");player.getPlayer().sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "4- Si vous trouvez un bug, DITES LE NOUS, on vous récompensera gracieusement! (Use-bug interdit.)");
				player.getPlayer().sendMessage(" ");
				player.getPlayer().sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "5- " + ChatColor.RESET + "" + ChatColor.GOLD + "Contourner une sanction est passible d'un ban PERMANENT!");
				player.getPlayer().sendMessage(" ");
				player.getPlayer().sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "6- " + ChatColor.RESET + "" + ChatColor.GOLD + "De plus, un admin (pas en dessous) se réserve le droit de vous sanctionner SANS RAISON.");
				player.getPlayer().sendMessage(" ");
				player.getPlayer().sendMessage(ChatColor.YELLOW + "" + ChatColor.BOLD + "X- " + ChatColor.RESET + "" + ChatColor.GOLD + "Si vous avez une quelquonque question, adressez vous à l'équipe connectée ou via la page support de notre site! (www.groupe-ultima.com/support)");
				player.getPlayer().sendMessage(" ");
				player.getPlayer().sendMessage(ChatColor.DARK_GRAY + "\\_________________________________________________/");
				player.getPlayer().sendMessage(" ");

			}
			else {
				sender.sendMessage(ChatColor.RED + "[UltimaUtil] Console cannot execute \"/" + label + "\" command.");
			}
		}
	return false;
	}
}