package net.articcraft.listeners
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinListener implements Listener{
@EventHandler
public void onPlayerJoin(PlayerJoinEvent e){
	e.getPlayer().sendMessage(ChatColor.GREEN+"Welcome to my chamber, "+ChatColor.GOLD+""+e.getPlayer().getName()+" "+ChatColor.GREEN+"The Fight Night!");
	e.setJoinMessage(ChatColor.GOLD+"A legend has joined the game.");
}
}
