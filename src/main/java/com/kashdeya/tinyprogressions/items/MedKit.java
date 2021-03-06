package com.kashdeya.tinyprogressions.items;

import java.util.List;

import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.main.TinyProgressions;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MedKit extends Item {
	
	  public MedKit()
	  {
		  this.setCreativeTab(TinyProgressions.tabTP);
		  this.setUnlocalizedName("med_kit");
		  this.setMaxStackSize(16);
	  }
	  
	  @Override
	  public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn, EnumHand hand)
	  {
	    if (!playerIn.capabilities.isCreativeMode) {
	      itemStackIn.stackSize -= 1;
	    }
	    playerIn.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, ConfigHandler.healDuration * 20, 0));
	    
	    return new ActionResult(EnumActionResult.SUCCESS, itemStackIn);
	  }
	  
	  @Override
	  @SideOnly(Side.CLIENT)
	  @SuppressWarnings({ "unchecked", "rawtypes" })
	  public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean flag) {
		  list.add(TextFormatting.YELLOW + new TextComponentTranslation("tooltip.medkit").getFormattedText());
	  }
}
