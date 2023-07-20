package net.edwin.miningmod.item;

import net.edwin.miningmod.MiningMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_JADE_TOOL = tag("needs_jade_tool");
        public static final TagKey<Block> NEEDS_TUNGSTEN_TOOL = tag("needs_tungsten_tool");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(MiningMod.MOD_ID,name));
        }
    }
}
