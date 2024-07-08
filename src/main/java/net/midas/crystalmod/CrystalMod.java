package net.midas.crystalmod;

import com.mojang.logging.LogUtils;
import net.midas.crystalmod.block.ModBlocks;
import net.midas.crystalmod.item.ModCreativeModTabs;
import net.midas.crystalmod.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CrystalMod.MOD_ID)
public class CrystalMod
{
    public static final String MOD_ID = "crystal_mod";

    private static final Logger LOGGER = LogUtils.getLogger();

    public CrystalMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
        {
            event.accept(ModBlocks.CRYSTAL_BLOCK);
        }
        if(event.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS)
        {
            event.accept(ModBlocks.CRYSTAL_ORE);
            event.accept(ModBlocks.DEEPSLATE_CRYSTAL_ORE);
        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES)
        {
            event.accept(ModItems.CRYSTAL_PICKAXE);
            event.accept(ModItems.CRYSTAL_AXE);
            event.accept(ModItems.CRYSTAL_SHOVEL);
            event.accept(ModItems.CRYSTAL_HOE);
            event.accept(ModItems.CRYSTAL_DETECTOR);
        }
        if(event.getTabKey() == CreativeModeTabs.COMBAT)
        {
            event.accept(ModItems.CRYSTAL_SWORD);
            event.accept(ModItems.CRYSTAL_HELMET);
            event.accept(ModItems.CRYSTAL_CHESTPLATE);
            event.accept(ModItems.CRYSTAL_LEGGINGS);
            event.accept(ModItems.CRYSTAL_BOOTS);
        }
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS)
        {
            event.accept(ModItems.CRYSTAL_SHARD);
            event.accept(ModItems.CRYSTAL);
            event.accept(ModItems.CRYSTAL_COAL);
        }
    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
