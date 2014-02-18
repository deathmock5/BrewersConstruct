package bconstruct.common.blocks;

import java.util.List;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import mantle.blocks.iface.IFacingLogic;
import mantle.blocks.iface.IMasterLogic;
import mantle.blocks.iface.IServantLogic;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Icon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import bconstruct.common.blocks.templates.HeavyCauldronBace;
import bconstruct.common.util.ModInfo;
import bconstruct.common.configuration.Ids;
import bconstruct.common.configuration.Names;

public class HeavyCauldronDrain extends HeavyCauldronBace
{
	@SideOnly(Side.CLIENT)
    Icon myicon;
	Icon fronticon;
	Icon backicon;
    public HeavyCauldronDrain()
    {
        super(Ids.blockCauldronDrainID, Material.rock, 0.4f, Names.blockCauldronDrainName);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IconRegister par1IconRegister)
    {
        myicon = par1IconRegister.registerIcon(ModInfo.MODID + ":" + (this.getUnlocalizedName().substring(5).substring(0,this.getUnlocalizedName().length()-10)) + "_block");
        fronticon = par1IconRegister.registerIcon(ModInfo.MODID + ":" + (this.getUnlocalizedName().substring(5).substring(0,this.getUnlocalizedName().length()-10)) + "_drain_front");
        backicon = par1IconRegister.registerIcon(ModInfo.MODID + ":" + (this.getUnlocalizedName().substring(5).substring(0,this.getUnlocalizedName().length()-10)) + "_drain_back");
    }
    
    @Override
    public Icon getBlockTexture (IBlockAccess world, int x, int y, int z, int side)
    {
    	int metadata = world.getBlockMetadata(x, y, z);
    	if(side == metadata)
    		return fronticon;
    	if(side == 2 && metadata == 3)
    		return backicon;
    	if(side == 3 && metadata == 2)
    		return backicon;
    	if(side == 4 && metadata == 5)
    		return backicon;
    	if(side == 5 && metadata == 4)
    		return backicon;
    	return myicon;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public Icon getIcon(int side, int metadata)
    {
    	
    	return myicon;
    }
    
}
