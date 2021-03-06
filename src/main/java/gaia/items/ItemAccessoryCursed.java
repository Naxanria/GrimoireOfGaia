package gaia.items;

import gaia.Gaia;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemAccessoryCursed extends Item {
	String texture;

	public ItemAccessoryCursed(String texture) {
		this.texture = texture;
		this.setMaxStackSize(1);
		this.setUnlocalizedName("GrimoireOfGaia.AccessoryCursed");
		this.setCreativeTab(Gaia.tabGaia);
	}

	@SideOnly(Side.CLIENT)
	public boolean hasEffect(ItemStack par1ItemStack) {
		return true;
	}

	@SideOnly(Side.CLIENT)
	public EnumRarity getRarity(ItemStack par1ItemStack) {
		return EnumRarity.RARE;
	}

	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add(EnumChatFormatting.ITALIC + (StatCollector.translateToLocal("item.GrimoireOfGaia.AccessoryCursed.desc")));
		par3List.add(StatCollector.translateToLocal("potion.moveSlowdown"));
		par3List.add(StatCollector.translateToLocal("potion.digSlowDown"));
	}

	public void onUpdate(ItemStack par1ItemStack, World par2World, Entity par3Entity, int par4, boolean par5) {
		super.onUpdate(par1ItemStack, par2World, par3Entity, par4, par5);
		EntityPlayer player = (EntityPlayer)par3Entity;

		for(int i = 0; i < 35; ++i) {
			if (player.inventory.getStackInSlot(i) == par1ItemStack) {
				this.doEffect(player, par1ItemStack);
				break;
			}
		}
	}

	public void doEffect(EntityPlayer player, ItemStack item) {
		player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, 200, 1));
		player.addPotionEffect(new PotionEffect(Potion.digSlowdown.id, 200, 1));
	}
}
