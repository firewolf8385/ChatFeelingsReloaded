package org.firewolf8385.chatfeelingsreloaded.utils;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.firewolf8385.chatfeelingsreloaded.ChatFeelingsReloaded;
import org.firewolf8385.chatfeelingsreloaded.enums.DefaultFontInfo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChatUtils {
    private final static int CENTER_PX = 154;

    /**
     * A quicker way to send colored messages to the player in chat.
     * @param p Player
     * @param message Message to be sent.
     */
    public static void chat(Player p, String message) {
        p.sendMessage(translate(message));
    }

    /**
     * A quicker way to send colored messages to a command sender.
     * @param sender Command Sender
     * @param message Message to be sent.
     */
    public static void chat(CommandSender sender, String message) {
        sender.sendMessage(translate(message));
    }

    /**
     * Send a centered chat message to a player.
     * @param player Player
     * @param message nessage
     */
    public static void centeredChat(Player player, String message) {
        message = translate(message);

        if(message == null || message.equals("")) player.sendMessage("");
        message = ChatColor.translateAlternateColorCodes('&', message);

        int messagePxSize = 0;
        boolean previousCode = false;
        boolean isBold = false;

        for(char c : message.toCharArray()) {
            if(c == '§') {
                previousCode = true;
                continue;
            }
            else if(previousCode == true) {
                previousCode = false;
                if(c == 'l' || c == 'L') {
                    isBold = true;
                    continue;
                }
                else isBold = false;
            }
            else {
                DefaultFontInfo dFI = DefaultFontInfo.getDefaultFontInfo(c);
                messagePxSize += isBold ? dFI.getBoldLength() : dFI.getLength();
                messagePxSize++;
            }
        }

        int halvedMessageSize = messagePxSize / 2;
        int toCompensate = CENTER_PX - halvedMessageSize;
        int spaceLength = DefaultFontInfo.SPACE.getLength() + 1;
        int compensated = 0;
        StringBuilder sb = new StringBuilder();
        while(compensated < toCompensate) {
            sb.append(" ");
            compensated += spaceLength;
        }
        player.sendMessage(sb.toString() + message);
    }

    /**
     * Sender a centered chat message to a CommandSender.
     * @param sender Command Sender
     * @param message Message
     */
    public static void centeredChat(CommandSender sender, String message) {
        message = translate(message);

        if(message == null || message.equals("")) sender.sendMessage("");
        message = ChatColor.translateAlternateColorCodes('&', message);

        int messagePxSize = 0;
        boolean previousCode = false;
        boolean isBold = false;

        for(char c : message.toCharArray()) {
            if(c == '§') {
                previousCode = true;
                continue;
            }
            else if(previousCode == true) {
                previousCode = false;
                if(c == 'l' || c == 'L') {
                    isBold = true;
                    continue;
                }
                else isBold = false;
            }
            else {
                DefaultFontInfo dFI = DefaultFontInfo.getDefaultFontInfo(c);
                messagePxSize += isBold ? dFI.getBoldLength() : dFI.getLength();
                messagePxSize++;
            }
        }

        int halvedMessageSize = messagePxSize / 2;
        int toCompensate = CENTER_PX - halvedMessageSize;
        int spaceLength = DefaultFontInfo.SPACE.getLength() + 1;
        int compensated = 0;
        StringBuilder sb = new StringBuilder();
        while(compensated < toCompensate) {
            sb.append(" ");
            compensated += spaceLength;
        }
        sender.sendMessage(sb.toString() + message);
    }

    /**
     * Translate a String to a colorful String.
     * @param message Message to translate.
     * @return Translated Message.
     */
    public static String translate(String message) {
        if(ChatFeelingsReloaded.getServerVersion() >= 16) {
            final Pattern pattern = Pattern.compile("#<(.{6})>", Pattern.DOTALL);
            final Matcher matcher = pattern.matcher(message);

            while (matcher.find()) {
                message = message.replace("#<" + matcher.group(1) + '>', ChatColor.of('#' + matcher.group(1)).toString());
            }
        }

        return ChatColor.translateAlternateColorCodes('&', message);
    }

    /**
     * Translate an array of strings.
     * @param arr Strings
     * @return array of translated strings.
     */
    public static String[] translate(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = translate(arr[i]);
        }

        return arr;
    }
}
