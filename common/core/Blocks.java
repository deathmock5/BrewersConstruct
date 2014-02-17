package bconstruct.common.core;

import bconstruct.common.blocks.BlazeingBlock;
import bconstruct.common.blocks.GlazedBricks;
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

    public static void registerBlocks()
    {
        //set block repos
        BRepo.blazeingBlock = new BlazeingBlock();
        BRepo.glazedBricks = new GlazedBricks();
        //register blocks
        registerBlock(BRepo.blazeingBlock);
        registerBlock(BRepo.glazedBricks);
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
