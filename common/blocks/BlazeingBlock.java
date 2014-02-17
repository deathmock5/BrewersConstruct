package bconstruct.common.blocks;


import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Icon;
import net.minecraft.world.World;
import bconstruct.common.blocks.templates.BConstructBlock;
import bconstruct.common.util.ModInfo;
import bconstruct.common.configuration.Ids;
import bconstruct.common.configuration.Names;

public class BlazeingBlock extends BConstructBlock{
	@SideOnly(Side.CLIENT)
	private Icon topbot;
	
	@SideOnly(Side.CLIENT)
	private Icon sides;
	
	public BlazeingBlock() {
		super(Ids.blockBlazeingID,Material.rock, 0.4f, Names.blockBlazeingName);
		this.setLightValue(1f);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
          topbot = par1IconRegister.registerIcon(ModInfo.MODID + ":" + (this.getUnlocalizedName().substring(5)) + "_top");
          sides = par1IconRegister.registerIcon(ModInfo.MODID + ":" + (this.getUnlocalizedName().substring(5)) + "_sides");
    }
	
	@Override
	@SideOnly(Side.CLIENT)
	public Icon getIcon(int side, int metadata)
    {
		if(side == 0 ||side == 1)
		{
			return topbot;
		}
		else
		{
			return sides;
		}
    }
	
	@Override
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
          for(int i = 0; i < 2; i++)
          {
                 par3List.add(new ItemStack(par1, 1, i));
          }
    }
	
	@Override
    public void onEntityCollidedWithBlock (World par1World, int x, int y, int z, Entity entity)
    {
        if (entity instanceof EntityLivingBase)
        {
            entity.motionX *= 0.4D;
            entity.motionZ *= 0.4D;
        }
        if (!(entity instanceof EntityItem) && !entity.isImmuneToFire())
        {
            entity.setFire(15);
        }
    }
}
