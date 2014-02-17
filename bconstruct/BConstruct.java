package bconstruct;

import java.util.logging.Level;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import bconstruct.common.core.Blocks;
import bconstruct.common.handlers.BEventHandler;
import bconstruct.common.util.Log;
import bconstruct.common.network.packet.PacketPipeline;
import bconstruct.common.core.Crafting;
import bconstruct.common.helpers.BrewersCreativeTab;
import bconstruct.common.plugins.PluginController;
import bconstruct.common.configuration.Ids;
import bconstruct.common.util.ModInfo;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;
import cpw.mods.fml.relauncher.Side;

/** Brewers Construct, the advanced brewing mod
 * Brew potions with ease, then adapt and change them how you see fit!
 * @author Deathmock5
 */

@Mod(modid = ModInfo.MODID, name = ModInfo.NAME, version = ModInfo.VERSION, dependencies = ModInfo.DEPENDENCYS)
public class BConstruct
{
    /** The value of one ingot in millibuckets */
    public static final int bottleLiquidValue = 100;
    public static final int liquidUpdateAmount = 6;
    public static Blocks blocks;
    public static Crafting crafting;
    public static BEventHandler events;
    // Shared mod logger
    public static Log logger;

    /* Instance of this mod, used for grabbing prototype fields */
    @Instance("BrewersConstruct")
    public static BConstruct instance;
    /* Proxies for sides, used for graphics processing */
    @SidedProxy(clientSide = ModInfo.CLIENT, serverSide = ModInfo.COMMON)
    public static BProxyCommon proxy;

    //The crative tab
    public static CreativeTabs ModTab = new BrewersCreativeTab(CreativeTabs.getNextID(), "Mod Tutorial Tab");
    //The name of the enum is accompanied by numbers because I have no idea what will happen if another mod will try to add the same enum, just to be safe
    //public static EnumCreatureType creatureTypePlayer = EnumHelper.addCreatureType("PLAYER_5821443", EntityPlayer.class, 0, Material.air, true);

    //The packet pipeline
    public static final PacketPipeline packetPipeline = new PacketPipeline();

    public BConstruct()
    {
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Ids.initProps(event.getSuggestedConfigurationFile());
        blocks = new Blocks();
        crafting = new Crafting();
        events = new BEventHandler();
        MinecraftForge.EVENT_BUS.register(events);
        blocks.registerBlocks();
        //MinecraftForge.EVENT_BUS.register(new TEventHandlerAchievement());
        //recipes.oreRegistry();
        proxy.registerRenderer();
        proxy.addNames();
        proxy.readManuals();
        proxy.registerKeys();
        proxy.registerTickHandler();
        //GameRegistry.registerCraftingHandler(new TCraftingHandler());
        // NetworkRegistry.INSTANCE.registerGuiHandler(instance, proxy);
        PluginController.getController().preInit();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        //packetPipeline.initalise();
        if (event.getSide() == Side.CLIENT)
        {
            //MinecraftForge.EVENT_BUS.register(new EventCloakRender());
        }

        //DimensionBlacklist.getBadBimensions();
        //GameRegistry.registerWorldGenerator(new SlimeIslandGen(TRepo.slimePool, 2), 2);
        PluginController.getController().init();

        if (Ids.achievementsEnabled)
        {
            //TAchievements.init();
        }
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent evt)
    {
        proxy.postInit();
        //packetPipeline.postInitialise();
        //recipes.modIntegration();
        //recipes.addOreDictionarySmelteryRecipes();
        //content.createEntities();
        crafting.init();
        PluginController.getController().postInit();
    }
}