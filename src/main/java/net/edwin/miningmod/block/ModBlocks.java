package net.edwin.miningmod.block;

import net.edwin.miningmod.MiningMod;
import net.edwin.miningmod.block.custom.LeadBlock;
import net.edwin.miningmod.block.custom.TungstenBlock;
import net.edwin.miningmod.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
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
            DeferredRegister.create(ForgeRegistries.BLOCKS, MiningMod.MOD_ID);

    public static final RegistryObject<Block> BAUXITE_BLOCK = registerBlock("bauxite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> ALUMINUM_BLOCK = registerBlock("aluminum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> JADE_BLOCK = registerBlock("jade_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> TUNGSTEN_BLOCK = registerBlock("tungsten_block",
            () -> new TungstenBlock(BlockBehaviour.Properties.copy(Blocks.DIAMOND_BLOCK).strength(3f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> RAW_LEAD_BLOCK = registerBlock("raw_lead_block",
            () -> new LeadBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new LeadBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_LEAD_BLOCK = registerBlock("chiseled_lead_block",
            () -> new LeadBlock(BlockBehaviour.Properties.copy(Blocks.STONE).strength(2f).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CHISELED_ALUMINUM_BLOCK = registerBlock("chiseled_aluminum_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).strength(2f).requiresCorrectToolForDrops()));
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
    public static class Tags {
        public static final TagKey<Block> NEEDS_JADE_TOOL = tag("needs_jade_tool");
        public static final TagKey<Block> NEEDS_TUNGSTEN_TOOL = tag("needs_tungsten_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MiningMod.MOD_ID,name));
    }
    }
}
