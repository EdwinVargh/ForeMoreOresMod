package net.edwin.foremoreores.datagen;

import net.edwin.foremoreores.block.ModBlocks;
import net.edwin.foremoreores.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.ALUMINUM_BLOCK.get());
        this.dropSelf(ModBlocks.BAUXITE_BLOCK.get());
        this.dropSelf(ModBlocks.JADE_BLOCK.get());
        this.dropSelf(ModBlocks.LEAD_BLOCK.get());
        this.dropSelf(ModBlocks.RAW_LEAD_BLOCK.get());
        this.dropSelf(ModBlocks.CUT_LEAD_BLOCK.get());
        this.dropSelf(ModBlocks.TUNGSTEN_BLOCK.get());

        this.add(ModBlocks.BAUXITE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.BAUXITE_ORE.get(), ModItems.BAUXITE.get()));
        this.add(ModBlocks.DEEPSLATE_BAUXITE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_BAUXITE_ORE.get(), ModItems.BAUXITE.get()));
        this.add(ModBlocks.JADE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.JADE_ORE.get(), ModItems.JADE.get()));
        this.add(ModBlocks.GALENA.get(),
                (block) -> createOreDrop(ModBlocks.GALENA.get(), ModItems.RAW_GALENA.get()));
        this.add(ModBlocks.DEEPSLATE_GALENA.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_GALENA.get(), ModItems.RAW_GALENA.get()));
        this.add(ModBlocks.REINFORCED_GLASS.get(),
                (block) -> createSilkTouchOnlyTable(ModBlocks.REINFORCED_GLASS.get()));
        this.add(ModBlocks.NETHER_GALENA.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_GALENA.get(), ModItems.RAW_GALENA.get()));
        this.add(ModBlocks.DEEPSLATE_JADE_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_JADE_ORE.get(), ModItems.JADE.get()));
        this.add(ModBlocks.TUNGSTEN_ORE.get(),
                (block) -> createOreDrop(ModBlocks.TUNGSTEN_ORE.get(), ModItems.TUNGSTEN.get()));
        this.add(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(),
                (block) -> createOreDrop(ModBlocks.DEEPSLATE_TUNGSTEN_ORE.get(), ModItems.TUNGSTEN.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
