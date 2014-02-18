package bconstruct.common.core;

import bconstruct.BConstruct;
import bconstruct.common.blocks.BlazeingBlock;
import bconstruct.common.blocks.BrewingControler;
import bconstruct.common.blocks.GlazedBricks;
import bconstruct.common.blocks.HeavyCauldronBlock;
import bconstruct.common.blocks.HeavyCauldronDrain;
import bconstruct.common.util.BRepo;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;

public class Blocks
{
    public Blocks()
    {
    }

    public static void init()
    {
    	registerBlocks();
    	setFireInfo();
    }
    private static void registerBlocks()
    {
        //set block repos
        BRepo.blazeingBlock = new BlazeingBlock().setCreativeTab(BConstruct.ModTab);
        BRepo.glazedBricks = new GlazedBricks().setCreativeTab(BConstruct.ModTab);
        BRepo.brewingControler = new BrewingControler().setCreativeTab(BConstruct.ModTab);
        BRepo.heavyCaldronBlock = new HeavyCauldronBlock().setCreativeTab(BConstruct.ModTab);
        BRepo.heavyCaldronDrain = new HeavyCauldronDrain().setCreativeTab(BConstruct.ModTab);
        //register blocks
        registerBlock(BRepo.blazeingBlock);
        registerBlock(BRepo.glazedBricks);
        registerBlock(BRepo.brewingControler);
        registerBlock(BRepo.heavyCaldronBlock);
        registerBlock(BRepo.heavyCaldronDrain);
    }

    private static void setFireInfo()
    {
    }

    public static void registerBlock(Block block)
    {
        //TODO: 								getUnlocalizedName()
        GameRegistry.registerBlock(block, block.getUnlocalizedName().replace("tile.", ""));
    }

    public static void registerBlock(Block block, Class <? extends ItemBlock > itemBlockClass)
    {
        //TODO: 												getUnlocalizedName()
        GameRegistry.registerBlock(block, itemBlockClass, block.getUnlocalizedName().replace("tile.", ""));
    }
}
