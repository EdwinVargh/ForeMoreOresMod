package net.edwin.foremoreores.datagen;

import net.edwin.foremoreores.ForeMoreOres;
import net.edwin.foremoreores.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ForeMoreOres.MOD_ID, existingFileHelper);
    }
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ALUMINUM_INGOT);
        simpleItem(ModItems.BAUXITE);
        simpleItem(ModItems.JADE);
        simpleItem(ModItems.LEAD_INGOT);
        simpleItem(ModItems.RAW_GALENA);
        simpleItem(ModItems.SULFUR);
        handheldItem(ModItems.JADE_SWORD);
        handheldItem(ModItems.JADE_SHOVEL);
        handheldItem(ModItems.JADE_AXE);
        handheldItem(ModItems.JADE_HOE);
        handheldItem(ModItems.JADE_PICKAXE);
        handheldItem(ModItems.BASEBALL_BAT);
        trimmedArmorItem(ModItems.JADE_LEGGINGS);
        trimmedArmorItem(ModItems.JADE_HELMET);
        trimmedArmorItem(ModItems.JADE_CHESTPLATE);
        trimmedArmorItem(ModItems.JADE_BOOTS);
        handheldItem(ModItems.TUNGSTEN);
        handheldItem(ModItems.TUNGSTEN_SWORD);
        handheldItem(ModItems.TUNGSTEN_SHOVEL);
        handheldItem(ModItems.TUNGSTEN_AXE);
        handheldItem(ModItems.TUNGSTEN_HOE);
        handheldItem(ModItems.TUNGSTEN_PICKAXE);
        trimmedArmorItem(ModItems.TUNGSTEN_LEGGINGS);
        trimmedArmorItem(ModItems.TUNGSTEN_HELMET);
        trimmedArmorItem(ModItems.TUNGSTEN_CHESTPLATE);
        trimmedArmorItem(ModItems.TUNGSTEN_BOOTS);
        simpleItem(ModItems.CANNED_APPLES);
        simpleItem(ModItems.CANNED_BEEF);
        simpleItem(ModItems.CANNED_BREAD);
        simpleItem(ModItems.CANNED_POTATOES);
        simpleItem(ModItems.CANNED_COD);
        simpleItem(ModItems.CANNED_SALMON);
        simpleItem(ModItems.CANNED_MELON);
        simpleItem(ModItems.CANNED_ROTTEN_FLESH);
        simpleItem(ModItems.CANNED_CHORUS_FRUIT);
        simpleItem(ModItems.CANNED_BEETROOT_SOUP);
        simpleItem(ModItems.CANNED_CHICKEN);
        simpleItem(ModItems.CANNED_BERRIES);
        simpleItem(ModItems.CANNED_CARROTS);
        simpleItem(ModItems.SODA);
        simpleItem(ModItems.BASEBALL);
        simpleItem(ModItems.DYNAMITE);
        simpleItem(ModItems.STEEL_INGOT);
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(ForeMoreOres.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(ForeMoreOres.MOD_ID,"item/" + item.getId().getPath()));
    }
    // Credit to El_Redstoniano for making this
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = ForeMoreOres.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }
}
