package me.john.amiscaray.emeraldsolution.listeners;

import org.bukkit.Bukkit;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;

public class ChunkLoadListener implements Listener {

    @EventHandler
    public void onChunkLoad(ChunkLoadEvent e){

        Chunk chunk = e.getChunk();
        // Check if the chunk contains
        if (chunk.contains(Bukkit.createBlockData(Material.EMERALD_ORE))){

            int highestY = chunk.getChunkSnapshot().getHighestBlockYAt(7,7);
            Block b = chunk.getBlock(7, highestY, 7);
            b.setType(Material.OAK_SIGN);
            Sign sign = (Sign) b.getState();
            sign.setLine(0, "EMERALD");
            sign.update();


        }


    }

}
