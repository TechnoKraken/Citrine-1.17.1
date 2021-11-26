package com.technokraken.ct.citrine.init;

import com.technokraken.ct.citrine.Citrine;
import com.technokraken.ct.citrine.item.ModCreativeModeTab;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Citrine.MOD_ID);

    // Items
    public static final RegistryObject<Item> CITRINE = ITEMS.register("citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CITRINE_TAB)));

    public static final RegistryObject<Item> RAW_CITRINE = ITEMS.register("raw_citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CITRINE_TAB)));

    public static final RegistryObject<Item> BLIZZARDED_CITRINE = ITEMS.register("blizzarded_citrine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CITRINE_TAB)));

    public static final RegistryObject<Item> SPRUCE_STICK = ITEMS.register("spruce_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CITRINE_TAB)));

    // Tools
    public static final RegistryObject<SwordItem> BLIZZARDED_SWORD = ITEMS.register("blizzarded_sword",
            () -> new SwordItem(ToolMaterialInit.BLIZZARDED, 33,12, new Item.Properties().tab(ModCreativeModeTab.CITRINE_TAB)));

    public static final RegistryObject<PickaxeItem> BLIZZARDED_PICKAXE = ITEMS.register("blizzarded_pickaxe",
            () -> new PickaxeItem(ToolMaterialInit.BLIZZARDED, 33,12, new Item.Properties().tab(ModCreativeModeTab.CITRINE_TAB)));

    public static final RegistryObject<AxeItem> BLIZZARDED_AXE = ITEMS.register("blizzarded_axe",
            () -> new AxeItem(ToolMaterialInit.BLIZZARDED, 33,12, new Item.Properties().tab(ModCreativeModeTab.CITRINE_TAB)));

    public static final RegistryObject<ShovelItem> BLIZZARDED_SHOVEL = ITEMS.register("blizzarded_shovel",
            () -> new ShovelItem(ToolMaterialInit.BLIZZARDED, 33, 12, new Item.Properties().tab(ModCreativeModeTab.CITRINE_TAB)));

    public static final RegistryObject<HoeItem> BLIZZARDED_HOE = ITEMS.register("blizzarded_hoe",
            () -> new HoeItem(ToolMaterialInit.BLIZZARDED, 33,12, new Item.Properties().tab(ModCreativeModeTab.CITRINE_TAB)));

    //Armor
    public static final RegistryObject<ArmorItem> BLIZZARDED_HELMET = ITEMS.register("blizzarded_helmet",
            () -> new ArmorItem(ArmorMaterialInit.BLIZZARDED, EquipmentSlot.HEAD, new Item.Properties().tab(ModCreativeModeTab.CITRINE_TAB)));

    public static final RegistryObject<ArmorItem> BLIZZARDED_CHESTPLATE = ITEMS.register("blizzarded_chestplate",
            () -> new ArmorItem(ArmorMaterialInit.BLIZZARDED, EquipmentSlot.CHEST, new Item.Properties().tab(ModCreativeModeTab.CITRINE_TAB)));

    public static final RegistryObject<ArmorItem> BLIZZARDED_LEGGINGS = ITEMS.register("blizzarded_leggings",
            () -> new ArmorItem(ArmorMaterialInit.BLIZZARDED, EquipmentSlot.LEGS, new Item.Properties().tab(ModCreativeModeTab.CITRINE_TAB)));

    public static final RegistryObject<ArmorItem> BLIZZARDED_BOOTS = ITEMS.register("blizzarded_boots",
            () -> new ArmorItem(ArmorMaterialInit.BLIZZARDED, EquipmentSlot.FEET, new Item.Properties().tab(ModCreativeModeTab.CITRINE_TAB)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
