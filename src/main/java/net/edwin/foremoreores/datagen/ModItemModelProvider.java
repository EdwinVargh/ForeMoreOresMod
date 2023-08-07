package net.edwin.foremoreores.datagen;

import net.edwin.foremoreores.ForeMoreOres;
import net.edwin.foremoreores.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ForeMoreOres.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.ALUMINUM_INGOT);
        simpleItem(ModItems.BAUXITE);
        simpleItem(ModItems.JADE);
        simpleItem(ModItems.LEAD_INGOT);
        simpleItem(ModItems.RAW_GALENA);
        handheldItem(ModItems.JADE_SWORD);
        handheldItem(ModItems.JADE_SHOVEL);
        handheldItem(ModItems.JADE_AXE);
        handheldItem(ModItems.JADE_HOE);
        handheldItem(ModItems.JADE_PICKAXE);
        handheldItem(ModItems.BASEBALL_BAT);
        simpleItem(ModItems.JADE_LEGGINGS);
        simpleItem(ModItems.JADE_HELMET);
        simpleItem(ModItems.JADE_CHESTPLATE);
        simpleItem(ModItems.JADE_BOOTS);
        handheldItem(ModItems.TUNGSTEN);
        handheldItem(ModItems.TUNGSTEN_SWORD);
        handheldItem(ModItems.TUNGSTEN_SHOVEL);
        handheldItem(ModItems.TUNGSTEN_AXE);
        handheldItem(ModItems.TUNGSTEN_HOE);
        handheldItem(ModItems.TUNGSTEN_PICKAXE);
        simpleItem(ModItems.TUNGSTEN_LEGGINGS);
        simpleItem(ModItems.TUNGSTEN_HELMET);
        simpleItem(ModItems.TUNGSTEN_CHESTPLATE);
        simpleItem(ModItems.TUNGSTEN_BOOTS);
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
}
