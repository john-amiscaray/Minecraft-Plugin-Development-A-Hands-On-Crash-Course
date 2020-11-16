package me.john.amiscaray.emeraldsolution;

import me.john.amiscaray.emeraldsolution.listeners.ChunkLoadListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class EmeraldSolution extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new ChunkLoadListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
