package plentyOStuffsMod.common;

import net.minecraft.block.Block;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import plentyOStuffsMod.common.tools.*;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = MainSrc.modid, name = "Plenty O'Stuffs Mod", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class MainSrc {
  
	public static final String modid = "PlentyOStuffsMod";
	public EnumToolMaterial STEEL, COBALT, AMETHYST, RUBY;
	
	public Item shovelSteel, shovelCobalt, shovelAmethyst, shovelRuby;
	public Item pickaxeSteel, pickaxeCobalt, pickaxeAmethyst, pickaxeRuby;
	public Item axeSteel, axeCobalt, axeAmethyst, axeRuby;
	public Item hoeSteel, hoeCobalt, hoeAmethyst, hoeRuby;
	public Item swordSteel, swordCobalt, swordAmethyst, swordRuby;
	
	@Init
	public void load(FMLInitializationEvent event) {
		
		// Tool Materials
		
		STEEL = (EnumHelper.addToolMaterial("STEEL", 2, 520, 7.0F, 2, 13));
		COBALT = (EnumHelper.addToolMaterial("COBALT", 2, 385, 9.0F, 3, 19));
		AMETHYST = (EnumHelper.addToolMaterial("AMETHYST", 2, 760, 8.5F, 3, 12));
		RUBY = (EnumHelper.addToolMaterial("RUBY", 3, 880, 10.5F, 3, 17));
		STEEL.customCraftingMaterial = NAMESTEEL;
		COBALT.customCraftingMaterial = NAMECOBALT;
		AMETHYST.customCraftingMaterial = NAMEAMETHYST;
		RUBY.customCraftingMaterial = NAMERUBY;
		
		// Shovels
		
		shovelSteel = new ItemPOSMSpade(20000, STEEL, "Steel");
		shovelCobalt = new ItemPOSMSpade(20004, COBALT, "Cobalt");
		shovelAmethyst = new ItemPOSMSpade(20008, AMETHYST, "Amethyst");
		shovelRuby = new ItemPOSMSpade(20012, RUBY, "Ruby");
		
		// Pickaxes
		
		pickaxeSteel = new ItemPOSMPickaxe(20001, STEEL, "Steel");
		pickaxeCobalt = new ItemPOSMPickaxe(20005, COBALT, "Cobalt");
		pickaxeAmethyst = new ItemPOSMPickaxe(20009, AMETHYST, "Amethyst");
		pickaxeRuby = new ItemPOSMPickaxe(20013, RUBY, "Ruby");
		
		// Axes
		
		axeSteel = new ItemPOSMAxe(20002, STEEL, "Steel");
		axeCobalt = new ItemPOSMAxe(20006, COBALT, "Cobalt");
		axeAmethyst = new ItemPOSMAxe(20010, AMETHYST, "Amethyst");
		axeRuby = new ItemPOSMAxe(20014, RUBY, "Ruby");
		
		// Hoes
		
		hoeSteel = new ItemPOSMHoe(20003, STEEL, "Steel");
		hoeCobalt = new ItemPOSMHoe(20007, COBALT, "Cobalt");
		hoeAmethyst = new ItemPOSMHoe(20011, AMETHYST, "Amethyst");
		hoeRuby = new ItemPOSMHoe(20015, RUBY, "Ruby");
		
		// Swords
		
		swordSteel = new ItemPOSMSword(20016, STEEL, "Steel");
		swordCobalt = new ItemPOSMSword(20017, COBALT, "Cobalt");
		swordAmethyst = new ItemPOSMSword(20018, AMETHYST, "Amethyst");
		swordRuby = new ItemPOSMSword(20019, RUBY, "Ruby");
		
		gameRegisters();
		languageRegisters();
	}

	private void gameRegisters() {
		
		// Shovels
		
		GameRegistry.registerItem(shovelSteel, "shovelSteel");
		GameRegistry.registerItem(shovelCobalt, "shovelCobalt");
		GameRegistry.registerItem(shovelAmethyst, "shovelAmethyst");
		GameRegistry.registerItem(shovelRuby, "shovelRuby");
		
		// Pickaxes
		
		GameRegistry.registerItem(pickaxeSteel, "pickaxeSteel");
		GameRegistry.registerItem(pickaxeCobalt, "pickaxeCobalt");
		GameRegistry.registerItem(pickaxeAmethyst, "pickaxeAmethyst");
		GameRegistry.registerItem(pickaxeRuby, "pickaxeRuby");
		
		// Axes
		
		GameRegistry.registerItem(axeSteel, "axeSteel");
		GameRegistry.registerItem(axeCobalt, "axeCobalt");
		GameRegistry.registerItem(axeAmethyst, "axeAmethyst");
		GameRegistry.registerItem(axeRuby, "axeRuby");
		
		// Hoes
		
		GameRegistry.registerItem(hoeSteel, "hoeSteel");
		GameRegistry.registerItem(hoeCobalt, "hoeCobalt");
		GameRegistry.registerItem(hoeAmethyst, "hoeAmethyst");
		GameRegistry.registerItem(hoeRuby, "hoeRuby");
		
		// Hoes
		
		GameRegistry.registerItem(swordSteel, "swordSteel");
		GameRegistry.registerItem(swordCobalt, "swordCobalt");
		GameRegistry.registerItem(swordAmethyst, "swordAmethyst");
		GameRegistry.registerItem(swordRuby, "swordRuby");
		
		// Recipes
		
		GameRegistry.addRecipe(new ItemStack(pickaxeSteel), new Object[] {
			"OOO", " S ", " S ", 'O', NAMESTEEL, 'S', Item.stick	});
		GameRegistry.addRecipe(new ItemStack(pickaxeCobalt), new Object[] {
			"CCC", " S ", " S ", 'C', NAMECOBALT, 'S', Item.stick	});
		GameRegistry.addRecipe(new ItemStack(pickaxeAmethyst), new Object[] {
			"AAA", " S ", " S ", 'A', NAMEAMETHYST, 'S', Item.stick	});
		GameRegistry.addRecipe(new ItemStack(pickaxeRuby), new Object[] {
			"RRR", " S ", " S ", 'R', NAMERUBY, 'S', Item.stick	});
		
		GameRegistry.addRecipe(new ItemStack(shovelSteel), new Object[] {
			"O", "S", "S", 'O', NAMESTEEL, 'S', Item.stick	});
		GameRegistry.addRecipe(new ItemStack(shovelCobalt), new Object[] {
			"C", "S", "S", 'C', NAMECOBALT, 'S', Item.stick	});
		GameRegistry.addRecipe(new ItemStack(shovelAmethyst), new Object[] {
			"A", "S", "S", 'A', NAMEAMETHYST, 'S', Item.stick	});
		GameRegistry.addRecipe(new ItemStack(shovelRuby), new Object[] {
			"R", "S", "S", 'R', NAMERUBY, 'S', Item.stick	});
		
		GameRegistry.addRecipe(new ItemStack(axeSteel), new Object[] {
			"OO", "OS", " S", 'O', NAMESTEEL, 'S', Item.stick	});
		GameRegistry.addRecipe(new ItemStack(axeCobalt), new Object[] {
			"CC", "CS", " S", 'C', NAMECOBALT, 'S', Item.stick	});
		GameRegistry.addRecipe(new ItemStack(axeAmethyst), new Object[] {
			"AA", "AS", " S", 'A', NAMEAMETHYST, 'S', Item.stick	});
		GameRegistry.addRecipe(new ItemStack(axeRuby), new Object[] {
			"RR", "RS", " S", 'R', NAMERUBY, 'S', Item.stick	});
		
		GameRegistry.addRecipe(new ItemStack(hoeSteel), new Object[] {
			"OO", " S", " S", 'O', NAMESTEEL, 'S', Item.stick	});
		GameRegistry.addRecipe(new ItemStack(hoeCobalt), new Object[] {
			"CC", " S", " S", 'C', NAMECOBALT, 'S', Item.stick	});
		GameRegistry.addRecipe(new ItemStack(hoeAmethyst), new Object[] {
			"AA", " S", " S", 'A', NAMEAMETHYST, 'S', Item.stick	});
		GameRegistry.addRecipe(new ItemStack(hoeRuby), new Object[] {
			"RR", " S", " S", 'R', NAMERUBY, 'S', Item.stick	});
		
		GameRegistry.addRecipe(new ItemStack(swordSteel), new Object[] {
			"O", "O", "S", 'O', NAMESTEEL, 'S', Item.stick	});
		GameRegistry.addRecipe(new ItemStack(swordCobalt), new Object[] {
			"C", "C", "S", 'C', NAMECOBALT, 'S', Item.stick	});
		GameRegistry.addRecipe(new ItemStack(swordAmethyst), new Object[] {
			"A", "A", "S", 'A', NAMEAMETHYST, 'S', Item.stick	});
		GameRegistry.addRecipe(new ItemStack(swordRuby), new Object[] {
			"R", "R", "S", 'R', NAMERUBY, 'S', Item.stick	});
		
	}

	private void languageRegisters() {
		
		// Shovels
		
		LanguageRegistry.addName(shovelSteel, "Steel Shovel");
		LanguageRegistry.addName(shovelCobalt, "Cobalt Shovel");
		LanguageRegistry.addName(shovelAmethyst, "Amethyst Shovel");
		LanguageRegistry.addName(shovelRuby, "Ruby Shovel");
		
		// Pickaxes
		
		LanguageRegistry.addName(pickaxeSteel, "Steel Pickaxe");
		LanguageRegistry.addName(pickaxeCobalt, "Cobalt Pickaxe");
		LanguageRegistry.addName(pickaxeAmethyst, "Amethyst Pickaxe");
		LanguageRegistry.addName(pickaxeRuby, "Ruby Pickaxe");
		
		// Axes
		
		LanguageRegistry.addName(axeSteel, "Steel Axe");
		LanguageRegistry.addName(axeCobalt, "Cobalt Axe");
		LanguageRegistry.addName(axeAmethyst, "Amethyst Axe");
		LanguageRegistry.addName(axeRuby, "Ruby Axe");
		
		// Hoes
		
		LanguageRegistry.addName(hoeSteel, "Steel Hoe");
		LanguageRegistry.addName(hoeCobalt, "Cobalt Hoe");
		LanguageRegistry.addName(hoeAmethyst, "Amethyst Hoe");
		LanguageRegistry.addName(hoeRuby, "Ruby Hoe");
		
		// Swords
		
		LanguageRegistry.addName(swordSteel, "Steel Sword");
		LanguageRegistry.addName(swordCobalt, "Cobalt Sword");
		LanguageRegistry.addName(swordAmethyst, "Amethyst Sword");
		LanguageRegistry.addName(swordRuby, "Ruby Sword");
		
	}

}
