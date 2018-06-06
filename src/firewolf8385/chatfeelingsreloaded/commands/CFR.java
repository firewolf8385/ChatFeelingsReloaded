package firewolf8385.chatfeelingsreloaded.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import firewolf8385.chatfeelingsreloaded.SettingsManager;
import net.md_5.bungee.api.ChatColor;

public class CFR implements CommandExecutor{

    SettingsManager settings = SettingsManager.getInstance();

    String one = settings.getConfig().getString("Grey");
    String two = settings.getConfig().getString("GoldOne");
    String three = settings.getConfig().getString("GoldTwo");

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if(args.length != 0){
            if(args[0].equalsIgnoreCase("info") || args[0].equalsIgnoreCase("i")){
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', one + "----------" + two + "ChatFeelings Reloaded" + one + "----------"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', three + "Version &8- &r2.0"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', three + "Author &8- &rFireWolf"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', three + "Spigot &8- &rhttps://www.spigotmc.org/resources/chatfeelings-reloaded.45169/"));
            }
            else if(args[0].equalsIgnoreCase("version") || args[0].equalsIgnoreCase("v")){
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', three + "Running &rChatFeelingsReloaded " + three + "version &f2.0"));
            }
            else if(args[0].equalsIgnoreCase("disable") || args[0].equalsIgnoreCase("d")){

            }
            else if(args[0].equalsIgnoreCase("help")){
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l----------&6&lCFR Help&8&l----------"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6/cfr help &8- &rShows the help page."));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6/cfr version &8- &rShows the plugin version."));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6/cfr info &8- &rShows extra plugin info."));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6/cfr reload &8- &rReloads the config."));
            }
            else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l----------&6&lCFR Help&8&l----------"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6/cfr help &8- &rShows the help page."));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6/cfr version &8- &rShows the plugin version."));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6/cfr info &8- &rShows extra plugin info."));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6/cfr reload &8- &rReloads the config."));
            }
        }
        else{
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&l----------&6&lCFR Help&8&l----------"));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6/cfr help &8- &rShows the help page."));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6/cfr version &8- &rShows the plugin version."));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6/cfr info &8- &rShows extra plugin info."));
            sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6/cfr reload &8- &rReloads the config."));
        }

        return true;
    }

}
