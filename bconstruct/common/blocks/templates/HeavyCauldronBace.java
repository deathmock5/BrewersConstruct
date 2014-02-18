package bconstruct.common.blocks.templates;

import java.util.List;

import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import mantle.blocks.abstracts.InventoryBlock;
import mantle.blocks.iface.IMasterLogic;
import mantle.blocks.iface.IServantLogic;

public class HeavyCauldronBace extends InventoryBlock {

	protected HeavyCauldronBace(int id, Material material, float hardness, String tex) {
		super(id, material);
		// TODO Auto-generated constructor stub
        this.setHardness(hardness);
        this.setUnlocalizedName(tex.replace(" ", "").toLowerCase());
        setResistance(20F);
        setStepSound(soundMetalFootstep);
        LanguageRegistry.addName(this, tex);
	}

	@Override
	public TileEntity createTileEntity(World world, int metadata) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getGui(World world, int x, int y, int z,
			EntityPlayer entityplayer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getModInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String[] getTextureNames() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase living, ItemStack stack)
    {
    	int l = MathHelper.floor_double((double)(living.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0)
        {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        if (l == 1)
        {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }

        if (l == 2)
        {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }

        if (l == 3)
        {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }
    }
	
	/* Updating */
    @Override
    public void onNeighborBlockChange (World world, int x, int y, int z, int nBlockID)
    {
        //System.out.println("Neighbor changed");
        TileEntity logic = world.getBlockTileEntity(x, y, z);
        if (logic instanceof IServantLogic)
        {
            ((IServantLogic) logic).notifyMasterOfChange();
        }
        else if (logic instanceof IMasterLogic)
        {
            ((IMasterLogic) logic).notifyChange(null, x, y, z);
        }
    }

    @Override
    public void breakBlock (World world, int x, int y, int z, int blockID, int meta)
    {
        TileEntity logic = world.getBlockTileEntity(x, y, z);
        if (logic instanceof IServantLogic)
        {
            ((IServantLogic) logic).notifyMasterOfChange();
        }
        super.breakBlock(world, x, y, z, blockID, meta);
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
