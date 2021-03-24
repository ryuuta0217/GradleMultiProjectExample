package com.ryuuta0217.multiproj.example.plugin;

import com.ryuuta0217.multiproj.example.SomeApiClass;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        SomeApiClass.someApiMethod("Hello from 1.12 Plugin!");
    }
}
