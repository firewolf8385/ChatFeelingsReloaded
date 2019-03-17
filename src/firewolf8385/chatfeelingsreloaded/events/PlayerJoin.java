package firewolf8385.chatfeelingsreloaded.events;

import firewolf8385.chatfeelingsreloaded.SettingsManager;
import firewolf8385.chatfeelingsreloaded.Utils;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener
{
    SettingsManager settings = SettingsManager.getInstance();
    Utils utils = Utils.getInstance();

    /**
     * Runs when a player joins the server.
     * @param e The event
     */
    public void onJoin(PlayerJoinEvent e)
    {
        if(settings.getConfig().getInt("ConfigVersion") != 2)
        {
            if(e.getPlayer().hasPermission("chat.notify"))
            {
                utils.sendChat(e.getPlayer(), settings.getConfig().getString("OutdatedConfig"));
            }
        }
    }
}
