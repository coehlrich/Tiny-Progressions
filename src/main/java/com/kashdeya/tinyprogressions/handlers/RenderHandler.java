package com.kashdeya.tinyprogressions.handlers;

import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthRenderer;
import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthUpgradeRenderer;
import com.kashdeya.tinyprogressions.client.render.TileEntityGrowthUpgradeTwoRenderer;
import com.kashdeya.tinyprogressions.inits.TechArmor;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.inits.TechTools;
import com.kashdeya.tinyprogressions.main.Reference;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowth;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgrade;
import com.kashdeya.tinyprogressions.tiles.TileEntityGrowthUpgradeTwo;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.properties.IProperty;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMap;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderHandler {
	
	public static void preInitBlocks(){
		if (ConfigHandler.BlockGrowthUpgrade){
			setCustomStateMap(TechBlocks.growth_upgrade, new StateMap.Builder().ignore(new IProperty[] { BlockLiquid.LEVEL }).build());
		}
		if (ConfigHandler.BlockGrowthUpgradeTwo){
			setCustomStateMap(TechBlocks.growth_upgrade_two, new StateMap.Builder().ignore(new IProperty[] { BlockLiquid.LEVEL }).build());
		}
	}
	
	public static void initBlocks(){
	    InventoryBlockRender(TechBlocks.growth_block, "growth_block");
	    InventoryBlockRender(TechBlocks.growth_upgrade, "growth_upgrade");
	    InventoryBlockRender(TechBlocks.growth_upgrade_two, "growth_upgrade_two");
	    InventoryBlockRender(TechBlocks.cobblegen_block, "cobblegen_block");
	    InventoryBlockRender(TechBlocks.iron_cobblegen_block, "iron_cobblegen_block");
	    InventoryBlockRender(TechBlocks.diamond_cobblegen_block, "diamond_cobblegen_block");
	    InventoryBlockRender(TechBlocks.emerald_cobblegen_block, "emerald_cobblegen_block");
	    InventoryBlockRender(TechBlocks.blaze_cobblegen_block, "blaze_cobblegen_block");
	    InventoryBlockRender(TechBlocks.charcoal_block, "charcoal_block");
	    InventoryBlockRender(TechBlocks.flesh_block, "flesh_block");
	    InventoryBlockRender(TechBlocks.reinforced_glass, "reinforced_glass");
	    InventoryBlockRender(TechBlocks.reinforced_obsidian, "reinforced_obsidian");
	    InventoryBlockRender(TechBlocks.bone_block, "bone_block");
	    InventoryBlockRender(TechBlocks.dirty_glass, "dirty_glass");
	    InventoryBlockRender(TechBlocks.granite_brick, "granite_brick");
	    InventoryBlockRender(TechBlocks.diorite_brick, "diorite_brick");
	    InventoryBlockRender(TechBlocks.andesite_brick, "andesite_brick");
	    InventoryBlockRender(TechBlocks.netherstar_block, "netherstar_block");
	    InventoryBlockRender(TechBlocks.flint_block, "flint_block");
	    InventoryBlockRender(TechBlocks.smooth_endstone, "smooth_endstone");
	    InventoryBlockRender(TechBlocks.stone_torch, "stone_torch");
	    InventoryBlockRender(TechBlocks.ender_ore, "ender_ore");
	    InventoryBlockRender(TechBlocks.withered_block, "withered_block");
	}
	
	public static void initBlockRenders(){
	    //Tile Entity Render
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowth.class, new TileEntityGrowthRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowthUpgrade.class, new TileEntityGrowthUpgradeRenderer());
	    ClientRegistry.bindTileEntitySpecialRenderer(TileEntityGrowthUpgradeTwo.class, new TileEntityGrowthUpgradeTwoRenderer());
	}
	
	public static void initItems(){
		InventoryItemRender(TechItems.watering_can, "watering_can");
		InventoryItemRender(TechItems.watering_can_upgrade, "watering_can_upgrade");
		InventoryItemRender(TechItems.quartz_dust, "quartz_dust");
		InventoryItemRender(TechItems.quartz_knife, "quartz_knife");
		InventoryItemRender(TechItems.mycelium_seeds, "mycelium_seeds");
		InventoryItemRender(TechItems.diamond_apple, "diamond_apple");
		InventoryItemRender(TechItems.emerald_apple, "emerald_apple");
		InventoryItemRender(TechItems.med_kit, "med_kit");	
		InventoryItemRender(TechItems.stone_dust, "stone_dust");
		InventoryItemRender(TechItems.flint_ingot, "flint_ingot");
		InventoryItemRender(TechItems.flint_knife, "flint_knife");
		InventoryItemRender(TechItems.stone_stick, "stone_stick");
		InventoryItemRender(TechItems.golden_apple, "golden_apple");
		InventoryItemRender(TechItems.ender_dust, "ender_dust");
		InventoryItemRender(TechItems.reinforced_obsidian_ingot, "reinforced_obsidian_ingot");
	}
	
	public static void initTools(){
		// Bone
		InventoryItemRender(TechTools.bone_axe, "bone_axe");
		InventoryItemRender(TechTools.bone_hoe, "bone_hoe");
		InventoryItemRender(TechTools.bone_pickaxe, "bone_pickaxe");
		InventoryItemRender(TechTools.bone_spade, "bone_spade");
		InventoryItemRender(TechTools.bone_sword, "bone_sword");
		// Flint
		InventoryItemRender(TechTools.flint_axe, "flint_axe");
		InventoryItemRender(TechTools.flint_hoe, "flint_hoe");
		InventoryItemRender(TechTools.flint_pickaxe, "flint_pickaxe");
		InventoryItemRender(TechTools.flint_spade, "flint_spade");
		InventoryItemRender(TechTools.flint_sword, "flint_sword");
		// Birthday
		InventoryItemRender(TechTools.birthday_pickaxe, "birthday_pickaxe");
		// Emerald
		InventoryItemRender(TechTools.emerald_axe, "emerald_axe");
		InventoryItemRender(TechTools.emerald_hoe, "emerald_hoe");
		InventoryItemRender(TechTools.emerald_pickaxe, "emerald_pickaxe");
		InventoryItemRender(TechTools.emerald_spade, "emerald_spade");
		InventoryItemRender(TechTools.emerald_sword, "emerald_sword");
		// Obsidian
		InventoryItemRender(TechTools.obsidian_axe, "obsidian_axe");
		InventoryItemRender(TechTools.obsidian_hoe, "obsidian_hoe");
		InventoryItemRender(TechTools.obsidian_pickaxe, "obsidian_pickaxe");
		InventoryItemRender(TechTools.obsidian_spade, "obsidian_spade");
		InventoryItemRender(TechTools.obsidian_sword, "obsidian_sword");
		// Scythe
		InventoryItemRender(TechTools.wooden_scythe, "wooden_scythe");
		InventoryItemRender(TechTools.diamond_scythe, "diamond_scythe");
		InventoryItemRender(TechTools.emerald_scythe, "emerald_scythe");
		InventoryItemRender(TechTools.golden_scythe, "golden_scythe");
		InventoryItemRender(TechTools.iron_scythe, "iron_scythe");
		InventoryItemRender(TechTools.obsidian_scythe, "obsidian_scythe");
		InventoryItemRender(TechTools.stone_scythe, "stone_scythe");
		// Multi
		InventoryItemRender(TechTools.wooden_multi, "wooden_multi");
		InventoryItemRender(TechTools.diamond_multi, "diamond_multi");
		InventoryItemRender(TechTools.emerald_multi, "emerald_multi");
		InventoryItemRender(TechTools.golden_multi, "golden_multi");
		InventoryItemRender(TechTools.iron_multi, "iron_multi");
		InventoryItemRender(TechTools.obsidian_multi, "obsidian_multi");
		InventoryItemRender(TechTools.stone_multi, "stone_multi");
		// Battle
		InventoryItemRender(TechTools.wooden_battle, "wooden_battle");
		InventoryItemRender(TechTools.diamond_battle, "diamond_battle");
		InventoryItemRender(TechTools.emerald_battle, "emerald_battle");
		InventoryItemRender(TechTools.golden_battle, "golden_battle");
		InventoryItemRender(TechTools.iron_battle, "iron_battle");
		InventoryItemRender(TechTools.obsidian_battle, "obsidian_battle");
		InventoryItemRender(TechTools.stone_battle, "stone_battle");
		// Spear
		InventoryItemRender(TechTools.wooden_spear, "wooden_spear");
		InventoryItemRender(TechTools.diamond_spear, "diamond_spear");
		InventoryItemRender(TechTools.emerald_spear, "emerald_spear");
		InventoryItemRender(TechTools.golden_spear, "golden_spear");
		InventoryItemRender(TechTools.iron_spear, "iron_spear");
		InventoryItemRender(TechTools.obsidian_spear, "obsidian_spear");
		InventoryItemRender(TechTools.stone_spear, "stone_spear");
	}
	
	public static void initArmor(){
		InventoryItemRender(TechArmor.stone_helmet, "stone_helmet");
		InventoryItemRender(TechArmor.stone_chestplate, "stone_chestplate");
		InventoryItemRender(TechArmor.stone_leggings, "stone_leggings");
		InventoryItemRender(TechArmor.stone_boots, "stone_boots");
		InventoryItemRender(TechArmor.flint_helmet, "flint_helmet");
		InventoryItemRender(TechArmor.flint_chestplate, "flint_chestplate");
		InventoryItemRender(TechArmor.flint_leggings, "flint_leggings");
		InventoryItemRender(TechArmor.flint_boots, "flint_boots");
		InventoryItemRender(TechArmor.bone_helmet, "bone_helmet");
		InventoryItemRender(TechArmor.bone_chestplate, "bone_chestplate");
		InventoryItemRender(TechArmor.bone_leggings, "bone_leggings");
		InventoryItemRender(TechArmor.bone_boots, "bone_boots");
		InventoryItemRender(TechArmor.wooden_helmet, "wooden_helmet");
		InventoryItemRender(TechArmor.wooden_chestplate, "wooden_chestplate");
		InventoryItemRender(TechArmor.wooden_leggings, "wooden_leggings");
		InventoryItemRender(TechArmor.wooden_boots, "wooden_boots");
	}
	
	public static void InventoryBlockRender(Block block, String blockName) {
		if(block != null)
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + blockName, "inventory"));
	}
	  
	public static void InventoryItemRender(Item item, String itemName) {
		if(item != null)
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + itemName, "inventory"));
	}
	
	public static void setCustomStateMap(Block block, StateMap stateMap){
		ModelLoader.setCustomStateMapper(block, stateMap);
	}

}
