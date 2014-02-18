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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import bconstruct.common.blocks.templates.BConstructBlock;
import bconstruct.common.blocks.templates.HeavyCauldronBace;
import bconstruct.common.util.ModInfo;
import bconstruct.common.configuration.Ids;
import bconstruct.common.configuration.Names;

public class BrewingControler extends HeavyCauldronBace
{
	 @SideOnly(Side.CLIENT)
	 Icon myicon;
	 
	 @SideOnly(Side.CLIENT)
     Icon mysides;
	 
     public BrewingControler()
     {
         super(Ids.blockBrewControlerID, Material.rock, 0.4f, Names.blockBrewControlerName);
     }
    
     @Override
     @SideOnly(Side.CLIENT)
     public void registerIcons(IconRegister par1IconRegister)
     {
         myicon = par1IconRegister.registerIcon(ModInfo.MODID + ":" + (this.getUnlocalizedName().substring(5)) + "_front");
         mysides = par1IconRegister.registerIcon(ModInfo.MODID + ":" + (this.getUnlocalizedName().substring(5) + "_side"));
     }

     @Override
     public Icon getBlockTexture (IBlockAccess world, int x, int y, int z, int side)
     {
    	 int meta = world.getBlockMetadata(x, y, z);
    	 if(meta == side)
    		 return myicon;
     	return mysides;
     }
     
     @Override
     @SideOnly(Side.CLIENT)
     public Icon getIcon(int side, int metadata)
     {
         return myicon;
     }

     @Override
     @SideOnly(Side.CLIENT)
     public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
     {
         for (int i = 0; i < 2; i++)
         {
             par3List.add(new ItemStack(par1, 1, i));
         }
     }
}
