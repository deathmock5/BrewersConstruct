package bconstruct.common.intigration;

import net.minecraft.item.ItemStack;
import bconstruct.common.plugins.ICompatPlugin;
import cpw.mods.fml.common.event.FMLInterModComms;

public class Thaumcraft implements ICompatPlugin
{
    @Override
    public String getModId()
    {
        return "Thaumcraft";
    }

    @Override
    public void preInit()
    {
    }

    @Override
    public void init()
    {
        //TConstruct.logger.info("[Thaumcraft] Registering harvestables.");
        //FMLInterModComms.sendMessage("Thaumcraft", "harvestClickableCrop", new ItemStack(BRepo.oreBerry, 1, 12));
    }

    @Override
    public void postInit()
    {
    }
}
