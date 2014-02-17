package bconstruct.common.helpers;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BrewersCreativeTab extends CreativeTabs
{
    public BrewersCreativeTab(int par1, String par2Str)
    {
        super(par1, par2Str);
        // TODO Auto-generated constructor stub
    }
    @SideOnly(Side.CLIENT)
    public int getTabIconItemIndex()
    {
        return Item.potion.itemID;
    }

    //sets the title/name for the creative tab
    public String getTranslatedTabLabel()
    {
        return "Brewers Construct";
    }
}