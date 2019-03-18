package firewolf8385.chatfeelingsreloaded.commands;

import firewolf8385.chatfeelingsreloaded.SettingsManager;
import firewolf8385.chatfeelingsreloaded.Utils;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Actions implements CommandExecutor
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

        if(sender.hasPermission("cfr.use." + command))
        {
            if(args.length != 0)
            {
                Player target = Bukkit.getPlayer(args[0]);
                String prefix = settings.getConfig().getString("Action-Prefix");
                
                if(target != null)
                {
                    if(sender == target)
                    {
                        utils.sendChat(p, settings.getConfig().getString("SelfMessage"));
                    }
                    else {
                        if(settings.getConfig().getBoolean("AnnounceActionsGlobally"))
                        {
                            String message = settings.getConfig().getString(label + ".global")
                                    .replace("%sender%", sender.getName())
                                    .replace("%s-display%", sender.getName())
                                    .replace("%target%", target.getName())
                                    .replace("%t-dispalay%", target.getDisplayName());

                            Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', prefix + message));
                        }
                        else
                        {
                            String sMessage = settings.getConfig().getString(label + ".sender");
                            String sMessage2 = sMessage
                                    .replace("%sender%", sender.getName())
                                    .replace("%s-display%", sender.getName())
                                    .replace("%target%", target.getName())
                                    .replace("%t-dispalay%", target.getDisplayName());

                            String tMessage = settings.getConfig().getString(label + ".target");
                            String tMessage2 = tMessage
                                    .replace("%sender%", sender.getName())
                                    .replace("%s-display%", sender.getName())
                                    .replace("%target%", target.getName())
                                    .replace("%t-dispalay%", target.getDisplayName());

                            utils.sendChat(p, prefix + sMessage2);
                            utils.sendChat(target, prefix + tMessage2);
                        }
                    }
                }
                else if(args[0].equalsIgnoreCase("all"))
                {
                    if(sender.hasPermission("cfr.send.all"))
                    {
                        for(Player player : Bukkit.getOnlinePlayers()){
                            String tMessage = settings.getConfig().getString(label + ".target");
                            String tMessage2 = tMessage
                                    .replace("%sender%", sender.getName())
                                    .replace("%s-display%", sender.getName())
                                    .replace("%target%", player.getName())
                                    .replace("%t-dispalay%", player.getDisplayName());

                            if(!(player.getName().equals(sender.getName())))
                            {
                                utils.sendChat(player, prefix + tMessage2);
                            }
                        }
                        String sMessage = settings.getConfig().getString(label + ".sender");
                        String sMessage2 = sMessage
                                .replace("%sender%", sender.getName())
                                .replace("%s-display%", sender.getName())
                                .replace("%target%", "everyone")
                                .replace("%t-dispalay%", "everyone");

                        utils.sendChat(p, prefix + sMessage2);
                    }
                    else
                    {
                        utils.sendChat(p, settings.getConfig().getString("NotOnline").replace("NotOnline", args[0]));
                    }
                }
                else
                {
                    utils.sendChat(p, settings.getConfig().getString("NotOnline").replace("%target%", args[0]));
                }
            }
            else
            {
                utils.sendChat(p, settings.getConfig().getString("ActionUsage").replace("%command%", command));
            }
        }
        else
        {
            utils.sendChat(p, settings.getConfig().getString("NoPermission"));
        }

        return true;
    }
}
