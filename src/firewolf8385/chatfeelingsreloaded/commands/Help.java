package firewolf8385.chatfeelingsreloaded.commands;

import firewolf8385.chatfeelingsreloaded.SettingsManager;
import firewolf8385.chatfeelingsreloaded.Utils;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Help implements CommandExecutor
{
    SettingsManager settings = SettingsManager.getInstance();
    Utils utils = Utils.getInstance();
    String grey = settings.getConfig().getString("Grey");
    String gold1 = settings.getConfig().getString("GoldOne");
    String gold2 = settings.getConfig().getString("GoldTwo");
    String yellow = settings.getConfig().getString("Yellow");
    String lightGrey = settings.getConfig().getString("LightGrey");

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Player p = (Player) sender;

        if(label.equalsIgnoreCase("actions"))
        {
            if(sender.hasPermission("cfr.use.actions"))
            {
                if(args.length != 0)
                {
                    switch(args[0])
                    {
                        case "2":
                            utils.sendChat(p, grey + "----------" + gold1 + "Actions " + yellow + "[2/4]" + grey + "----------");
                            utils.sendChat(p, settings.getConfig().getString("Highfive-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Hug-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Kiss-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Lick-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Love-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Murder-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Pat-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Poke-Help"));
                            utils.sendChat(p, lightGrey + "Do " + gold2 + "/actions 3 " + lightGrey + "for the next page.");
                            break;

                        case "3":
                            utils.sendChat(p, grey + "----------" + gold1 + "Actions " + yellow + "[3/4]" + grey + "----------");
                            utils.sendChat(p, settings.getConfig().getString("Punch-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Scorn-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Shake-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Shoes-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Sing-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Slap-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Sleep-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Snuggle-Help"));
                            utils.sendChat(p, lightGrey + "Do " + gold2 + "/actions 3 " + lightGrey + "for the next page.");
                            break;

                        case "4":
                            utils.sendChat(p, grey + "----------" + gold1 + "Actions " + yellow + "[4/4]" + grey + "----------");
                            utils.sendChat(p, settings.getConfig().getString("Spell-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Stab-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Stalk-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Wave-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Whisper-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Wink-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Yell-Help"));
                            utils.sendChat(p, "");
                            utils.sendChat(p, "");
                            break;

                        default:
                            utils.sendChat(p,grey + "----------" + gold1 + "Actions " + yellow + "[1/4]" + grey + "----------");
                            utils.sendChat(p, settings.getConfig().getString("Bite-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Blush-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Boi-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Cringe-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Cry-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Dab-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Fight-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Hide-Help"));
                            utils.sendChat(p, lightGrey + "Do " + gold2 + "/actions 2 " + lightGrey + "for the next page.");
                            break;
                        }
                    }
                else
                {
                    utils.sendChat(p,grey + "----------" + gold1 + "Actions " + yellow + "[1/4]" + grey + "----------");
                    utils.sendChat(p, settings.getConfig().getString("Bite-Help"));
                    utils.sendChat(p, settings.getConfig().getString("Blush-Help"));
                    utils.sendChat(p, settings.getConfig().getString("Boi-Help"));
                    utils.sendChat(p, settings.getConfig().getString("Cringe-Help"));
                    utils.sendChat(p, settings.getConfig().getString("Cry-Help"));
                    utils.sendChat(p, settings.getConfig().getString("Dab-Help"));
                    utils.sendChat(p, settings.getConfig().getString("Fight-Help"));
                    utils.sendChat(p, settings.getConfig().getString("Hide-Help"));
                    utils.sendChat(p, lightGrey + "Do " + gold2 + "/actions 2 " + lightGrey + "for the next page.");
                }
            }
            else
            {
                utils.sendChat(p, settings.getConfig().getString("NoPermissions"));
            }
        }
        else if(label.equalsIgnoreCase("feelings"))
        {
            if(p.hasPermission("cfr.use.feelings"))
            {
                if(args.length != 0)
                {
                    switch(args[0])
                    {
                        case "2":
                            utils.sendChat(p, grey + "----------" + gold1 + "Feelings " + yellow + "[2/3]" + grey + "----------");
                            utils.sendChat(p, settings.getConfig().getString("Guilty-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Happy-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Jealous-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Jolly-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Lonely-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Loved-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Nervous-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Sad-Help"));
                            utils.sendChat(p, lightGrey + "Do " + gold2 + "/feelings 3 " + lightGrey + "for the next page.");
                            break;

                        case "3":
                            utils.sendChat(p, grey + "----------" + gold1 + "Feelings " + yellow + "[3/3]" + grey + "----------");
                            utils.sendChat(p, settings.getConfig().getString("Scared-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Shy-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Worried-Help"));
                            utils.sendChat(p, "");
                            utils.sendChat(p, "");
                            utils.sendChat(p, "");
                            utils.sendChat(p, "");
                            utils.sendChat(p, "");
                            utils.sendChat(p, "");
                            break;

                        default:
                            utils.sendChat(p, grey + "----------" + gold1 + "Feelings " + yellow + "[1/3]" + grey + "----------");
                            utils.sendChat(p, settings.getConfig().getString("Afraid-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Angry-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Annoyed-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Bored-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Calm-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Confused-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Crazy-Help"));
                            utils.sendChat(p, settings.getConfig().getString("Excited-Help"));
                            utils.sendChat(p, lightGrey + "Do " + gold2 + "/feelings 2 " + lightGrey + "for the next page.");
                            break;
                    }
                }
                else
                {
                    utils.sendChat(p, grey + "----------" + gold1 + "Feelings " + yellow + "[1/3]" + grey + "----------");
                    utils.sendChat(p, settings.getConfig().getString("Afraid-Help"));
                    utils.sendChat(p, settings.getConfig().getString("Angry-Help"));
                    utils.sendChat(p, settings.getConfig().getString("Annoyed-Help"));
                    utils.sendChat(p, settings.getConfig().getString("Bored-Help"));
                    utils.sendChat(p, settings.getConfig().getString("Calm-Help"));
                    utils.sendChat(p, settings.getConfig().getString("Confused-Help"));
                    utils.sendChat(p, settings.getConfig().getString("Crazy-Help"));
                    utils.sendChat(p, settings.getConfig().getString("Excited-Help"));
                    utils.sendChat(p, lightGrey + "Do " + gold2 + "/feelings 2 " + lightGrey + "for the next page.");
                }
            }
            else
            {
                utils.sendChat(p, settings.getConfig().getString("NoPermission"));
            }
        }

        return true;
    }

}
