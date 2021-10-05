package dev.bleepo.antilaggotplugin.events;

import dev.bleepo.antilaggotplugin.Main;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.HashSet;

public class laggot implements Listener {

    HashSet<String> laggots = new HashSet<>();

    private final Main plugin;

    public laggot(Main plugin) {
        this.plugin = plugin;
    }

    public void getLaggots() {
        if (plugin.getConfig().getStringList("fuckingretards") != null) {
            laggots.addAll(plugin.getConfig().getStringList("fuckingretards"));
        }
    }

    public void onRetardLaggotConnect(PlayerJoinEvent e) {
        Player player = e.getPlayer();
        getLaggots();
        if (laggots.contains(player.getDisplayName())) {
            for (int i = 0; i < 200; ++i) {
                player.playSound(player.getLocation(), Sound.ENTITY_BAT_DEATH, 999999999, 1000);
                player.spawnParticle(Particle.EXPLOSION_HUGE, player.getLocation(), 80000);
            }
        }
    }
}
