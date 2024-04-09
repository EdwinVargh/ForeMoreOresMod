package net.edwin.foremoreores.item;

import net.edwin.foremoreores.ForeMoreOres;
import net.edwin.foremoreores.entity.custom.BaseballProjectile;
import net.edwin.foremoreores.item.custom.*;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ForeMoreOres.MOD_ID);
    public static final RegistryObject<Item> BAUXITE = ITEMS.register("bauxite",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ALUMINUM_INGOT = ITEMS.register("aluminum_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_GALENA = ITEMS.register("raw_galena",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> JADE = ITEMS.register("jade",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> TUNGSTEN = ITEMS.register("tungsten",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> SULFUR = ITEMS.register("sulfur",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
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
    public static final RegistryObject<Item> BASEBALL = ITEMS.register("baseball",
            () -> new Baseball(new Item.Properties()));
    public static final RegistryObject<Item> DYNAMITE = ITEMS.register("dynamite",
            () -> new Dynamite(new Item.Properties()));
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
    public static final RegistryObject<Item> FERTILIZER = ITEMS.register("fertilizer",
            () -> new BoneMealItem(new Item.Properties()));


    public static final RegistryObject<Item> CANNED_BEEF = ITEMS.register("canned_beef",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_BEEF)));
    public static final RegistryObject<Item> CANNED_BEETROOT_SOUP = ITEMS.register("canned_beetroot_soup",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_BEETROOT_SOUP)));
    public static final RegistryObject<Item> CANNED_BERRIES = ITEMS.register("canned_berries",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_BERRIES)));
    public static final RegistryObject<Item> CANNED_CARROTS = ITEMS.register("canned_carrots",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_CARROTS)));
    public static final RegistryObject<Item> CANNED_CHICKEN = ITEMS.register("canned_chicken",
            () -> new Item(new Item.Properties().food(ModFoods.CANNED_CHICKEN)));
    public static final RegistryObject<Item> CANNED_CHORUS_FRUIT = ITEMS.register("canned_chorus_fruit",
            () -> new ChorusFruitItem(new Item.Properties().food(ModFoods.CANNED_CHORUS_FRUIT)));
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
