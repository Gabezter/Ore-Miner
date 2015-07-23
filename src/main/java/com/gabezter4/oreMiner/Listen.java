package com.gabezter4.oreMiner;

import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class Listen implements Listener {
	Main plugin;

	public Listen(Main plugin) {
		plugin = this.plugin;
	}

	@EventHandler
	public void blockBreakEvent(BlockBreakEvent e) {
		Player player = e.getPlayer();
		Location loc = e.getBlock().getLocation();
		int num = 0;
		Material mat;
		if (e.getBlock().getType().equals(Material.COAL_ORE)) {
			mat = Material.COAL;
			if (player.getGameMode().equals(GameMode.CREATIVE)) {
				e.setCancelled(false);
			} else {
				player.sendMessage(ChatColor.RED + "Started Scanning");
				for (int x = -10; x < 10; x++) {
					Block scan1 = loc.getWorld().getBlockAt(
							(int) loc.getX() + x, (int) loc.getY() + 0,
							(int) loc.getZ() + 0);
					if (scan1.getType() == mat) {
						num++;
						player.sendMessage(ChatColor.DARK_RED
								+ Integer.toString(x));
					}
					for (int y = -10; y < 10; y++) {
						Block scan2 = loc.getWorld().getBlockAt(
								(int) loc.getX() + x, (int) loc.getY() + y,
								(int) loc.getZ() + 0);
						if (scan2.getType() == mat) {
							num++;
							player.sendMessage(ChatColor.DARK_RED
									+ Integer.toString(y));
						}
						for (int z = -10; z < 10; z++) {
							Block scan3 = loc.getWorld().getBlockAt(
									(int) loc.getX() + x, (int) loc.getY() + y,
									(int) loc.getZ() + z);
							if (scan3.getType() == mat) {
								num++;
								player.sendMessage(ChatColor.DARK_RED
										+ Integer.toString(z));
							}
						}
					}
				}
				player.sendMessage(ChatColor.GREEN + "Scanning Complete");
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				player.getInventory()
						.addItem(new ItemStack(Material.COAL, num));
				num = 0;
			}
		}
		if (e.getBlock().getType().equals(Material.IRON_ORE)) {
			mat = Material.IRON_ORE;
			if (player.getGameMode().equals(GameMode.CREATIVE)) {
				e.setCancelled(false);
			} else {
				player.sendMessage(ChatColor.RED + "Started Scanning");
				for (int x = -10; x < 10; x++) {
					Block scan1 = loc.getWorld().getBlockAt(
							(int) loc.getX() + x, (int) loc.getY() + 0,
							(int) loc.getZ() + 0);
					if (scan1.getType() == mat) {
						num++;
						player.sendMessage(ChatColor.DARK_RED
								+ Integer.toString(x));
					}
					for (int y = -10; y < 10; y++) {
						Block scan2 = loc.getWorld().getBlockAt(
								(int) loc.getX() + x, (int) loc.getY() + y,
								(int) loc.getZ() + 0);
						if (scan2.getType() == mat) {
							num++;
							player.sendMessage(ChatColor.DARK_RED
									+ Integer.toString(y));
						}
						for (int z = -10; z < 10; z++) {
							Block scan3 = loc.getWorld().getBlockAt(
									(int) loc.getX() + x, (int) loc.getY() + y,
									(int) loc.getZ() + z);
							if (scan3.getType() == mat) {
								num++;
								player.sendMessage(ChatColor.DARK_RED
										+ Integer.toString(z));
							}
						}
					}
				}
				player.sendMessage(ChatColor.GREEN + "Scanning Complete");
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				player.getInventory().addItem(
						new ItemStack(Material.IRON_ORE, num));
			}
			num = 0;
		}
		if (e.getBlock().getType().equals(Material.REDSTONE_ORE)) {
			mat = Material.REDSTONE_ORE;
			if (player.getGameMode().equals(GameMode.CREATIVE)) {
				e.setCancelled(false);
			} else {
				player.sendMessage(ChatColor.RED + "Started Scanning");
				for (int x = -10; x < 10; x++) {
					Block scan1 = loc.getWorld().getBlockAt(
							(int) loc.getX() + x, (int) loc.getY() + 0,
							(int) loc.getZ() + 0);
					if (scan1.getType() == mat) {
						num++;
						player.sendMessage(ChatColor.DARK_RED
								+ Integer.toString(x));
					}
					for (int y = -10; y < 10; y++) {
						Block scan2 = loc.getWorld().getBlockAt(
								(int) loc.getX() + x, (int) loc.getY() + y,
								(int) loc.getZ() + 0);
						if (scan2.getType() == mat) {
							num++;
							player.sendMessage(ChatColor.DARK_RED
									+ Integer.toString(y));
						}
						for (int z = -10; z < 10; z++) {
							Block scan3 = loc.getWorld().getBlockAt(
									(int) loc.getX() + x, (int) loc.getY() + y,
									(int) loc.getZ() + z);
							if (scan3.getType() == mat) {
								num++;
								player.sendMessage(ChatColor.DARK_RED
										+ Integer.toString(z));
							}
						}
					}
				}
				player.sendMessage(ChatColor.GREEN + "Scanning Complete");
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				player.getInventory().addItem(
						new ItemStack(Material.REDSTONE, num));
			}
			num = 0;
		}
		if (e.getBlock().getType().equals(Material.GOLD_ORE)) {
			mat = Material.GOLD_ORE;
			if (player.getGameMode().equals(GameMode.CREATIVE)) {
				e.setCancelled(false);
			} else {
				player.sendMessage(ChatColor.RED + "Started Scanning");
				for (int x = -10; x < 10; x++) {
					Block scan1 = loc.getWorld().getBlockAt(
							(int) loc.getX() + x, (int) loc.getY() + 0,
							(int) loc.getZ() + 0);
					if (scan1.getType() == mat) {
						num++;
						player.sendMessage(ChatColor.DARK_RED
								+ Integer.toString(x));
					}
					for (int y = -10; y < 10; y++) {
						Block scan2 = loc.getWorld().getBlockAt(
								(int) loc.getX() + x, (int) loc.getY() + y,
								(int) loc.getZ() + 0);
						if (scan2.getType() == mat) {
							num++;
							player.sendMessage(ChatColor.DARK_RED
									+ Integer.toString(y));
						}
						for (int z = -10; z < 10; z++) {
							Block scan3 = loc.getWorld().getBlockAt(
									(int) loc.getX() + x, (int) loc.getY() + y,
									(int) loc.getZ() + z);
							if (scan3.getType() == mat) {
								num++;
								player.sendMessage(ChatColor.DARK_RED
										+ Integer.toString(z));
							}
						}
					}
				}
				player.sendMessage(ChatColor.GREEN + "Scanning Complete");
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				player.getInventory().addItem(
						new ItemStack(Material.GOLD_ORE, num));
			}
			num = 0;
		}
		if (e.getBlock().getType().equals(Material.DIAMOND_ORE)) {
			mat = Material.DIAMOND_ORE;
			if (player.getGameMode().equals(GameMode.CREATIVE)) {
				e.setCancelled(false);
			} else {
				player.sendMessage(ChatColor.RED + "Started Scanning");
				for (int x = -10; x < 10; x++) {
					Block scan1 = loc.getWorld().getBlockAt(
							(int) loc.getX() + x, (int) loc.getY() + 0,
							(int) loc.getZ() + 0);
					if (scan1.getType() == mat) {
						num++;
						player.sendMessage(ChatColor.DARK_RED
								+ Integer.toString(x));
					}
					for (int y = -10; y < 10; y++) {
						Block scan2 = loc.getWorld().getBlockAt(
								(int) loc.getX() + x, (int) loc.getY() + y,
								(int) loc.getZ() + 0);
						if (scan2.getType() == mat) {
							num++;
							player.sendMessage(ChatColor.DARK_RED
									+ Integer.toString(y));
						}
						for (int z = -10; z < 10; z++) {
							Block scan3 = loc.getWorld().getBlockAt(
									(int) loc.getX() + x, (int) loc.getY() + y,
									(int) loc.getZ() + z);
							if (scan3.getType() == mat) {
								num++;
								player.sendMessage(ChatColor.DARK_RED
										+ Integer.toString(z));
							}
						}
					}
				}
				player.sendMessage(ChatColor.GREEN + "Scanning Complete");
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				player.getInventory().addItem(
						new ItemStack(Material.DIAMOND, num));
			}
			num = 0;
		}
		if (e.getBlock().getType().equals(Material.EMERALD_ORE)) {
			mat = Material.EMERALD_ORE;
			if (player.getGameMode().equals(GameMode.CREATIVE)) {
				e.setCancelled(false);
			} else {
				player.sendMessage(ChatColor.RED + "Started Scanning");
				for (int x = -10; x < 10; x++) {
					Block scan1 = loc.getWorld().getBlockAt(
							(int) loc.getX() + x, (int) loc.getY() + 0,
							(int) loc.getZ() + 0);
					if (scan1.getType() == mat) {
						num++;
						player.sendMessage(ChatColor.DARK_RED
								+ Integer.toString(x));
					}
					for (int y = -10; y < 10; y++) {
						Block scan2 = loc.getWorld().getBlockAt(
								(int) loc.getX() + x, (int) loc.getY() + y,
								(int) loc.getZ() + 0);
						if (scan2.getType() == mat) {
							num++;
							player.sendMessage(ChatColor.DARK_RED
									+ Integer.toString(y));
						}
						for (int z = -10; z < 10; z++) {
							Block scan3 = loc.getWorld().getBlockAt(
									(int) loc.getX() + x, (int) loc.getY() + y,
									(int) loc.getZ() + z);
							if (scan3.getType() == mat) {
								num++;
								player.sendMessage(ChatColor.DARK_RED
										+ Integer.toString(z));
							}
						}
					}
				}
				player.sendMessage(ChatColor.GREEN + "Scanning Complete");
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				player.getInventory().addItem(
						new ItemStack(Material.EMERALD, num));
			}
			num = 0;
		}
		if (e.getBlock().getType().equals(Material.QUARTZ_ORE)) {
			mat = Material.QUARTZ_ORE;
			if (player.getGameMode().equals(GameMode.CREATIVE)) {
				e.setCancelled(false);
			} else {
				player.sendMessage(ChatColor.RED + "Started Scanning");
				for (int x = -10; x < 10; x++) {
					Block scan1 = loc.getWorld().getBlockAt(
							(int) loc.getX() + x, (int) loc.getY() + 0,
							(int) loc.getZ() + 0);
					if (scan1.getType() == mat) {
						num++;
						player.sendMessage(ChatColor.DARK_RED
								+ Integer.toString(x));
					}
					for (int y = -10; y < 10; y++) {
						Block scan2 = loc.getWorld().getBlockAt(
								(int) loc.getX() + x, (int) loc.getY() + y,
								(int) loc.getZ() + 0);
						if (scan2.getType() == mat) {
							num++;
							player.sendMessage(ChatColor.DARK_RED
									+ Integer.toString(y));
						}
						for (int z = -10; z < 10; z++) {
							Block scan3 = loc.getWorld().getBlockAt(
									(int) loc.getX() + x, (int) loc.getY() + y,
									(int) loc.getZ() + z);
							if (scan3.getType() == mat) {
								num++;
								player.sendMessage(ChatColor.DARK_RED
										+ Integer.toString(z));
							}
						}
					}
				}
				player.sendMessage(ChatColor.GREEN + "Scanning Complete");
				e.setCancelled(true);
				e.getBlock().setType(Material.AIR);
				player.getInventory().addItem(
						new ItemStack(Material.QUARTZ, num));
				num = 0;
			}
		}
	}

	public int Scan(Material mat, Location loc, Player player) {
		int num = 0;
		player.sendMessage(ChatColor.RED + "Started Scanning");
		for (int x = -10; x < 10; x++) {
			Block scan1 = loc.getWorld().getBlockAt((int) loc.getX() + x,
					(int) loc.getY() + 0, (int) loc.getZ() + 0);
			if (scan1.getType() == mat) {
				num++;
				player.sendMessage(ChatColor.DARK_RED + Integer.toString(x));
			}
			for (int y = -10; y < 10; y++) {
				Block scan2 = loc.getWorld().getBlockAt((int) loc.getX() + x,
						(int) loc.getY() + y, (int) loc.getZ() + 0);
				if (scan2.getType() == mat) {
					num++;
					player.sendMessage(ChatColor.DARK_RED + Integer.toString(y));
				}
				for (int z = -10; z < 10; z++) {
					Block scan3 = loc.getWorld().getBlockAt(
							(int) loc.getX() + x, (int) loc.getY() + y,
							(int) loc.getZ() + z);
					if (scan3.getType() == mat) {
						num++;
						player.sendMessage(ChatColor.DARK_RED
								+ Integer.toString(z));
					}
				}
			}
		}
		player.sendMessage(ChatColor.GREEN + "Scanning Complete");
		return num;
	}
}