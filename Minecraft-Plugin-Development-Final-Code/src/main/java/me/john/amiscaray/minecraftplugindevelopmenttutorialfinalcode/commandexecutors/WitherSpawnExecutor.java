package me.john.amiscaray.minecraftplugindevelopmenttutorialfinalcode.commandexecutors;

import me.john.amiscaray.minecraftplugindevelopmenttutorialfinalcode.MinecraftPluginTutorialFinal;
import me.john.amiscaray.minecraftplugindevelopmenttutorialfinalcode.runnables.WitherSpawnRunnable;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class WitherSpawnExecutor implements CommandExecutor {

    private Plugin plugin = MinecraftPluginTutorialFinal.getPlugin(MinecraftPluginTutorialFinal.class);

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        // If the user gave the correct number of arguments (2 arguments, initial delay, spawn delay)
        if(args.length == 2){

            // Get the initial delay and delay between spawns from the arguments. Must cast them to be Longs.
            Long initialDelay = Long.parseLong(args[0]);
            Long spawnDelay = Long.parseLong(args[1]);

            // Run the BukkitRunnable with the above timing
            new WitherSpawnRunnable(plugin).runTaskTimer(plugin, initialDelay, spawnDelay);
            return true;

        }
        return false;

    }


}
