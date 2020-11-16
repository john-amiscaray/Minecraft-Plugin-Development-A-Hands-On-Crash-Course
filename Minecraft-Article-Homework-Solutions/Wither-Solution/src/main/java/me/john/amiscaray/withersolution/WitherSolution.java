package me.john.amiscaray.withersolution;

import me.john.amiscaray.withersolution.commands.StopWitherExecutor;
import me.john.amiscaray.withersolution.commands.WitherSpawnExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class WitherSolution extends JavaPlugin {

    @Override
    public void onEnable() {

        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getServer().getPluginCommand("continuous_wither_spawn").setExecutor(new WitherSpawnExecutor());
        getServer().getPluginCommand("stop_withers").setExecutor(new StopWitherExecutor());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
