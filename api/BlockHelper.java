package bconstruct.api;

import net.minecraft.block.Block;
import bconstruct.common.util.ModInfo;
import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;

public class BlockHelper
{
    public static Block get(String name)
    {
        return GameRegistry.findBlock(ModInfo.MODID, name);
    }

    //public static String getUniqueName(Block block)
    //{
    //    return GameData.blockRegistry.getNameForObject(block);
    //}
}
