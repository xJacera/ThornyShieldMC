package com.xjacera.thornyshield;

import org.bukkit.plugin.java.JavaPlugin;

public final class ThornyShieldPlugin extends JavaPlugin {

    private static ThornyShieldPlugin instance;

    @Override
    public void onEnable() {

        instance = this;

        saveDefaultConfig();

        getLogger().info("================================");
        getLogger().info(" ThornyShieldMC Enabled");
        getLogger().info("================================");

    }

    @Override
    public void onDisable() {

        getLogger().info("ThornyShieldMC Disabled");

    }

    public static ThornyShieldPlugin getInstance() {
        return instance;
    }
}
