package plentyOStuffsMod.common.tools;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import plentyOStuffsMod.common.MainSrc;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPOSMSword extends ItemSword {

  public ItemPOSMSword(int par1, EnumToolMaterial par2EnumToolMaterial, String par3MaterialName) {
		super(par1, par2EnumToolMaterial);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setUnlocalizedName("sword" + par3MaterialName);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister ir) {
		this.itemIcon = ir.registerIcon(MainSrc.modid + ":" + this.getUnlocalizedName().substring(5));
	}
	
	@Override
	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2) {
		return true;
	}

}
