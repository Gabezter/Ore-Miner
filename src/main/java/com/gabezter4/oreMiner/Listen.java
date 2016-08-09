package com.gabezter4.oreMiner;

import java.util.ArrayList;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
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
	public boolean triggerInteract(BlockBreakEvent event) {
		ItemStack itemHand = event.getPlayer().getInventory().getItemInHand();
		Player player = event.getPlayer();

		Block blockes = event.getBlock();
		String matBlock = blockes.getType().toString();
		Material mat = blockes.getType();

		Material stone = Material.STONE_PICKAXE;
		Material iron = Material.IRON_PICKAXE;
		Material wood = Material.WOOD_PICKAXE;
		Material diamond = Material.DIAMOND_PICKAXE;
		Material gold = Material.GOLD_PICKAXE;

	//	if (player.getGameMode() == GameMode.SURVIVAL) {
			if (itemHand.getType().equals(diamond) || itemHand.getType().equals(iron) || itemHand.getType().equals(stone) || itemHand.getType().equals(wood) || itemHand.getType().equals(gold)) {
				if (mat.equals(Material.COAL_ORE))
				{

					
					ArrayList<Block> blocks = new ArrayList<Block>();
					blocks.add(blockes);
					getOre(blockes, blocks, mat);
					getOreDown(blockes, blocks, mat);
					for (Block block : blocks) {
						ItemStack i = new ItemStack(Material.COAL, 1);
						event.getPlayer().getInventory().addItem(i);
						itemHand.setDurability((short) (itemHand.getDurability() - blocks.size()));
						event.setCancelled(true);
						block.setType(Material.AIR);
					}

					return true;

				}
				if (mat.equals(Material.QUARTZ_ORE))
				{

					
					ArrayList<Block> blocks = new ArrayList<Block>();
					blocks.add(blockes);
					getOre(blockes, blocks, mat);
					getOreDown(blockes, blocks, mat);
					for (Block block : blocks) {
						ItemStack i = new ItemStack(Material.QUARTZ, 1);
						event.getPlayer().getInventory().addItem(i);
						itemHand.setDurability((short) (itemHand.getDurability() - blocks.size()));
						event.setCancelled(true);
						block.setType(Material.AIR);
					}

					return true;

				}
			}
			if (itemHand.getType().equals(diamond) || itemHand.getType().equals(iron) || itemHand.getType().equals(stone)) {
				if (mat.equals(Material.LAPIS_ORE))
				{
					
					ArrayList<Block> blocks = new ArrayList<Block>();
					blocks.add(blockes);
					getOre(blockes, blocks, mat);
					getOreDown(blockes, blocks, mat);
					for (Block block : blocks) {
						Random random = new Random();
						int rand = random.nextInt(5);
						if (rand == 1) {
							ItemStack i = new ItemStack(Material.INK_SACK, 8);
							i.setDurability((short) 4);
							event.getPlayer().getInventory().addItem(i);
							itemHand.setDurability((short) (itemHand.getDurability() - 1));
							event.setCancelled(true);
							block.setType(Material.AIR);
						}
						else if (rand == 2) {
							ItemStack i = new ItemStack(Material.INK_SACK, 7);
							i.setDurability((short) 4);
							event.getPlayer().getInventory().addItem(i);
							itemHand.setDurability((short) (itemHand.getDurability() - 1));
							event.setCancelled(true);
							block.setType(Material.AIR);
						}
						else if (rand == 3) {
							ItemStack i = new ItemStack(Material.INK_SACK, 6);
							i.setDurability((short) 4);
							event.getPlayer().getInventory().addItem(i);
							itemHand.setDurability((short) (itemHand.getDurability() - 1));
							event.setCancelled(true);
							block.setType(Material.AIR);
						}
						else if (rand == 0) {
							ItemStack i = new ItemStack(Material.INK_SACK, 5);
							i.setDurability((short) 4);
							event.getPlayer().getInventory().addItem(i);
							itemHand.setDurability((short) (itemHand.getDurability() - 1));
							event.setCancelled(true);
							block.setType(Material.AIR);
						}
						else {
							ItemStack i = new ItemStack(Material.INK_SACK, 4);
							i.setDurability((short) 4);
							event.getPlayer().getInventory().addItem(i);
							itemHand.setDurability((short) (itemHand.getDurability() - 1));
							event.setCancelled(true);
							block.setType(Material.AIR);
						}
					}

					return true;

				}
				if (mat.equals(Material.IRON_ORE))
				{

					
					ArrayList<Block> blocks = new ArrayList<Block>();
					blocks.add(blockes);
					getOre(blockes, blocks, mat);
					getOreDown(blockes, blocks, mat);
					for (Block block : blocks) {
						ItemStack i = new ItemStack(mat, 1);
						event.getPlayer().getInventory().addItem(i);
						itemHand.setDurability((short) (itemHand.getDurability() - 1));
						event.setCancelled(true);
						block.setType(Material.AIR);
					}

					return true;

				}

			}
			if (itemHand.getType().equals(diamond) || itemHand.getType().equals(iron)) {
				if (mat.equals(Material.EMERALD_ORE))
				{

					
					ArrayList<Block> blocks = new ArrayList<Block>();
					blocks.add(blockes);
					getOre(blockes, blocks, mat);
					getOreDown(blockes, blocks, mat);
					for (Block block : blocks) {
						ItemStack i = new ItemStack(Material.EMERALD, 1);
						event.getPlayer().getInventory().addItem(i);
						itemHand.setDurability((short) (itemHand.getDurability() - 1));
						event.setCancelled(true);
						block.setType(Material.AIR);
					}

					return true;

				}
				if (mat.equals(Material.REDSTONE_ORE)||mat.equals(Material.GLOWING_REDSTONE_ORE))
				{

					
					ArrayList<Block> blocks = new ArrayList<Block>();
					blocks.add(blockes);
					getOre(blockes, blocks, mat);
					getOreDown(blockes, blocks, mat);
					mat = Material.REDSTONE_ORE;
					getOre(blockes, blocks, mat);
					getOreDown(blockes, blocks, mat);
					for (Block block : blocks) {
						Random random = new Random();
						int rand = random.nextInt(2);
						if (rand == 1) {
							ItemStack i = new ItemStack(Material.REDSTONE, 5);
							event.getPlayer().getInventory().addItem(i);
							itemHand.setDurability((short) (itemHand.getDurability() - 1));
							event.setCancelled(true);
							block.setType(Material.AIR);
						}
						else {
							ItemStack i = new ItemStack(Material.REDSTONE, 4);
							event.getPlayer().getInventory().addItem(i);
							itemHand.setDurability((short) (itemHand.getDurability() - 1));
							event.setCancelled(true);
							block.setType(Material.AIR);
						}

					}

					return true;

				}
				if (mat.equals(Material.GOLD_ORE))
				{
					
					ArrayList<Block> blocks = new ArrayList<Block>();
					blocks.add(blockes);
					getOre(blockes, blocks, mat);
					getOreDown(blockes, blocks, mat);
					for (Block block : blocks) {
						ItemStack i = new ItemStack(mat, 1);
						event.getPlayer().getInventory().addItem(i);
						itemHand.setDurability((short) (itemHand.getDurability() - 1));
						event.setCancelled(true);
						block.setType(Material.AIR);
					}

					return true;

				}
				if (mat.equals(Material.DIAMOND_ORE))
				{

					
					ArrayList<Block> blocks = new ArrayList<Block>();
					blocks.add(blockes);
					getOre(blockes, blocks, mat);
					getOreDown(blockes, blocks, mat);
					for (Block block : blocks) {
						ItemStack i = new ItemStack(Material.DIAMOND, 1);
						event.getPlayer().getInventory().addItem(i);
						itemHand.setDurability((short) (itemHand.getDurability() - 1));
						event.setCancelled(true);
						block.setType(Material.AIR);
					}

					return true;

				}
			//}
		}
		return false;
	}

	private Integer ORE_LIMIT = 2304;

	private void getOre(Block anchor, ArrayList<Block> logs, Material mat) {
		// Limits:
		if (logs.size() > ORE_LIMIT) return;
		Block nextAnchor = null;

		// North:
		nextAnchor = anchor.getRelative(BlockFace.NORTH);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.COBBLESTONE) && !logs.contains(nextAnchor)) {

		}

		// North-east:
		nextAnchor = anchor.getRelative(BlockFace.NORTH_EAST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// East:
		nextAnchor = anchor.getRelative(BlockFace.EAST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// South-east:
		nextAnchor = anchor.getRelative(BlockFace.SOUTH_EAST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// South:
		nextAnchor = anchor.getRelative(BlockFace.SOUTH);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// South-west:
		nextAnchor = anchor.getRelative(BlockFace.SOUTH_WEST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// West:
		nextAnchor = anchor.getRelative(BlockFace.WEST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// North-west:
		nextAnchor = anchor.getRelative(BlockFace.NORTH_WEST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// Shift anchor one up:
		anchor = anchor.getRelative(BlockFace.UP);

		// Up-north:
		nextAnchor = anchor.getRelative(BlockFace.NORTH);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// Up-north-east:
		nextAnchor = anchor.getRelative(BlockFace.NORTH_EAST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);

		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// Up-east:
		nextAnchor = anchor.getRelative(BlockFace.EAST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// Up-south-east:
		nextAnchor = anchor.getRelative(BlockFace.SOUTH_EAST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// Up-south:
		nextAnchor = anchor.getRelative(BlockFace.SOUTH);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// Up-south-west:
		nextAnchor = anchor.getRelative(BlockFace.SOUTH_WEST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);

		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// Up-west:
		nextAnchor = anchor.getRelative(BlockFace.WEST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// Up-north-west:
		nextAnchor = anchor.getRelative(BlockFace.NORTH_WEST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// Up:
		nextAnchor = anchor.getRelative(BlockFace.SELF);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOre(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

	}

	private void getOreDown(Block anchor, ArrayList<Block> logs, Material mat) {
		// Limits:
		if (logs.size() > ORE_LIMIT) return;
		Block nextAnchor = null;

		// Shift anchor one down:
		anchor = anchor.getRelative(BlockFace.DOWN);

		// down-north:
		nextAnchor = anchor.getRelative(BlockFace.NORTH);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOreDown(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// down-north-east:
		nextAnchor = anchor.getRelative(BlockFace.NORTH_EAST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOreDown(nextAnchor, logs, mat);

		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// down-east:
		nextAnchor = anchor.getRelative(BlockFace.EAST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOreDown(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// down-south-east:
		nextAnchor = anchor.getRelative(BlockFace.SOUTH_EAST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOreDown(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// down-south:
		nextAnchor = anchor.getRelative(BlockFace.SOUTH);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOreDown(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// down-south-west:
		nextAnchor = anchor.getRelative(BlockFace.SOUTH_WEST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOreDown(nextAnchor, logs, mat);

		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// down-west:
		nextAnchor = anchor.getRelative(BlockFace.WEST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOreDown(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// down-north-west:
		nextAnchor = anchor.getRelative(BlockFace.NORTH_WEST);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOreDown(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

		// down:
		nextAnchor = anchor.getRelative(BlockFace.SELF);
		if (nextAnchor.getType().equals(mat) && !logs.contains(nextAnchor)) {
			logs.add(nextAnchor);
			getOreDown(nextAnchor, logs, mat);
		}
		else if (nextAnchor.getType().equals(Material.STONE) && !logs.contains(nextAnchor)) {

		}

	}

}