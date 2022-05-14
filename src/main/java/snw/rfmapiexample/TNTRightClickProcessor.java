package snw.rfmapiexample;

import org.bukkit.entity.Player;
import snw.rfm.api.ItemEventListener;

public class TNTRightClickProcessor implements ItemEventListener {
    @Override
    public boolean onPlayerUseRequiredItem(Player player) {
        player.sendMessage("Just a example!");
        return false;
    }
}
