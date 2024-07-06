package net.midas.crystalmod.util;

import net.midas.crystalmod.item.ModItems;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.Tags;

import javax.swing.text.html.HTML;

public class ModToolTiers
{
    public static final ForgeTier CRYSTAL = new ForgeTier(
            5,
            251,
            7f,
            5f,
            20,
            ModTags.Blocks.NEEDS_CRYSTAL_TOOL,
            () -> Ingredient.of(ModItems.CRYSTAL::get)
    );
}
