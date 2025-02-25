package net.midas.crystalmod.util;

import net.midas.crystalmod.CrystalMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags
{
    public static class Blocks
    {
        public static final TagKey<Block> CRYSTAL_DETECTOR_VALUABLES = tag("crystal_detector_valuables");
        public static final TagKey<Block> NEEDS_CRYSTAL_TOOL = tag("needs_crystal_tool");

        private static TagKey<Block> tag(String name)
        {
            return BlockTags.create(new ResourceLocation(CrystalMod.MOD_ID, name));
        }
    }

    public static class Items
    {
        private static TagKey<Item> tag(String name)
        {
            return ItemTags.create(new ResourceLocation(CrystalMod.MOD_ID, name));
        }
    }
}
