package bconstruct.common.blocks.templates;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import bconstruct.BConstruct;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class BConstructBlock extends Block
{
    public BConstructBlock(int id, Material material, float hardness, String tex)
    {
        super(id, material);
        this.setHardness(hardness);
        this.setCreativeTab(BConstruct.ModTab);
        this.setUnlocalizedName(tex.replace(" ", "").toLowerCase());
        LanguageRegistry.addName(this, tex);
    }
}