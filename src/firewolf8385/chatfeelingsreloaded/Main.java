package firewolf8385.chatfeelingsreloaded;

import org.bukkit.plugin.java.JavaPlugin;

import firewolf8385.chatfeelingsreloaded.commands.Actions;
import firewolf8385.chatfeelingsreloaded.commands.CFR;
import firewolf8385.chatfeelingsreloaded.commands.Feelings;
import firewolf8385.chatfeelingsreloaded.commands.Help;

public class Main extends JavaPlugin{

    SettingsManager settings = SettingsManager.getInstance();

    public void onEnable() {

        settings.setup(this);

        getCommand("chatfeelingsreloaded").setExecutor(new CFR());

        getCommand("actions").setExecutor(new Help());
        getCommand("feelings").setExecutor(new Help());

        getCommand("bite").setExecutor(new Actions());
        getCommand("blush").setExecutor(new Actions());
        getCommand("boi").setExecutor(new Actions());
        getCommand("cringe").setExecutor(new Actions());
        getCommand("cry").setExecutor(new Actions());
        getCommand("dab").setExecutor(new Actions());
        getCommand("fight").setExecutor(new Actions());
        getCommand("hide").setExecutor(new Actions());
        getCommand("highfive").setExecutor(new Actions());
        getCommand("hug").setExecutor(new Actions());
        getCommand("kiss").setExecutor(new Actions());
        getCommand("lick").setExecutor(new Actions());
        getCommand("love").setExecutor(new Actions());
        getCommand("murder").setExecutor(new Actions());
        getCommand("poke").setExecutor(new Actions());
        getCommand("punch").setExecutor(new Actions());
        getCommand("shake").setExecutor(new Actions());
        getCommand("shoes").setExecutor(new Actions());
        getCommand("sing").setExecutor(new Actions());
        getCommand("slap").setExecutor(new Actions());
        getCommand("sleep").setExecutor(new Actions());
        getCommand("snuggle").setExecutor(new Actions());
        getCommand("spell").setExecutor(new Actions());
        getCommand("stab").setExecutor(new Actions());
        getCommand("stalk").setExecutor(new Actions());
        getCommand("wave").setExecutor(new Actions());
        getCommand("whisper").setExecutor(new Actions());
        getCommand("wink").setExecutor(new Actions());
        getCommand("yell").setExecutor(new Actions());

        getCommand("afraid").setExecutor(new Feelings());
        getCommand("angry").setExecutor(new Feelings());
        getCommand("annoyed").setExecutor(new Feelings());
        getCommand("bored").setExecutor(new Feelings());
        getCommand("calm").setExecutor(new Feelings());
        getCommand("confused").setExecutor(new Feelings());
        getCommand("crazy").setExecutor(new Feelings());
        getCommand("excited").setExecutor(new Feelings());
        getCommand("guilty").setExecutor(new Feelings());
        getCommand("happy").setExecutor(new Feelings());
        getCommand("jealous").setExecutor(new Feelings());
        getCommand("jolly").setExecutor(new Feelings());
        getCommand("lonely").setExecutor(new Feelings());
        getCommand("loved").setExecutor(new Feelings());
        getCommand("nervous").setExecutor(new Feelings());
        getCommand("sad").setExecutor(new Feelings());
        getCommand("scared").setExecutor(new Feelings());
        getCommand("shy").setExecutor(new Feelings());
        getCommand("worried").setExecutor(new Feelings());
    }

}
