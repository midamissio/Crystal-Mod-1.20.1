package net.midas.crystalmod.util;

import net.midas.crystalmod.item.ModItems;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModToolTiers
{
    public static final ForgeTier CRYSTAL = new ForgeTier(
            3,
            1500,
            5f,
            5f,
            20,
            ModTags.Blocks.NEEDS_CRYSTAL_TOOL,
            () -> Ingredient.of(ModItems.CRYSTAL::get)
    );
}
