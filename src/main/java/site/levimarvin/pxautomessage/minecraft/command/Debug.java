package site.levimarvin.pxautomessage.minecraft.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import site.levimarvin.pxautomessage.service.sender.TitleSender;

public class Debug implements CommandExecutor {
    Player p;
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        p = (Player) sender;
        if (p.hasPermission("pxam.cmd.debug")) {
            if (args.length == 0){
                debug();
            }else {
                p.sendMessage(String.valueOf(ErrorInfo.CE));
            }
        }else {
            p.sendMessage(String.valueOf(ErrorInfo.HNP));
        }
        return false;
    }

    private void debug() {
        TitleSender.sendTitle(p, "123", "456", 1, 1, 1);
    }
}
