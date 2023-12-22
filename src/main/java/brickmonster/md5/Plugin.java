package brickmonster.md5;

import net.kyori.adventure.key.Key;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.kyori.adventure.text.format.TextColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onEvent(PlayerJoinEvent event) {
        TextComponent outer = Component.text()
            .append(
                Component.text()
                    .append(Component.text("hello"))
                    .append(Component.text("there").color(TextColor.color(0xff0000)))
                    .append(Component.text("friend").font(Key.key("minecraft", "default")))
                    .build()
            )
            .build();
        event.getPlayer().playerListName(outer);
    }
}
