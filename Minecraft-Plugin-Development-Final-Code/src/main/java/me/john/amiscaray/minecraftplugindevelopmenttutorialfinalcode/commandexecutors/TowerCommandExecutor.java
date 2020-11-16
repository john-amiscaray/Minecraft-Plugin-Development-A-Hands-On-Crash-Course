package me.john.amiscaray.minecraftplugindevelopmenttutorialfinalcode.commandexecutors;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TowerCommandExecutor implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if(sender instanceof Player){

            Player p = (Player) sender;

            // Get the location 2 blocks in the x-axis next to the player
            Location origin = p.getLocation().add(2,0,0);

            // Set 50 blocks on the y-axis of the location to cobblestone
            for(int i = 0; i < 50; i++){

                origin.getBlock().setType(Material.COBBLESTONE);
                origin.add(0,1,0);

            }

            // Send the player a message about what just occurred
            p.sendMessage("Successfully added marker at your location");

            return true;

        }else{

            // Print to the command line that you need to be a player to execute this command
            System.out.println("Cannot execute this command on the command line");

            return false;

        }

    }

}
