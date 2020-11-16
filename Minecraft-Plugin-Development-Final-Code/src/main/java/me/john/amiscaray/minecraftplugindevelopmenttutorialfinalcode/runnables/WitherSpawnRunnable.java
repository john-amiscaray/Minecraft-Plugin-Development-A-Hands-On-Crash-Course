package me.john.amiscaray.minecraftplugindevelopmenttutorialfinalcode.runnables;

import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class WitherSpawnRunnable extends BukkitRunnable {

    private final Plugin plugin;

    public WitherSpawnRunnable(Plugin plugin) {

        // Get the main class that extends JavaPlugin so we can access config variables.
        this.plugin = plugin;

    }

    @Override
    public void run() {

        // Get the world the players are in.
        String name = plugin.getConfig().getString("world-name");
        World w = plugin.getServer().getWorld(name);

        // Spawn a wither at the world spawn location
        w.spawnEntity(w.getSpawnLocation(), EntityType.WITHER);

    }

}