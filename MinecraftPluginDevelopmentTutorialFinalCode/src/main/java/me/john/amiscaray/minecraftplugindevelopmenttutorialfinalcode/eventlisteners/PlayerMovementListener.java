package me.john.amiscaray.minecraftplugindevelopmenttutorialfinalcode.eventlisteners;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMovementListener implements Listener {

    @EventHandler
    public void onPlayerMove(PlayerMoveEvent event){

        // Get the player that just moved
        Player p = event.getPlayer();

        // Get the Block right below the player
        Block b = p.getLocation().getBlock().getRelative(BlockFace.DOWN);

        // Create an explosion of power 5 on the player's location
        if (b.getType() == Material.GRASS_BLOCK){

            World w = p.getWorld();
            w.createExplosion(p.getLocation(), 5);

        }

    }


}
