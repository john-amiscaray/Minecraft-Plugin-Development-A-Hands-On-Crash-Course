package me.john.amiscaray.minecraftplugindevelopmenttutorialfinalcode;

import me.john.amiscaray.minecraftplugindevelopmenttutorialfinalcode.commandexecutors.TowerCommandExecutor;
import me.john.amiscaray.minecraftplugindevelopmenttutorialfinalcode.commandexecutors.WitherSpawnExecutor;
import me.john.amiscaray.minecraftplugindevelopmenttutorialfinalcode.eventlisteners.MobSpawnListener;
import me.john.amiscaray.minecraftplugindevelopmenttutorialfinalcode.eventlisteners.PlayerMovementListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftPluginTutorialFinal extends JavaPlugin {

    @Override
    public void onEnable() {

        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new PlayerMovementListener(), this);
        getServer().getPluginManager().registerEvents(new MobSpawnListener(), this);
        getServer().getPluginCommand("mark-location").setExecutor(new TowerCommandExecutor());
        getServer().getPluginCommand("continuous-wither-spawn").setExecutor(new WitherSpawnExecutor());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
