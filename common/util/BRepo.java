package bconstruct.common.util;

import bconstruct.common.blocks.GlazedBricks;
import net.minecraft.block.Block;
//import net.minecraft.block.Block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
//import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidStack;

public class BRepo {
	//Blocks
	public static Block brewingControler;
	public static Block heavyCaldronBlock;
	public static Block heavyCaldronDrain;
	public static Block heavyCaldronSpigot;
	public static Block blazeingBlock;
	public static Block potionGlass;
	public static Block potionBottler;
	public static Block glazedBricks;
	public static Block potionTurret;
	public static Block salt;
	public static Block aluminumOre;
	public static Block aluminumBlock;
	
	//Items
	public static Item glazedBrick;
	public static Item rawGlazedBrick;
	public static Item potionBottle;
	public static Item potionFlash;
	public static Item potionJug;
	public static Item aetherWart;
	//Fluids
	public static Material potion;
	//liquid form
	public static Fluid potionAwkwardFluid;
	public static Fluid potionThickFluid;
	public static Fluid potionMundaneFluid;
	public static Fluid potionWaterBreatingFluid;
	public static Fluid potionFireResistanceFluid;
	public static Fluid potionSwiftnessFluid;
	public static Fluid potionSlownessFluid;
	public static Fluid potionHealingFluid;
	public static Fluid potionHarmingFluid;
	public static Fluid potionPoisonFluid;
	public static Fluid potionNigthVisionFluid;
	public static Fluid potionInvisabilityFluid;
	public static Fluid potionRegenrationFluid;
	public static Fluid potionWeaknessFluid;
	public static Fluid potionStrenthFluid;
	//block form
	
	public static Block potionAwkwardBlock;
	public static Block potionThickBlock;
	public static Block potionMundaneBlock;
	public static Block potionWaterBreatingBlock;
	public static Block potionFireResistanceBlock;
	public static Block potionSwiftnessBlock;
	public static Block potionSlownessBlock;
	public static Block potionHealingBlock;
	public static Block potionHarmingBlock;
	public static Block potionPoisonBlock;
	public static Block potionNigthVisionBlock;
	public static Block potionInvisabilityBlock;
	public static Block potionRegenrationBlock;
	public static Block potionWeaknessBlock;
	public static Block potionStrenthBlock;
	
	public static Fluid[] fluids = new Fluid[27];
    public static Block[] fluidBlocks = new Block[26];

    //recipe stuff
    public static boolean thaumcraftAvailable;
    public static boolean initRecipes;
    public static FluidStack[] liquids;
	
}