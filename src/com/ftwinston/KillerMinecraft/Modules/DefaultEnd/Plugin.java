package com.ftwinston.KillerMinecraft.Modules.DefaultEnd;

import org.bukkit.Material;
import org.bukkit.World.Environment;

import com.ftwinston.KillerMinecraft.WorldGenerator;
import com.ftwinston.KillerMinecraft.WorldGeneratorPlugin;

public class Plugin extends WorldGeneratorPlugin
{
	@Override
	public Environment getWorldType() { return Environment.THE_END; }
	
	@Override
	public String[] getDescriptionText() { return new String[] {"Using the default end generator"}; }
	
	@Override
	public Material getMenuIcon() { return Material.ENDER_STONE; }
	
	@Override
	public WorldGenerator createInstance()
	{
		return new DefaultEnd();
	}
}