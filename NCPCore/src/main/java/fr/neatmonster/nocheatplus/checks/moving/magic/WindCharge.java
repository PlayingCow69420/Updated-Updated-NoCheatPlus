package fr.neatmonster.nocheatplus.checks.moving.magic;

import org.bukkit.entity.Player;
import org.bukkit.metadata.FixedMetadataValue;
import fr.neatmonster.nocheatplus.NCPAPIProvider;

public class WindCharge {
    private static final String KEY = "ncp_wind_charge";

    public static boolean isActive(final Player player) {
        return player.hasMetadata(KEY);
    }

    public static void set(final Player player) {
        player.setMetadata(KEY, new FixedMetadataValue(
                NCPAPIProvider.getNoCheatPlusAPI().getPlugin(), true));
    }

    public static void remove(final Player player) {
        player.removeMetadata(KEY, NCPAPIProvider.getNoCheatPlusAPI().getPlugin());
    }
}