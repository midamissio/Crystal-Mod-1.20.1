package net.midas.crystalmod.item;

import net.midas.crystalmod.CrystalMod;
import net.midas.crystalmod.item.custom.CrystalDetectorItem;
import net.midas.crystalmod.item.custom.FuelItem;
import net.midas.crystalmod.util.ModArmorMaterial;
import net.midas.crystalmod.util.ModToolTiers;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems
{
        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(ForgeRegistries.ITEMS, CrystalMod.MOD_ID);

        public static final RegistryObject<Item> CRYSTAL_SHARD = ITEMS.register("crystal_shard",
                () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRYSTAL = ITEMS.register("crystal",
                () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> CRYSTAL_DETECTOR = ITEMS.register("crystal_detector",
                () -> new CrystalDetectorItem(new Item.Properties().stacksTo(1).durability(256)));



        public static final RegistryObject<Item> CRYSTAL_SWORD = ITEMS.register("crystal_sword",
                () -> new SwordItem(ModToolTiers.CRYSTAL, 4, 2, new Item.Properties()));
        public static final RegistryObject<Item> CRYSTAL_PICKAXE = ITEMS.register("crystal_pickaxe",
                () -> new PickaxeItem(ModToolTiers.CRYSTAL, 1, 1, new Item.Properties()));
        public static final RegistryObject<Item> CRYSTAL_SHOVEL = ITEMS.register("crystal_shovel",
                () -> new ShovelItem(ModToolTiers.CRYSTAL, 0, 0, new Item.Properties()));
        public static final RegistryObject<Item> CRYSTAL_AXE = ITEMS.register("crystal_axe",
                () -> new AxeItem(ModToolTiers.CRYSTAL, 6, 1, new Item.Properties()));
        public static final RegistryObject<Item> CRYSTAL_HOE = ITEMS.register("crystal_hoe",
                () -> new HoeItem(ModToolTiers.CRYSTAL, 0, 0, new Item.Properties()));

        public static final RegistryObject<ArmorItem> CRYSTAL_HELMET = ITEMS.register("crystal_helmet",
                () -> new ArmorItem(
                        ModArmorMaterialInit.CRYSTAL,
                        ArmorItem.Type.HELMET,
                        new Item.Properties()
                ));
        public static final RegistryObject<ArmorItem> CRYSTAL_CHESTPLATE = ITEMS.register("crystal_chestplate",
                () -> new ArmorItem(
                        ModArmorMaterialInit.CRYSTAL,
                        ArmorItem.Type.CHESTPLATE,
                        new Item.Properties()
                ));
        public static final RegistryObject<ArmorItem> CRYSTAL_LEGGINGS = ITEMS.register("crystal_leggings",
                () -> new ArmorItem(
                        ModArmorMaterialInit.CRYSTAL,
                        ArmorItem.Type.LEGGINGS,
                        new Item.Properties()
                ));
        public static final RegistryObject<ArmorItem> CRYSTAL_BOOTS = ITEMS.register("crystal_boots",
                () -> new ArmorItem(
                        ModArmorMaterialInit.CRYSTAL,
                        ArmorItem.Type.BOOTS,
                        new Item.Properties()
                ));



        public static final RegistryObject<Item> CRYSTAL_COAL = ITEMS.register("crystal_coal",
                () -> new FuelItem(new Item.Properties(), 16000));

        public static void register (IEventBus eventbus)
        {
            ITEMS.register(eventbus);
        }
}
