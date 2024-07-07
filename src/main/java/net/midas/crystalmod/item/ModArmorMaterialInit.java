package net.midas.crystalmod.item;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.crafting.Ingredient;

public class ModArmorMaterialInit
{
    public static final net.midas.crystalmod.util.ModArmorMaterial CRYSTAL = new net.midas.crystalmod.util.ModArmorMaterial(
            new int[] {175, 250, 240, 200},
            new int[] {2, 6, 5, 2},
            20,
            SoundEvents.ARMOR_EQUIP_GOLD,
            () -> Ingredient.of(ModItems.CRYSTAL::get),
            "crystal",
            0.75f,
            5f
    );
}
