package net.edwin.miningmod.datagen;

import net.edwin.miningmod.block.ModBlocks;
import net.edwin.miningmod.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.ALUMINUM_BLOCK.get());
        dropSelf(ModBlocks.BAUXITE_BLOCK.get());
        dropSelf(ModBlocks.JADE_BLOCK.get());
        dropSelf(ModBlocks.LEAD_BLOCK.get());
        dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
        dropSelf(ModBlocks.CUT_LEAD_BLOCK.get());
        dropSelf(ModBlocks.TUNGSTEN_BLOCK.get());

        add(ModBlocks.BAUXITE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.BAUXITE_ORE.get(), ModItems.BAUXITE.get()));
        add(ModBlocks.DEEPSLATE_BAUXITE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_BAUXITE_ORE.get(), ModItems.BAUXITE.get()));
        add(ModBlocks.JADE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.JADE_ORE.get(), ModItems.JADE.get()));
        add(ModBlocks.GALENA.get(),
                (block) -> createOreDrop(ModBlocks.GALENA.get(), ModItems.RAW_GALENA.get()));
        add(ModBlocks.DEEPSLATE_GALENA.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_GALENA.get(), ModItems.RAW_GALENA.get()));
        add(ModBlocks.REINFORCED_GLASS.get(),
                (block) -> createSilkTouchOnlyTable(ModBlocks.REINFORCED_GLASS.get()));
        add(ModBlocks.NETHER_GALENA.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_GALENA.get(), ModItems.RAW_GALENA.get()));
        add(ModBlocks.DEEPSLATE_JADE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_JADE_ORE.get(), ModItems.JADE.get()));
        add(ModBlocks.TUNGSTEN_ORE.get(),
                (block) -> createOreDrop(ModBlocks.TUNGSTEN_ORE.get(), ModItems.TUNGSTEN.get()));
        add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), ModItems.TUNGSTEN.get()));
    }


    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
