package net.articcraft.thefightnight;

/*
 * File: TheFightNight.java
 * Copyright (C) Articcraft.net 2014 All rights reserved.
 * Do not duplicate, publish, modify or otherwise distribute.
 */
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Matthew H
 * @author Jim Bergens
 */
public class TheFightNight extends JavaPlugin {

    private static Plugin instance;

    @Override
    public void onEnable() {
        instance = this;
        
        this.getServer().getPluginManager().registerEvents(new SignClass, this);
        this.getServer().getPluginManager().registerEvents(new JoinListener, this);
    }

    @Override
    public void onDisable() {
        instance = null;
    }

    /**
     * @return the Bukkit Plugin instance.
     */
    public static Plugin getInstance() { return instance; }
}
