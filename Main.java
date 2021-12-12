import java.io.IOException;
import org.bukkit.Bukkit;


public class Main {

    public static void main(String[] args) {
		//ConsoleCommandSender console =
		//String command = "/command";
        Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "/command");
    }

}
