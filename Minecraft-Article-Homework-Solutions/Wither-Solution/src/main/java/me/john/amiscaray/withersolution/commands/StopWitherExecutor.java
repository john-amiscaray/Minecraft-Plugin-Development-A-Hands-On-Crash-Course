package me.john.amiscaray.withersolution.commands;

import me.john.amiscaray.withersolution.tasks.WitherSpawnTask;
import me.john.amiscaray.withersolution.util.ActiveEvents;
import me.john.amiscaray.withersolution.util.CommandResponse;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class StopWitherExecutor implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {


        if(ActiveEvents.taskActive(WitherSpawnTask.ID)){

            ActiveEvents.endTask(WitherSpawnTask.ID);
            CommandResponse.sendCommandResponse("Successfully ended withers spawning", sender);
            return true;

        }

        return true;
    }
}
