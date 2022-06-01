package commandline.commandline;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class CommandSet implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (label.equalsIgnoreCase("set")){
            Player player = (Player) sender;
            Material material = Material.getMaterial(args[1]);
            if (args[0].equalsIgnoreCase("look")){
                Block block = player.getTargetBlock(null, 100);
                if (material != null) {
                    block.setType(material);
                }
            }
            if (args[0].equalsIgnoreCase("hear")){
                Location location = player.getLocation();
                Block block = location.getBlock();
                assert material != null;
                block.setType(material);
            }
        }
        return true;
    }
}
