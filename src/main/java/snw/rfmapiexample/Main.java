package snw.rfmapiexample;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;
import snw.rfm.ItemRegistry;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ItemRegistry.registerItem("tnt", new ItemStack(Material.TNT), new TNTRightClickProcessor());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
