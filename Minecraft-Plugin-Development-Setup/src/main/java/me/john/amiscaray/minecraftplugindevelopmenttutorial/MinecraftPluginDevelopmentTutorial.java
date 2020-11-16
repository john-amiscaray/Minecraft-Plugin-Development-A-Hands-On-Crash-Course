package me.john.amiscaray.minecraftplugindevelopmenttutorial;

import org.bukkit.plugin.java.JavaPlugin;

public final class MinecraftPluginDevelopmentTutorial extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("Hello World");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
