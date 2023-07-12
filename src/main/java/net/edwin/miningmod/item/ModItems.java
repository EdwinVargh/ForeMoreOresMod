package net.edwin.miningmod.item;

import net.edwin.miningmod.MiningMod;
import net.edwin.miningmod.item.custom.BaseballBat;
import net.edwin.miningmod.item.custom.CannedBread;
import net.edwin.miningmod.item.custom.DrinkItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MiningMod.MOD_ID);
    public static final RegistryObject<Item> BAUXITE = ITEMS.register("bauxite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM = ITEMS.register("aluminum",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD = ITEMS.register("lead",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE = ITEMS.register("jade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN = ITEMS.register("tungsten",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE_SWORD = ITEMS.register("jade_sword",
            () -> new SwordItem(ModTiers.JADE, 2, 3f, new Item.Properties()));
    public static final RegistryObject<Item> JADE_PICKAXE = ITEMS.register("jade_pickaxe",
            () -> new PickaxeItem(ModTiers.JADE, 1,1f,new Item.Properties()));
    public static final RegistryObject<Item> JADE_HOE = ITEMS.register("jade_hoe",
            () -> new HoeItem(ModTiers.JADE, 0, 0f, new Item.Properties()));
    public static final RegistryObject<Item> JADE_SHOVEL = ITEMS.register("jade_shovel",
            () -> new ShovelItem(ModTiers.JADE,0,1f,new Item.Properties()));
    public static final RegistryObject<Item> JADE_AXE = ITEMS.register("jade_axe",
            () -> new AxeItem(ModTiers.JADE,4,0f,new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_SWORD = ITEMS.register("tungsten_sword",
            () -> new SwordItem(ModTiers.TUNGSTEN, 2, 3f, new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_PICKAXE = ITEMS.register("tungsten_pickaxe",
            () -> new PickaxeItem(ModTiers.TUNGSTEN, 1,1f,new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_HOE = ITEMS.register("tungsten_hoe",
            () -> new HoeItem(ModTiers.TUNGSTEN, 0, 0f, new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_SHOVEL = ITEMS.register("tungsten_shovel",
            () -> new ShovelItem(ModTiers.TUNGSTEN,0,1f,new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_AXE = ITEMS.register("tungsten_axe",
            () -> new AxeItem(ModTiers.TUNGSTEN,4,0f,new Item.Properties()));
    public static final RegistryObject<Item> BASEBALL_BAT = ITEMS.register("baseball_bat",
            () -> new BaseballBat(ModTiers.ALUMINUM, 1, 3f, new Item.Properties()));

    public static final RegistryObject<Item> JADE_HELMET = ITEMS.register("jade_helmet",
            () -> new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> JADE_CHESTPLATE = ITEMS.register("jade_chestplate",
            () -> new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> JADE_LEGGINGS = ITEMS.register("jade_leggings",
            () -> new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> JADE_BOOTS = ITEMS.register("jade_boots",
            () -> new ArmorItem(ModArmorMaterials.JADE, ArmorItem.Type.BOOTS, new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_HELMET = ITEMS.register("tungsten_helmet",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.HELMET, new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_CHESTPLATE = ITEMS.register("tungsten_chestplate",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.CHESTPLATE, new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_LEGGINGS = ITEMS.register("tungsten_leggings",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.LEGGINGS, new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN_BOOTS = ITEMS.register("tungsten_boots",
            () -> new ArmorItem(ModArmorMaterials.TUNGSTEN, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> CANNED_BEEF = ITEMS.register("canned_beef",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_BEEF)));
    public static final RegistryObject<Item> CANNED_BREAD = ITEMS.register("canned_bread",
            () -> new CannedBread(new Item.Properties().food(ModFoods.CANNED_BREAD)));
    public static final RegistryObject<Item> CANNED_APPLES = ITEMS.register("canned_apples",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_APPLES)));
    public static final RegistryObject<Item> CANNED_POTATOES = ITEMS.register("canned_potatoes",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_POTATOES)));
    public static final RegistryObject<Item> CANNED_COD = ITEMS.register("canned_cod",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_COD)));
    public static final RegistryObject<Item> CANNED_SALMON = ITEMS.register("canned_salmon",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_SALMON)));
    public static final RegistryObject<Item> CANNED_MELON = ITEMS.register("canned_melon",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_MELON)));
    public static final RegistryObject<Item> CANNED_ROTTEN_FLESH = ITEMS.register("canned_rotten_flesh",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_ROTTEN_FLESH)));
    public static final RegistryObject<Item> SODA = ITEMS.register("soda",
            () -> new DrinkItem(new Item.Properties().food(ModFoods.SODA)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }


}
