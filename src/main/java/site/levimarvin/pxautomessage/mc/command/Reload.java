package site.levimarvin.pxautomessage.mc.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;
import site.levimarvin.pxautomessage.PxAutoMessage;
import site.levimarvin.pxautomessage.annotation.Permission;

@Permission(permission = "pxam.cmd.reload")
public class Reload implements CommandExecutor {
    private static final JavaPlugin plugin = PxAutoMessage.getPlugin();

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        return true;
    }
}