package firewolf8385.chatfeelingsreloaded.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import firewolf8385.chatfeelingsreloaded.SettingsManager;

public class Actions implements CommandExecutor{

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        SettingsManager settings = SettingsManager.getInstance();
        String command = label.toLowerCase();

        if(sender.hasPermission("cfr.use." + command)) {
            if(args.length != 0){
                Player target = Bukkit.getPlayer(args[0]);

                if(target != null){

                    if(sender == target){
                        sender.sendMessage(ChatColor.RED + "You cannot send that to yourself!");
                    }
                    else{
                        String sMessage = settings.getConfig().getString(label + ".sender");
                        String sMessage2 = sMessage.replace("%sender%", sender.getName()).replace("%s-display%", sender.getName()).replace("%target%", target.getName()).replace("%t-dispalay%", target.getDisplayName());

                        String tMessage = settings.getConfig().getString(label + ".target");
                        String tMessage2 = tMessage.replace("%sender%", sender.getName()).replace("%s-display%", sender.getName()).replace("%target%", target.getName()).replace("%t-dispalay%", target.getDisplayName());

                        String prefix = settings.getConfig().getString("Action-Prefix");

                        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + sMessage2));
                        target.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + tMessage2));
                    }
                }
                else{
                    sender.sendMessage(ChatColor.RED + "That player is not online.");
                }
            }
            else{
                sender.sendMessage(ChatColor.RED + "Usage: /" + command + " [player]");
            }
        }

        return true;
    }

}
