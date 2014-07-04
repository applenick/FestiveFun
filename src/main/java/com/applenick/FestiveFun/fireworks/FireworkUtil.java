package com.applenick.FestiveFun.fireworks;

import net.minecraft.server.v1_7_R3.NBTTagCompound;

import org.bukkit.FireworkEffect;
import org.bukkit.Location;
import org.bukkit.craftbukkit.v1_7_R3.entity.CraftFirework;
import org.bukkit.entity.Firework;
import org.bukkit.inventory.meta.FireworkMeta;

public class FireworkUtil {
	

	public static void launchFirework(Location loc, FireworkEffect fwe){
		Firework firework = loc.getWorld().spawn(loc, Firework.class);
		FireworkMeta data = firework.getFireworkMeta();
		data.addEffect(fwe);
		firework.setFireworkMeta(data);
        NBTTagCompound nbtData = new NBTTagCompound();
        nbtData.setInt("Life", 1);
        nbtData.setInt("LifeTime", 2);
        ((CraftFirework) firework).getHandle().a(nbtData);
	}
	
}
