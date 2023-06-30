package net.edwin.miningmod.item;

import net.edwin.miningmod.block.ModBlocks;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

import static net.edwin.miningmod.block.ModBlocks.Tags.NEEDS_JADE_TOOL;
import static net.minecraft.tags.BlockTags.NEEDS_IRON_TOOL;

public class ModTiers {
    public static final ForgeTier JADE = new ForgeTier(2, 750,6.0f,2f
    ,18, NEEDS_JADE_TOOL, () -> Ingredient.of(ModItems.JADE.get()));

    public static final ForgeTier ALUMINUM = new ForgeTier(2, 250,10.0f,1f
    ,0, NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.ALUMINUM.get()));

    public static final ForgeTier TUNGSTEN = new ForgeTier(3, 1421,7.0f,3f
            ,15, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.of(ModItems.TUNGSTEN.get()));

}
