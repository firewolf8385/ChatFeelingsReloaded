package firewolf8385.chatfeelingsreloaded.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import firewolf8385.chatfeelingsreloaded.SettingsManager;

public class Help implements CommandExecutor{

    SettingsManager settings = SettingsManager.getInstance();
    String grey = settings.getConfig().getString("Grey");
    String gold1 = settings.getConfig().getString("GoldOne");
    String gold2 = settings.getConfig().getString("GoldTwo");
    String yellow = settings.getConfig().getString("Yellow");
    String lightGrey = settings.getConfig().getString("LightGrey");

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(label.equalsIgnoreCase("actions")) {
            if(args.length > 0) {
                if(args[0].equalsIgnoreCase("1")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', grey + "----------" + gold1 + "Actions " + yellow + "[1/4]" + grey + "----------"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Bite-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Blush-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Boi-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Cringe-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Cry-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Dab-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Fight-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Hide-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', lightGrey + "Do " + gold2 + "/actions 2 " + lightGrey + "for the next page."));
                }
                else if(args[0].equalsIgnoreCase("2")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', grey + "----------" + gold1 + "Actions " + yellow + "[2/4]" + grey + "----------"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Highfive-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Hug-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Kiss-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Lick-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Love-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Murder-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Poke-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Punch-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', lightGrey + "Do " + gold2 + "/actions 3 " + lightGrey + "for the next page."));
                }
                else if(args[0].equalsIgnoreCase("3")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', grey + "----------" + gold1 + "Actions " + yellow + "[3/4]" + grey + "----------"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Shake-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Shoes-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Sing-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Slap-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Sleep-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Snuggle-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Spell-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Stab-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', lightGrey + "Do " + gold2 + "/actions 3 " + lightGrey + "for the next page."));
                }
                else if(args[0].equalsIgnoreCase("4")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', grey + "----------" + gold1 + "Actions " + yellow + "[4/4]" + grey + "----------"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Stalk-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Wave-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Whisper-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Wink-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Yell-Help")));
                    sender.sendMessage("");
                    sender.sendMessage("");
                    sender.sendMessage("");
                    sender.sendMessage("");
                }
                else {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', grey + "----------" + gold1 + "Actions " + yellow + "[1/4]" + grey + "----------"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Bite-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Blush-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Boi-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Cringe-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Cry-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Dab-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Fight-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Hide-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', lightGrey + "Do " + gold2 + "/actions 2 " + lightGrey + "for the next page."));
                }
            }
            else {
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', grey + "----------" + gold1 + "Actions " + yellow + "[1/4]" + grey + "----------"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Bite-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Blush-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Boi-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Cringe-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Cry-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Dab-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Fight-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Hide-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', lightGrey + "Do " + gold2 + "/actions 2 " + lightGrey + "for the next page."));
            }
        }

        if(label.equalsIgnoreCase("feelings")) {
            if(args.length > 0) {
                if(args[0].equalsIgnoreCase("1")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', grey + "----------" + gold1 + "Feelings " + yellow + "[1/3]" + grey + "----------"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Afraid-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Angry-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Annoyed-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Bored-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Calm-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Confused-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Crazy-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Excited-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', lightGrey + "Do " + gold2 + "/feelings 2 " + lightGrey + "for the next page."));
                }
                else if(args[0].equalsIgnoreCase("2")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', grey + "----------" + gold1 + "Feelings " + yellow + "[2/3]" + grey + "----------"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Guilty-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Happy-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Jealous-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Jolly-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Lonely-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Loved-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Nervous-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Sad-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', lightGrey + "Do " + gold2 + "/feelings 3 " + lightGrey + "for the next page."));
                }
                else if(args[0].equalsIgnoreCase("3")) {
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', grey + "----------" + gold1 + "Feelings " + yellow + "[1/3]" + grey + "----------"));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Scared-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Shy-Help")));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Worried-Help")));
                    sender.sendMessage("");
                    sender.sendMessage("");
                    sender.sendMessage("");
                    sender.sendMessage("");
                    sender.sendMessage("");
                    sender.sendMessage("");
                }
            }
            else{
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', grey + "----------" + gold1 + "Feelings " + yellow + "[1/3]" + grey + "----------"));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Afraid-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Angry-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Annoyed-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Bored-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Calm-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Confused-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Crazy-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', settings.getConfig().getString("Excited-Help")));
                sender.sendMessage(ChatColor.translateAlternateColorCodes('&', lightGrey + "Do " + gold2 + "/feelings 2 " + lightGrey + "for the next page."));
            }
        }
        return true;
    }

}
