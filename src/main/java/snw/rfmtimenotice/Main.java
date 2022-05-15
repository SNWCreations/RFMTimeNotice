package snw.rfmtimenotice;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import snw.rfm.RunForMoney;
import snw.rfm.api.events.GamePostStartEvent;
import snw.rfm.api.events.GameStopEvent;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getScheduler().cancelTasks(this);
    }

    @EventHandler
    public void onGameStart(GamePostStartEvent event) {
        Bukkit.getScheduler().runTaskTimer(this, () -> Bukkit.broadcastMessage(ChatColor.RED + "" + ChatColor.BOLD + "游戏时间剩余 " + RunForMoney.getInstance().getGameController().getGameRemainingTime() / 60), 180 * 20L, 180 * 20L);
    }

    @EventHandler
    public void onGameStop(GameStopEvent event) {
        Bukkit.getScheduler().cancelTasks(this);
    }
}
