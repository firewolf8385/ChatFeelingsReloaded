package firewolf8385.chatfeelingsreloaded;

import firewolf8385.chatfeelingsreloaded.commands.Actions;
import firewolf8385.chatfeelingsreloaded.commands.CFR;
import firewolf8385.chatfeelingsreloaded.commands.Feelings;
import firewolf8385.chatfeelingsreloaded.commands.Help;
import firewolf8385.chatfeelingsreloaded.events.PlayerJoin;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;

public class ChatFeelingsReloaded extends JavaPlugin
{

    SettingsManager settings = SettingsManager.getInstance();

    /**
     * This runs necessary tasks when the plugin is enabled.
     */
    public void onEnable()
    {
        settings.setup(this);

        registerActions();
        registerFeelings();

        getCommand("chatfeelingsreloaded").setExecutor(new CFR());
        getCommand("actions").setExecutor(new Help());
        getCommand("feelings").setExecutor(new Help());

        Bukkit.getPluginManager().registerEvents(new PlayerJoin(), this);
    }

    /**
     * This registers commands idientified as "actions"
     */
    private void registerActions()
    {
        ArrayList<String> actions = new ArrayList<String>();
        actions.add("bite");
        actions.add("blush");
        actions.add("boi");
        actions.add("cringe");
        actions.add("cry");
        actions.add("dab");
        actions.add("fight");
        actions.add("hide");
        actions.add("highfive");
        actions.add("hug");
        actions.add("kiss");
        actions.add("lick");
        actions.add("love");
        actions.add("murder");
        actions.add("pat");
        actions.add("poke");
        actions.add("punch");
        actions.add("scorn");
        actions.add("shake");
        actions.add("shoes");
        actions.add("sing");
        actions.add("slap");
        actions.add("sleep");
        actions.add("snuggle");
        actions.add("spell");
        actions.add("stab");
        actions.add("stalk");
        actions.add("wave");
        actions.add("whisper");
        actions.add("wink");
        actions.add("yell");

        for(String s:actions)
        {
            getCommand(s).setExecutor(new Actions());
        }
    }

    /**
     *  This reigisters commands identified as "feelings"
     */
    private void registerFeelings()
    {
        ArrayList<String> feelings = new ArrayList<String>();
        feelings.add("afraid");
        feelings.add("angry");
        feelings.add("annoyed");
        feelings.add("bored");
        feelings.add("calm");
        feelings.add("confused");
        feelings.add("crazy");
        feelings.add("excited");
        feelings.add("guilty");
        feelings.add("happy");
        feelings.add("jealous");
        feelings.add("jolly");
        feelings.add("lonely");
        feelings.add("loved");
        feelings.add("nervous");
        feelings.add("sad");
        feelings.add("scared");
        feelings.add("shy");
        feelings.add("worried");

        for(String s:feelings)
        {
            getCommand(s).setExecutor(new Feelings());
        }
    }

}