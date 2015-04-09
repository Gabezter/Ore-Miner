package com.gabezter4.oreMiner;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	Listen oml = new Listen(this);
	@Override
	public void onEnable(){
		getServer().getPluginManager().registerEvents(oml, this);
	}
	
	@Override
	public void onDisable(){
		 
	}

}
