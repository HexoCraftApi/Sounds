package com.github.hexocraftapi.sounds;

/*
 * Copyright 2016 hexosse
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.github.hexocraftapi.util.PlayerUtil;
import org.bukkit.*;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;

/**
 * @author <b>hexosse</b> (<a href="https://github.comp/hexosse">hexosse on GitHub</a>))
 */
@SuppressWarnings("unused")
public class PlaySounds
{
	public static void play(Location location, Sound sound, float volume, float pitch)
	{
		if(location == null) return;
		if(sound == null) return;
		location.getWorld().playSound(location, sound, volume, pitch);
	}

	public static void play(Location location, String sound, float volume, float pitch)
	{
		play(location, Sounds.get(sound), volume, pitch);
	}

	public static void play(Player player, Sound sound, float volume, float pitch)
	{
		play(player.getLocation(), sound, volume, pitch);
	}

	public static void play(Player player, String sound, float volume, float pitch)
	{
		play(player.getLocation(), Sounds.get(sound), volume, pitch);
	}

	public static void broadcast(Sound sound, float volume, float pitch)
	{
		Collection<? extends Player> players = PlayerUtil.getOnlinePlayers();

		if(players != null) {
			for(Player player : players)
				play(player.getLocation(), sound, volume, pitch);
		}
	}

	public static void broadcast(String sound, float volume, float pitch)
	{
		broadcast(Sounds.get(sound), volume, pitch);
	}

	public static void broadcast(World world, Sound sound, float volume, float pitch)
	{
		Collection<? extends Player> players = PlayerUtil.getOnlinePlayers();

		if(players != null) {
			for(Player player : players)
				if(player.getLocation().getWorld().equals(world))
					play(player.getLocation(), sound, volume, pitch);
		}
	}

	public static void broadcast(World world, String sound, float volume, float pitch)
	{
		broadcast(world, Sounds.get(sound), volume, pitch);
	}

	public static void delay(final JavaPlugin plugin, final long ticks, final Location location, final Sound sound, final float volume, final float pitch)
	{
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable()
		{
			@Override
			public void run()
			{
				play(location, sound, volume, pitch);
			}
		}, ticks);
	}

	public static void delay(final JavaPlugin plugin, final long ticks, final Location location, final String sound, final float volume, final float pitch)
	{
		delay(plugin, ticks, location, Sounds.get(sound), volume, pitch);
	}

	public static void delay(final JavaPlugin plugin, final long ticks, final Player player, final Sound sound, final float volume, final float pitch)
	{
		delay(plugin, ticks, player.getLocation(), sound, volume, pitch);
	}

	public static void delay(final JavaPlugin plugin, final long ticks, final Player player, final String sound, final float volume, final float pitch)
	{
		delay(plugin, ticks, player.getLocation(), Sounds.get(sound), volume, pitch);
	}


	public static void broadcast(final JavaPlugin plugin, final long ticks, final Sound sound, final float volume, final float pitch)
	{
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable()
		{
			@Override
			public void run()
			{
				broadcast(sound, volume, pitch);
			}
		}, ticks);
	}

	public static void broadcast(final JavaPlugin plugin, final long ticks, final String sound, final float volume, final float pitch)
	{
		broadcast(plugin, ticks, Sounds.get(sound), volume, pitch);
	}

	public static void broadcast(final JavaPlugin plugin, final long ticks, final World world, final Sound sound, final float volume, final float pitch)
	{
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable()
		{
			@Override
			public void run()
			{
				broadcast(world, sound, volume, pitch);
			}
		}, ticks);
	}

	public static void broadcast(final JavaPlugin plugin, final long ticks, final World world, final String sound, final float volume, final float pitch)
	{
		broadcast(plugin, ticks, world, Sounds.get(sound), volume, pitch);
	}
}
