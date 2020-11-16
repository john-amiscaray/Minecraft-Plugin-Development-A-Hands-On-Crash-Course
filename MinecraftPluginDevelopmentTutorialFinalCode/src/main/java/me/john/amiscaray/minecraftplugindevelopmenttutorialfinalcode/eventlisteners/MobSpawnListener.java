package me.john.amiscaray.minecraftplugindevelopmenttutorialfinalcode.eventlisteners;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Monster;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.inventory.ItemStack;

public class MobSpawnListener implements Listener {


    @EventHandler
    public void onMobSpawn(CreatureSpawnEvent event){

        LivingEntity entity = event.getEntity();

        if(entity instanceof Monster){

            // Give the Monster full diamond armor.
            entity.getEquipment().setBoots(new ItemStack(Material.DIAMOND_BOOTS));
            entity.getEquipment().setChestplate(new ItemStack(Material.DIAMOND_CHESTPLATE));
            entity.getEquipment().setHelmet(new ItemStack(Material.DIAMOND_HELMET));
            entity.getEquipment().setLeggings(new ItemStack(Material.DIAMOND_LEGGINGS));
            if(entity.getType() == EntityType.SKELETON){

                // Create an enchanted bow and give it to the skeleton.
                ItemStack bow = new ItemStack(Material.BOW);
                bow.addEnchantment(Enchantment.ARROW_DAMAGE, 4);
                entity.getEquipment().setItemInMainHand(bow);

            }

            if (entity.getType() == EntityType.CREEPER){

                entity.setInvisible(true);

            }


        }
    }


}
