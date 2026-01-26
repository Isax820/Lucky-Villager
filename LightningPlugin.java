package org.lightning.lightningPlugin;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class LightningPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("eclair").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (command.getName().equalsIgnoreCase("eclair")) {

            if (args.length != 1) {
                sender.sendMessage("§cUtilisation : /eclair <joueur>");
                return true;
            }

            Player target = Bukkit.getPlayer(args[0]);

            if (target == null) {
                sender.sendMessage("§cJoueur introuvable !");
                return true;
            }

            target.getWorld().strikeLightning(target.getLocation());
            sender.sendMessage("§aÉclair envoyé sur " + target.getName() + " ⚡");
            return true;
        }

        return false;
    }
}
