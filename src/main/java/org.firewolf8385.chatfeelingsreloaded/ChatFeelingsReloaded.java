package org.firewolf8385.chatfeelingsreloaded;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatFeelingsReloaded extends JavaPlugin
{
    Settings settings = Settings.getInstance();
    private static int subVersion;

    @Override
    public void onEnable() {
        // Setup settings.
        settings.setup(this);

        // Register Various Aspects Of The Plugin
        registerActions();
        registerCommands();
        registerFeelings();
        registerListeners();

        // Get server version.
        String version = Bukkit.getServer().getClass().getPackage().getName().replace(".", ",").split(",")[3];
        subVersion = Integer.parseInt(version.replace("1_", "").replaceAll("_R\\d", "").replace("v", ""));
    }

    /**
     * Register the actions made in the config.
     */
    private void registerActions() {

    }

    /**
     * Register commands used by the plugin.
     */
    private  void registerCommands() {

    }

    /**
     * Register feelings made in the config.
     */
    private void registerFeelings() {

    }

    /**
     * Register listeners used by the plugin.
     */
    private void registerListeners() {

    }

    public static int getServerVersion() {
        return subVersion;
    }

}
