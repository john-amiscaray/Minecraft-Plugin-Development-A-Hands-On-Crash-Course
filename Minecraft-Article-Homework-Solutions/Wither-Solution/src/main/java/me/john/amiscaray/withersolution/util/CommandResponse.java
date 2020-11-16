package me.john.amiscaray.withersolution.util;

import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandResponse {

    public static void sendCommandResponse(String response, CommandSender sender){

        if(sender instanceof Player){

            Player player = (Player) sender;
            player.sendMessage(response);

        }else{

            System.out.println(response);

        }

    }

}
