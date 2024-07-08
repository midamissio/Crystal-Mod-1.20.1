package net.midas.crystalmod.item;

import net.midas.crystalmod.CrystalMod;
import net.midas.crystalmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs
{
   public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
           DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CrystalMod.MOD_ID);

   public static final RegistryObject<CreativeModeTab> CRYSTAL_TAB = CREATIVE_MODE_TABS.register("crystal_tab",
           () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.CRYSTAL.get()))
                   .title(Component.translatable("creativetab.crystal_tab"))
                   .displayItems((pParameters, pOutput) -> {
                       pOutput.accept(ModItems.CRYSTAL.get());
                       pOutput.accept(ModItems.CRYSTAL_SHARD.get());

                       pOutput.accept(ModBlocks.CRYSTAL_BLOCK.get());

                       pOutput.accept(ModBlocks.CRYSTAL_ORE.get());
                       pOutput.accept(ModBlocks.DEEPSLATE_CRYSTAL_ORE.get());

                       pOutput.accept(ModItems.CRYSTAL_DETECTOR.get());

                       pOutput.accept(ModItems.CRYSTAL_AXE.get());
                       pOutput.accept(ModItems.CRYSTAL_PICKAXE.get());
                       pOutput.accept(ModItems.CRYSTAL_HOE.get());
                       pOutput.accept(ModItems.CRYSTAL_SWORD.get());
                       pOutput.accept(ModItems.CRYSTAL_SHOVEL.get());

                       pOutput.accept(ModItems.CRYSTAL_HELMET.get());
                       pOutput.accept(ModItems.CRYSTAL_CHESTPLATE.get());
                       pOutput.accept(ModItems.CRYSTAL_LEGGINGS.get());
                       pOutput.accept(ModItems.CRYSTAL_BOOTS.get());

                       pOutput.accept(ModItems.CRYSTAL_COAL.get());
                   })
                   .build());

   public static void register(IEventBus eventBus)
   {
       CREATIVE_MODE_TABS.register(eventBus);
   }
}
