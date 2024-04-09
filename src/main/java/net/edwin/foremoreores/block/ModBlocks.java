package net.edwin.foremoreores.block;

import net.edwin.foremoreores.ForeMoreOres;
import net.edwin.foremoreores.block.custom.LeadBlock;
import net.edwin.foremoreores.block.custom.TungstenBlock;
import net.edwin.foremoreores.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ForeMoreOres.MOD_ID);

    public static final RegistryObject<Block> BAUXITE_BLOCK = registerBlock("bauxite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SULFUR_BLOCK = registerBlock("sulfur_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.SAND).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> JADE_BLOCK = registerBlock("jade_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            () -> new TungstenBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            () -> new LeadBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new LeadBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CUT_LEAD_BLOCK = registerBlock("cut_lead_block",
            () -> new LeadBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> REINFORCED_GLASS = registerBlock("reinforced_glass",
            () -> new GlassBlock(BlockBehaviour.Properties.copy(Blocks.GLASS).strength(2f).explosionResistance(1200)));
    public static final RegistryObject<Block> JADE_ORE = registerBlock("jade_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_ORE).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_JADE_ORE = registerBlock("deepslate_jade_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> BAUXITE_ORE = registerBlock("bauxite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_BAUXITE_ORE = registerBlock("deepslate_bauxite_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_IRON_ORE).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> GALENA = registerBlock("galena",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_GALENA = registerBlock("deepslate_galena",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> NETHER_GALENA = registerBlock("nether_galena",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TUNGSTEN_ORE = registerBlock("tungsten_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DIAMOND_ORE).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> DEEPSLATE_TUNGSTEN_ORE = registerBlock("deepslate_tungsten_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_DIAMOND_ORE).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> SULFUR_ORE = registerBlock("sulfur_ore",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> STEEL_BEAM = registerBlock("steel_beam", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> STEEL_BRICKS = registerBlock("steel_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.BRICKS).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> STEEL_STONE_BRICKS = registerBlock("steel_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> STEEL_NETHER_BRICKS = registerBlock("steel_nether_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> STEEL_RED_NETHER_BRICKS = registerBlock("steel_red_nether_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.RED_NETHER_BRICKS).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> STEEL_END_STONE_BRICKS = registerBlock("steel_end_stone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.END_STONE_BRICKS).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> STEEL_PURPUR = registerBlock("steel_purpur_block", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PURPUR_BLOCK).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<RotatedPillarBlock> STEEL_PURPUR_PILLAR = registerBlock("steel_purpur_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.PURPUR_PILLAR).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> STEEL_PRISMARINE_BRICKS = registerBlock("steel_prismarine_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.PRISMARINE_BRICKS).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> STEEL_DARK_PRISMARINE = registerBlock("steel_dark_prismarine", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> STEEL_QUARTZ_BRICKS = registerBlock("steel_quartz_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.QUARTZ_BRICKS).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<RotatedPillarBlock> STEEL_QUARTZ_PILLAR = registerBlock("steel_quartz_pillar", () -> new RotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_PILLAR).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> STEEL_DEEPSLATE_BRICKS = registerBlock("steel_deepslate_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> STEEL_DEEPSLATE_TILES = registerBlock("steel_deepslate_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_TILES).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> STEEL_MUD_BRICKS = registerBlock("steel_mud_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.MUD_BRICKS).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> STEEL_BLACKSTONE_BRICKS = registerBlock("steel_blackstone_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_BLACKSTONE_BRICKS).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> STEEL_CUT_SANDSTONE = registerBlock("steel_cut_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));
    public static final RegistryObject<Block> STEEL_CUT_RED_SANDSTONE = registerBlock("steel_cut_red_sandstone", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CUT_RED_SANDSTONE_SLAB).requiresCorrectToolForDrops().strength(50.0F, 1200.0F)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, Supplier<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
