package bconstruct.common.core;

import bconstruct.common.blocks.BlazeingBlock;
import bconstruct.common.util.BRepo;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.common.registry.GameRegistry;

public class Crafting
{
    public static void init()
    {
        GameRegistry.addRecipe(new ItemStack(BRepo.blazeingBlock), new Object[]
                               {
                                   "XXX",
                                   "XXX",
                                   "XXX",
                                   'X', Item.blazeRod
                               });
        GameRegistry.addShapelessRecipe(new ItemStack(Item.blazeRod, 9), new Object[]
                                        {
                                            new ItemStack(BRepo.blazeingBlock)
                                        });
    }
}
