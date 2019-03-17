package firewolf8385.chatfeelingsreloaded;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Utils
{
    private Utils() {}
    static Utils instance = new Utils();

    /**
     * Allows us to access the Utils class
     * @return an instance of the class
     */
    public static Utils getInstance()
    {
        return instance;
    }

    public void sendChat(Player p, String s)
    {
        p.sendMessage(ChatColor.translateAlternateColorCodes('&', s));
    }
}
