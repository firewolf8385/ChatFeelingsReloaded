package org.firewolf8385.chatfeelingsreloaded;

import org.bukkit.plugin.java.JavaPlugin;

public class ChatFeelingsReloaded extends JavaPlugin
{
    Settings settings = Settings.getInstance();

    @Override
    public void onEnable()
    {
        // Setup settings.
        settings.setup(this);

        // Register Various Aspects Of The Plugin
        registerActions();
        registerCommands();
        registerFeelings();
        registerListeners();
    }

    /**
     * Register the actions made in the config.
     */
    private void registerActions()
    {

    }

    /**
     * Register commands used by the plugin.
     */
    private  void registerCommands()
    {

    }

    /**
     * Register feelings made in the config.
     */
    private void registerFeelings()
    {

    }

    /**
     * Register listeners used by the plugin.
     */
    private void registerListeners()
    {

    }

}
