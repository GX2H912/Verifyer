package me.firecrystal12;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Verify extends JavaPlugin{
	
	@Override
	public void onEnable(){
		    getLogger().info("FireCrystal12's auto verifyer has been Enabled!");
	}
	@Override
    public void onDisable() {
		
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		if(cmd.getName().equalsIgnoreCase("verify")){
			if(sender instanceof Player){
				   Player player = (Player) sender;
				   player.sendMessage(ChatColor.DARK_GREEN + "You Have been logged in, and seem to be an imposter!" + ChatColor.DARK_RED + "Please verify yourself on our website in the shoutbox!");
			}
		}
		
		
		return false;
	}
	
}

