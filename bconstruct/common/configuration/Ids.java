package bconstruct.common.configuration;

import java.io.File;

import bconstruct.BConstruct;
import net.minecraftforge.common.Configuration;

public class Ids
{
    //modrelatedproperties
    public static boolean achievementsEnabled = false;
    //Item ids
    public static int itemGlazedBrickID;
    public static int itemRawBrickingID;
    public static int itemPotionBottleID;
    public static int itemPotionFlashID;
    public static int itemPotionJugID;
    public static int itemAetherwartID;
    public static int itemPotionNeedlerID;
    public static int itemPotionNeedleRifleID;
    public static int itemSilicateBlendID;
    //Block Ids
    public static int blockBrewControlerID;
    public static int blockCauldronBlockID;
    public static int blockCauldronDraingID;
    public static int blockCauldronSpigotID;
    public static int blockBlazeingID;
    public static int blockBottlerID;
    public static int blockGlazedBricksID;
    public static int blockPotionGlassID;
    public static int blockPotionTurretID;
    public static int blockSaltID;
    public static int blockAluminumOreID;
    public static int blockAluminumBlockID;
    //Fluid Ids

    public static void initProps(File confFile)
    {
        /* [Forge] Configuration class, used as config method */
        Configuration config = new Configuration(confFile);
        /* Load the configuration file */
        config.load();
        //Item ids
        final int BASEITEMIDOFFSET = 14300;
        int baseItemIDModifer = 0;
        itemGlazedBrickID = config.get("Item IDs", Names.itemGlazedBrickName, BASEITEMIDOFFSET + baseItemIDModifer++).getInt();
        itemRawBrickingID = config.get("Item IDs", Names.itemRawBrickingName, BASEITEMIDOFFSET + baseItemIDModifer++).getInt();
        itemPotionBottleID = config.get("Item IDs", Names.itemPotionBottleName, BASEITEMIDOFFSET + baseItemIDModifer++).getInt();
        itemPotionFlashID = config.get("Item IDs", Names.itemPotionFlashName, BASEITEMIDOFFSET + baseItemIDModifer++).getInt();
        itemPotionJugID = config.get("Item IDs", Names.itemPotionJugName, BASEITEMIDOFFSET + baseItemIDModifer++).getInt();
        itemAetherwartID = config.get("Item IDs", Names.itemAetherwartName, BASEITEMIDOFFSET + baseItemIDModifer++).getInt();
        itemPotionNeedlerID = config.get("Item IDs", Names.itemPotionNeedlerName, BASEITEMIDOFFSET + baseItemIDModifer++).getInt();
        itemPotionNeedleRifleID = config.get("Item IDs", Names.itemPotionNeedleRifleName, BASEITEMIDOFFSET + baseItemIDModifer++).getInt();
        itemSilicateBlendID = config.get("Item IDs", Names.itemSilicateBlendName, BASEITEMIDOFFSET + baseItemIDModifer++).getInt();;
        //Block Ids
        final int BASEBLOCKIDOFFSET = 436;
        int baseBlockIDModifer = 0;
        blockBrewControlerID = config.get("Block IDs", Names.blockBrewControlerName, BASEBLOCKIDOFFSET + baseBlockIDModifer++).getInt();
        blockCauldronBlockID = config.get("Block IDs", Names.blockCauldronBlockName, BASEBLOCKIDOFFSET + baseBlockIDModifer++).getInt();
        blockCauldronDraingID = config.get("Block IDs", Names.blockCauldronDrainName, BASEBLOCKIDOFFSET + baseBlockIDModifer++).getInt();
        blockCauldronSpigotID = config.get("Block IDs", Names.blockCauldronSpigotName, BASEBLOCKIDOFFSET + baseBlockIDModifer++).getInt();
        blockBlazeingID = config.get("Block IDs", Names.blockBlazeingName, BASEBLOCKIDOFFSET + baseBlockIDModifer++).getInt();
        blockBottlerID = config.get("Block IDs", Names.blockBottlerName, BASEBLOCKIDOFFSET + baseBlockIDModifer++).getInt();
        blockGlazedBricksID = config.get("Block IDs", Names.blockGlazedBricksName, BASEBLOCKIDOFFSET + baseBlockIDModifer++).getInt();
        blockPotionGlassID = config.get("Block IDs", Names.blockPotionGlassName, BASEBLOCKIDOFFSET + baseBlockIDModifer++).getInt();
        blockPotionTurretID = config.get("Block IDs", Names.blockPotionTurretName, BASEBLOCKIDOFFSET + baseBlockIDModifer++).getInt();
        blockSaltID = config.get("Block IDs", Names.blockSaltName, BASEBLOCKIDOFFSET + baseBlockIDModifer++).getInt();
        blockAluminumOreID = config.get("Block IDs", Names.blockAluminumOreName, BASEBLOCKIDOFFSET + baseBlockIDModifer++).getInt();
        blockAluminumBlockID = config.get("Block IDs", Names.blockAluminumBlockName, BASEBLOCKIDOFFSET + baseBlockIDModifer++).getInt();
        config.save();
        BConstruct.logger.info("Config Loaded!");
        boolean ic2 = true;
        boolean xycraft = true;

        try
        {
            Class c = Class.forName("ic2.core.IC2");
            ic2 = false;
        }
        catch (Exception e)
        {
        }

        try
        {
            Class c = Class.forName("soaryn.xycraft.core.XyCraft");
            xycraft = false;
        }
        catch (Exception e)
        {
        }
    }
}
