package org.firewolf8385.chatfeelingsreloaded;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;
import java.io.File;
import java.io.IOException;

public class Settings
{

    private Settings() {}
    static Settings instance = new Settings();

    /**
     * This allows us to access an instance of this class.
     */
    public static Settings getInstance()
    {
        return instance;
    }

    Plugin pl;
    FileConfiguration config;
    File configFile;

    FileConfiguration commands;
    File commandsFile;

    FileConfiguration  messages;
    File messagesFile;


    /**
     * This allows us to set up the config file if it does not exist.
     * @param pl Instance of the Plugin
     */
    public void setup(Plugin pl)
    {
        config = pl.getConfig();
        config.options().copyDefaults(true);
        configFile = new File(pl.getDataFolder(), "config.yml");
        pl.saveDefaultConfig();

        commandsFile = new File(pl.getDataFolder(), "commands.yml");
        commands = YamlConfiguration.loadConfiguration(commandsFile);

        messagesFile = new File(pl.getDataFolder(), "messages.yml");
        messages = YamlConfiguration.loadConfiguration(messagesFile);

        if(!commandsFile.exists())
        {
            pl.saveResource("commands.yml", false);
        }

        if(!messagesFile.exists())
        {
            pl.saveResource("messages.yml", false);
        }
    }

    public FileConfiguration getCommands()
    {
        return commands;
    }

    /**
     * Allows us to access the config file.
     * @return config file
     */
    public FileConfiguration getConfig()
    {
        return config;
    }

    public FileConfiguration getMessages()
    {
         return messages;
    }

    public void saveCommands()
    {
        try
        {
            commands.save(commandsFile);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * Allows us to save the config file after changes are made.
     */
    public void saveConfig()
    {
        try
        {
            config.save(configFile);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
    }

    public void saveMessages()
    {
        try
        {
            messages.save(messagesFile);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    /**
     * This updates the config in case changes are made.
     */
    public void reloadConfig()
    {
        config = YamlConfiguration.loadConfiguration(configFile);
    }
}
