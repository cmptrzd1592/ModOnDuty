package com.github.cmptrzd1592.ModDuty;

import java.util.logging.Logger;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.Bukkit;

@SuppressWarnings("unused")
public class ModDuty extends JavaPlugin {

	@Override
	public void onEnable(){
		getLogger().info("onEnable has been invoked!");
	}
	
	@Override
	public void onDisable(){
		getLogger().info("onDisable has been invoked!");
	}
	
    public boolean isOnDuty = false;
	 
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            if(cmd.getName().equalsIgnoreCase("modduty")){
             if (sender instanceof Player) {
            	 Player player = (Player) sender;
             }
                if(!isOnDuty){
                	isOnDuty = true;
                    Bukkit.broadcastMessage(ChatColor.GREEN + sender.getName() + " is now doing modreqs.");
                }else if(isOnDuty){
                	isOnDuty = false;
                        Bukkit.broadcastMessage(ChatColor.GREEN + sender.getName() + " is" + ChatColor.DARK_RED  + " not" + ChatColor.GREEN + " currently doing modreqs.");
                } else {
                        return false;
                }
            }
            return false;
    }
}