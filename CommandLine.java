package commandline.commandline;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import java.util.Objects;

public final class CommandLine extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Objects.requireNonNull(this.getCommand("set")).setExecutor(new CommandSet());
        Objects.requireNonNull(this.getCommand("set")).setTabCompleter(new TabCompleterSet());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

}
