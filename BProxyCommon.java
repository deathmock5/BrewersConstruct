package bconstruct;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.registry.LanguageRegistry;

/**
 * Common proxy class for InfiTools
 */

public class BProxyCommon implements IGuiHandler
{
    public static int brewingcontrolerID = 0;
    public static int brewingBottlerID = 1;

    @Override
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if (ID < 0)
        {
            return null;
        }

        return null;
    }

    @Override
    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        return null;
    }

    public void registerTickHandler()
    {
        //TickRegistry.registerTickHandler(new TimeTicker(), Side.SERVER);
    }

    /* Registers any rendering code. Does nothing server-side */
    public void registerRenderer()
    {
    }

    /* Ties an internal name to a visible one. */
    public void addNames()
    {
        // As of 1.6.x, this is now handled by Minecraft itself for the most part.
    }

    public void readManuals()
    {
    }

    public void registerKeys()
    {
    }

    public void spawnParticle(String slimeParticle, double xPos, double yPos, double zPos, double velX, double velY, double velZ)
    {
    }

    public void postInit()
    {
    }
}
