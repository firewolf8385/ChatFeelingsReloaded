package firewolf8385.chatfeelingsreloaded.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import firewolf8385.chatfeelingsreloaded.SettingsManager;
import net.md_5.bungee.api.ChatColor;

public class Feelings implements CommandExecutor{

    SettingsManager settings = SettingsManager.getInstance();

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        String command = label.toLowerCase();

        if(sender.hasPermission("chat.use" + command)) {
            if(args.length != 0) {
                Player target = Bukkit.getPlayer(args[0]);

                if(target != null) {
                    String message1 = settings.getConfig().getString(label);
                    String message2 = message1.replace("%sender%", sender.getName());

                    target.sendMessage(ChatColor.translateAlternateColorCodes('&', message2));
                }
                else {
                    sender.sendMessage(ChatColor.RED + "That player is not online.");
                }
            }
            else {
                String message1 = settings.getConfig().getString(label);
                String message2 = message1.replace("%sender%", sender.getName());
                String prefix = settings.getConfig().getString("Feelings-Prefix");

                Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', prefix + message2));
            }
        }

        return true;
    }

}
