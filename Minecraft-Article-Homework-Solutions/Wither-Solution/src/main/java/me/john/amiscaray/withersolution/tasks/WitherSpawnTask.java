package me.john.amiscaray.withersolution.tasks;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class WitherSpawnTask extends BukkitRunnable {

    private Plugin plugin;
    private Location spawn;
    public static final String ID = "WITHER_TASK";

    public WitherSpawnTask(Plugin plugin, Location spawn) {
        this.plugin = plugin;
        this.spawn = spawn;
    }

    @Override
    public void run() {

        String name = plugin.getConfig().getString("world-name");
        World w = plugin.getServer().getWorld(name);
        w.spawnEntity(spawn, EntityType.WITHER);

    }
}
