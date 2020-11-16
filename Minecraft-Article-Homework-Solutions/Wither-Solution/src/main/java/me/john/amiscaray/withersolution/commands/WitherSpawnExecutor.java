package me.john.amiscaray.withersolution.commands;

import me.john.amiscaray.withersolution.WitherSolution;
import me.john.amiscaray.withersolution.tasks.WitherSpawnTask;
import me.john.amiscaray.withersolution.util.ActiveEvents;
import me.john.amiscaray.withersolution.util.CommandResponse;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.Plugin;

public class WitherSpawnExecutor implements CommandExecutor {

    private Plugin plugin = WitherSolution.getPlugin(WitherSolution.class);


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if(!ActiveEvents.taskActive(WitherSpawnTask.ID)){

            return spawnWither(args, sender);

        }else{

            CommandResponse.sendCommandResponse("Wither spawn already initiated. Cancel it first with /stop_withers", sender);
            return false;

        }



    }

    private boolean spawnWither(String[] args, CommandSender sender){

        Location spawn = null;
        World world = plugin.getServer().getWorld(plugin.getConfig().getString("world-name"));

        if(args.length != 2 && args.length != 5){

            String response = ChatColor.RED + "2 or 5 arguments expected, received " + args.length;
            CommandResponse.sendCommandResponse(response, sender);
            return false;

        }else if(args.length == 2){

            spawn = world.getSpawnLocation();

        }else{

            double x = Double.parseDouble(args[2]);
            double y = Double.parseDouble(args[3]);
            double z = Double.parseDouble(args[4]);

            spawn = new Location(world, x, y, z);

        }
        long initDelay = Long.parseLong(args[0]);
        long spawnDelay = Long.parseLong(args[1]);


        String response = ChatColor.AQUA + "Started Wither Spawn Successfully";
        CommandResponse.sendCommandResponse(response, sender);

        ActiveEvents.addTask(WitherSpawnTask.ID, new WitherSpawnTask(plugin, spawn).runTaskTimer(plugin, initDelay, spawnDelay));

        return true;

    }

}
