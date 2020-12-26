package fr.groupeultima.org.Listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.groupeultima.org.UltimaUtil;

public class OnJoinListener implements Listener {
	
	UltimaUtil UltimaUtil;
	
	public OnJoinListener(UltimaUtil instance)
	{
		UltimaUtil = instance;
	}
	
	@EventHandler
	public void OnJoin(PlayerJoinEvent e) {
		if(UltimaUtil.getConfig().getString("Settings.AdminMode.RemoveOnLog") == "1") {
			if(e.getPlayer().isOp() == true) {
				e.getPlayer().setOp(false);
			}
			else { return; }
		}
		else { return; } 
	}
	
}
