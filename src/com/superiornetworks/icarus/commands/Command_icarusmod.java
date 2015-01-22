package com.superiornetworks.icarus.commands;

import me.StevenLawson.TotalFreedomMod.Commands.AdminLevel;
import me.StevenLawson.TotalFreedomMod.Commands.CommandParameters;
import me.StevenLawson.TotalFreedomMod.Commands.CommandPermissions;
import me.StevenLawson.TotalFreedomMod.Commands.SourceType;
import me.StevenLawson.TotalFreedomMod.Commands.TFM_Command;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandPermissions(level = AdminLevel.ALL, source = SourceType.ONLY_IN_GAME)
@CommandParameters(description = "Goto the ender / \"The End\".", usage = "/<command>")
public class Command_icarusmod extends TFM_Command
{

    @Override
    public boolean run(CommandSender sender, Player sender_p, Command cmd, String commandLabel, String[] args, boolean senderIsConsole)
    {
        // This is currently just crap to test command loading. I will make it do something more impressive at some point in the future, but for now it will have to do...
        sender.sendMessage("Welcome to the Icarus Project");
        sender.sendMessage("We are hoping to start something amazing!");
        sender.sendMessage("This is more of a test command for now, so just ignore it ;) !");
        return true;
    }

}
