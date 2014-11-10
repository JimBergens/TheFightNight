package net.articcraft.listeners;
public class Signs implements Listener{
@EventHandler
public void changeSigns(SignChangeEvent e){
	if(e.getLine(0).equalsIgnoreCase("[FightNight]") && e.getPlayer().hasPermission("fightNight.signs")){
		e.setLine(0, "[§bFightN§0]");
		e.setLine(1, "§4Test.");
	}else if(!e.getPlayer().hasPermission("fightNight.signs")){
		e.getPlayer().sendMessage(ChatColor.RED+"No Permission!");
	}
}
@EventHandler
public void onPlayerInteract(PlayerInteractEvent e) {
        if (!(e.getAction() == Action.RIGHT_CLICK_BLOCK)) return;
        if (e.getClickedBlock().getState() instanceof Sign) {
                Sign s = (Sign) e.getClickedBlock().getState();
                if (s.getLine(0).equalsIgnoreCase("[§bFightN§0]")&& e.getPlayer().hasPermission("fightNight.signs")) {
                        e.getPlayer().sendMessage(ChatColor.GREEN + "Test.");
                }else if(!e.getPlayer().hasPermission("fightNight.signs")){
    		e.getPlayer().sendMessage(ChatColor.RED+"No Permission!");
    	}
}
}
}
