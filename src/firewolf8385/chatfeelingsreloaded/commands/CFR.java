package firewolf8385.chatfeelingsreloaded.commands;

import firewolf8385.chatfeelingsreloaded.SettingsManager;
import firewolf8385.chatfeelingsreloaded.Utils;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;

public class CFR implements CommandExecutor
{
    SettingsManager settings = SettingsManager.getInstance();
    Utils utils = Utils.getInstance();

    String colorOne = settings.getConfig().getString("Grey");
    String colorTwo = settings.getConfig().getString("GoldOne");
    String colorThree = settings.getConfig().getString("GoldTwo");

    @Override
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
        Player p = (Player) sender;
        if(args.length != 0)
        {
            switch(args[0].toLowerCase())
            {
                // Display plugin help page.
                case "help":
                    utils.sendChat(p, colorOne + "----------" + colorTwo + "ChatFeelings Reloaded" + colorOne + "----------");
                    utils.sendChat(p, colorThree + "/cfr info " + colorOne + "- &rShows extra plugin info.");
                    utils.sendChat(p, colorThree + "/cfr support " + colorOne + "- &rShows the support discord link.");
                    utils.sendChat(p, colorThree + "/cfr reload " + colorOne + "- &rReloads the config.");
                    break;

                // Displays plugin version.
                case "version":
                    utils.sendChat(p, colorOne + "----------" + colorTwo + "ChatFeelings Reloaded" + colorOne + "----------");
                    utils.sendChat(p, colorThree + "Version " + colorOne + "- &r2.3.0");
                    break;

                // Displays link to support discord.
                case "support":
                    utils.sendChat(p, colorOne + "----------" + colorTwo + "ChatFeelings Reloaded" + colorOne + "----------");
                    utils.sendChat(p, colorThree + "Discord " + colorOne + "- *rhttps://discord.gg/FtBteC8");
                    break;

                // Reloads the plugin's config file.
                case "reload":
                    if(p.hasPermission("cfr.admin"))
                    {
                        settings.reloadConfig();
                        utils.sendChat(p, settings.getConfig().getString("ConfigReloaded"));
                    }
                    else
                    {
                        utils.sendChat(p, settings.getConfig().getString("NoPermission"));
                    }
                    break;

                // Displays information about the plugin.
                default:
                    utils.sendChat(p, colorOne + "----------" + colorTwo + "ChatFeelings Reloaded" + colorOne + "----------");
                    utils.sendChat(p, colorThree + "Version " + colorOne + "- &r2.3.0");
                    utils.sendChat(p, colorThree + "Author " + colorOne + "- &rFireWolf");
                    utils.sendChat(p, colorThree + "Spigot " + colorOne + "- &rhttps://www.spigotmc.org/resources/chatfeelings-reloaded.45169/");
                    break;
            }
        }
        else
        {
            utils.sendChat(p, colorOne + "----------" + colorTwo + "ChatFeelings Reloaded" + colorOne + "----------");
            utils.sendChat(p, colorThree + "Version " + colorOne + "- &r2.3.0");
            utils.sendChat(p, colorThree + "Author " + colorOne + "- &rFireWolf");
            utils.sendChat(p, colorThree + "Spigot " + colorOne + "- &rhttps://www.spigotmc.org/resources/chatfeelings-reloaded.45169/");
        }
        return true;
    }

}
