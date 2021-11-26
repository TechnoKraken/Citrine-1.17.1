package com.technokraken.ct.citrine.init;

import com.technokraken.ct.citrine.BaseToolMaterial;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public final class ToolMaterialInit {
    private ToolMaterialInit() {
    }

    protected static final Tier BLIZZARDED = new BaseToolMaterial(17.5f,30.4f,500,8,5760,
            () -> Ingredient.of(ModItems.BLIZZARDED_CITRINE.get()));
}
