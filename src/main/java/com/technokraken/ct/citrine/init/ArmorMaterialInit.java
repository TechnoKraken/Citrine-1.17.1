package com.technokraken.ct.citrine.init;

import com.technokraken.ct.citrine.Citrine;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public final class ArmorMaterialInit {
    private ArmorMaterialInit() {
    }

    public static final ArmorMaterial BLIZZARDED = new BaseArmorMaterial(100,new int[] {21, 31, 48, 24},
            new int[] {20, 35, 50, 28},0.5f,9.7f, Citrine.MOD_ID + ":blizzarded", SoundEvents.ARMOR_EQUIP_DIAMOND, () -> Ingredient.of(ModItems.BLIZZARDED_CITRINE.get()));
}
