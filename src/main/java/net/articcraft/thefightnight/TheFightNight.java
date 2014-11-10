package net.articcraft.thefightnight;

/*
 * File: Main.java
 * CopyRight (C) Articcraft.net 2014 All rights reserved.
 * Do not duplicate, publish, modify or otherwise distribute.
 */

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Matthew H
 */
public class TheFightNight extends JavaPlugin {

    private static Plugin instance;

    @Override
    public void onEnable() {
        instance = this;
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