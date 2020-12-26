package fr.groupeultima.org;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import fr.groupeultima.org.Commands.Clear;
import fr.groupeultima.org.Commands.Clearchat;
import fr.groupeultima.org.Commands.Crash;
import fr.groupeultima.org.Commands.Day;
import fr.groupeultima.org.Commands.Fly;
import fr.groupeultima.org.Commands.GM;
import fr.groupeultima.org.Commands.GetWorld;
import fr.groupeultima.org.Commands.Invsee;
import fr.groupeultima.org.Commands.Kill;
import fr.groupeultima.org.Commands.Night;
import fr.groupeultima.org.Commands.Ping;
import fr.groupeultima.org.Commands.Rules;
import fr.groupeultima.org.Commands.Skull;
import fr.groupeultima.org.Commands.Speed;
import fr.groupeultima.org.Commands.Sudo;
import fr.groupeultima.org.Commands.TPHere;
import fr.groupeultima.org.Commands.Time;
import fr.groupeultima.org.Commands.Toggledownfall;
import fr.groupeultima.org.Commands.adminMode;
import fr.groupeultima.org.Listener.OnJoinListener;

public class UltimaUtil extends JavaPlugin {
	
	public static UltimaUtil plugin;

	@Override
	public void onEnable() {
		
		plugin = this;
		
		Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GOLD + "Plugin has started successfully.");
		getCommand("adminmode").setExecutor(new adminMode());
		getCommand("getworld").setExecutor(new GetWorld());
		getCommand("tphere").setExecutor(new TPHere());
		getCommand("kill").setExecutor(new Kill());
		getCommand("sudo").setExecutor(new Sudo());
		getCommand("skull").setExecutor(new Skull());
		getCommand("fly").setExecutor(new Fly());
		getCommand("gmc").setExecutor(new GM());
		getCommand("gms").setExecutor(new GM());
		getCommand("gma").setExecutor(new GM());
		getCommand("gmsp").setExecutor(new GM());
		getCommand("speed").setExecutor(new Speed());
		getCommand("crash").setExecutor(new Crash());
		getCommand("toggledownfall").setExecutor(new Toggledownfall());
		getCommand("ping").setExecutor(new Ping());
		getCommand("rules").setExecutor(new Rules());
		getCommand("invsee").setExecutor(new Invsee());
		getCommand("x").setExecutor(new Clear());
		getCommand("time").setExecutor(new Time());
		getCommand("day").setExecutor(new Day());
		getCommand("night").setExecutor(new Night());
		getCommand("clearchat").setExecutor(new Clearchat());
		
		getServer().getPluginManager().registerEvents(new OnJoinListener(this), this);
	}
	
	@Override
	public void onDisable() {
		
		plugin = null;
		
		Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.GOLD + "Disabling UltimaUtil");
	}
	
	public boolean loadConfig() {
		if(!new File(getDataFolder() + File.separator + "config.yml").exists()) {
			saveDefaultConfig();
		}
		try {
			new YamlConfiguration().load(new File(getDataFolder() + File.separator + "config.yml"));
		} catch(Exception e) {
			Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_AQUA + "[UltimaUtil] " + ChatColor.RED + "Error while loading config.yml");
			Bukkit.getConsoleSender().sendMessage("Please check error dump below.");
			Bukkit.getConsoleSender().sendMessage(" ");
		    e.printStackTrace();
		    Bukkit.getPluginManager().disablePlugin(this);
		      
		    return false;
		}
		reloadConfig();
		return true;
	}
	
	public File getFile() {
		return super.getFile();
	}
}
