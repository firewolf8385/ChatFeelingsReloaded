package firewolf8385.chatfeelingsreloaded.commands;

import firewolf8385.chatfeelingsreloaded.SettingsManager;
import firewolf8385.chatfeelingsreloaded.Utils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Feelings implements CommandExecutor
{
    SettingsManager settings = SettingsManager.getInstance();
    Utils utils = Utils.getInstance();


    /**
     *  This allows us to process a command.
     *
     * @param sender Player who sent the command
     * @param cmd The name of the command in plugin.yml
     * @param label The name of the command
     * @param args command arguments
     * @return if the command ran successfully.
     */
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        String command = label.toLowerCase();
        Player p = (Player) sender;

        if(p.hasPermission("cfr.use." + command))
        {
            if(args.length != 0)
            {
                Player target = Bukkit.getPlayer(args[0]);

                if(target != null)
                {
                    String message1 = settings.getConfig().getString(command);
                    String message2 = message1.replace("%sender%", p.getName()).replace("%s-display%", p.getDisplayName());
                    String prefix = settings.getConfig().getString("Feelings-Prefix");

                    utils.sendChat(p, prefix + message2);
                    utils.sendChat(target, prefix + message2);
                }
                else
                {
                    utils.sendChat(p, settings.getConfig().getString(""));
                }
            }
            else
            {
                String message1 = settings.getConfig().getString(command);
                String message2 = message1.replace("%sender%", p.getName()).replace("%s-display%", p.getDisplayName());
                String prefix = settings.getConfig().getString("Feelings-Prefix");

                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', prefix + message2));
            }
        }
        else
        {
            utils.sendChat(p, settings.getConfig().getString("NoPermissions"));
        }

        return true;
    }

}