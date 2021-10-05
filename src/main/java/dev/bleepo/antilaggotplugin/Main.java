package dev.bleepo.antilaggotplugin;

import dev.bleepo.antilaggotplugin.events.laggot;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    //IK its dogshit code ill fix it later lol

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new laggot(this), this);
        saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
