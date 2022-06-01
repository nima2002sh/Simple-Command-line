package commandline.commandline;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import java.util.ArrayList;
import java.util.List;

public class TabCompleterSet implements TabCompleter {

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1){
            List<String> hearOrLook = new ArrayList<>();
            hearOrLook.add("hear");
            hearOrLook.add("look");
            return hearOrLook;
        }
        else if (args.length == 2){
            List<String> materialNames = new ArrayList<>(Material.values().length);
            for (Material material : Material.values()) {
                if (material.isBlock()) {
                    materialNames.add(material.name());
                }
            }
            return materialNames;
        }
        else
            return null;
    }
}
