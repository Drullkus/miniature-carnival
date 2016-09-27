package us.drullk.miniaturecarnival;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import us.drullk.miniaturecarnival.block.ModBlocks;
import us.drullk.miniaturecarnival.item.ModItems;
import us.drullk.miniaturecarnival.proxy.CommonProxy;

/**
 * Created by Drullkus on 9/26/16.
 */
@Mod(modid = MiniatureCarnival.MOD_ID, version = MiniatureCarnival.VERSION, name = MiniatureCarnival.MOD_NAME)
public class MiniatureCarnival implements MiniatureCarnivalProps {
    @SidedProxy(serverSide = COMMON_PROXY, clientSide = CLIENT_PROXY)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit();
        ModItems.preInit();
        ModBlocks.preInit();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init();
        ModItems.init();
        ModBlocks.init();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit();
        ModItems.postInit();
        ModBlocks.postInit();
    }
}
