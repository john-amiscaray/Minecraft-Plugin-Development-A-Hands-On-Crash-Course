package me.john.amiscaray.withersolution.util;

import org.bukkit.scheduler.BukkitTask;

import java.util.HashMap;
import java.util.Map;

public class ActiveEvents {

    private static Map<String, BukkitTask> activeTasks = new HashMap<>();

    /*
     Add a task with a specific ID in the activeEvents HashMap. This way active tasks can be accessed and cancelled within
     our classes separate from where they are declared. The ID's for a particular Task will be stored as a static final
     member of the class.
     */
    public static void addTask(String id, BukkitTask task){

        activeTasks.put(id, task);

    }

    public static void endTask(String id){

        activeTasks.get(id).cancel();
        activeTasks.remove(id);

    }

    public static boolean taskActive(String id){

        return activeTasks.containsKey(id);

    }

}
