package net.edwin.foremoreores.datagen;

import net.edwin.foremoreores.ForeMoreOres;
import net.edwin.foremoreores.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ForeMoreOres.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BAUXITE_BLOCK);
        blockWithItem(ModBlocks.ALUMINUM_BLOCK);
        blockWithItem(ModBlocks.JADE_BLOCK);
        blockWithItem(ModBlocks.RAW_LEAD_BLOCK);
        blockWithItem(ModBlocks.LEAD_BLOCK);
        blockWithItem(ModBlocks.CUT_LEAD_BLOCK);
        blockWithItem(ModBlocks.GALENA);
        blockWithItem(ModBlocks.DEEPSLATE_GALENA);
        blockWithItem(ModBlocks.NETHER_GALENA);
        blockWithItem(ModBlocks.BAUXITE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_BAUXITE_ORE);
        blockWithItem(ModBlocks.JADE_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_JADE_ORE);
        blockWithItem(ModBlocks.TUNGSTEN_ORE);
        blockWithItem(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
        blockWithItem(ModBlocks.TUNGSTEN_BLOCK);
        blockWithItem(ModBlocks.REINFORCED_GLASS);
        blockWithItem(ModBlocks.SULFUR_BLOCK);
        blockWithItem(ModBlocks.SULFUR_ORE);
        blockWithItem(ModBlocks.STEEL_BRICKS);
        blockWithItem(ModBlocks.STEEL_STONE_BRICKS);
        blockWithItem(ModBlocks.STEEL_NETHER_BRICKS);
        blockWithItem(ModBlocks.STEEL_RED_NETHER_BRICKS);
        blockWithItem(ModBlocks.STEEL_END_STONE_BRICKS);
        blockWithItem(ModBlocks.STEEL_PURPUR);
        axisBlock(ModBlocks.STEEL_PURPUR_PILLAR, modLoc("block/steel_purpur_pillar"), modLoc("block/steel_purpur_pillar_top"));
        blockWithItem(ModBlocks.STEEL_PRISMARINE_BRICKS);
        blockWithItem(ModBlocks.STEEL_DARK_PRISMARINE);
        blockWithItem(ModBlocks.STEEL_QUARTZ_BRICKS);
        axisBlock(ModBlocks.STEEL_QUARTZ_PILLAR, modLoc("block/steel_quartz_pillar"), modLoc("block/steel_quartz_pillar_top"));
        blockWithItem(ModBlocks.STEEL_DEEPSLATE_BRICKS);
        blockWithItem(ModBlocks.STEEL_DEEPSLATE_TILES);
        blockWithItem(ModBlocks.STEEL_MUD_BRICKS);
        blockWithItem(ModBlocks.STEEL_BLACKSTONE_BRICKS);
        blockWithItem(ModBlocks.STEEL_CUT_SANDSTONE);
        blockWithItem(ModBlocks.STEEL_CUT_RED_SANDSTONE);
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
    private void axisBlock(RegistryObject<RotatedPillarBlock> blockRegistryObject, ResourceLocation side, ResourceLocation end) {
        axisBlock(blockRegistryObject.get(), side, end);
    }
}
