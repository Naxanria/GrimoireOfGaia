package gaia.items;

import gaia.Gaia;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.util.StatCollector;

public class ItemFoodWither extends ItemFood {
	String texture;

	public ItemFoodWither(int par2, float par3, boolean par4, String texture) {
		super(par2, par3, par4);
		this.texture = texture;
		this.setUnlocalizedName("GrimoireOfGaia.FoodWither");
		this.setCreativeTab(Gaia.tabGaia);
		
		this.setPotionEffect(Potion.wither.id, 10, 0, 0.6F);
	}

	public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4) {
		par3List.add("(60%) " + StatCollector.translateToLocal("potion.wither") + " (0:10)");
	}
}
