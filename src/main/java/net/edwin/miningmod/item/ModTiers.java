package net.edwin.miningmod.item;

import net.edwin.miningmod.MiningMod;
import net.edwin.miningmod.block.ModBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModTiers {
    public static final Tier JADE = TierSortingRegistry.registerTier
            (new ForgeTier(5, 750,6.0f,2f,18,
                            ModTags.Blocks.NEEDS_JADE_TOOL, () -> Ingredient.of(ModItems.JADE.get())),
            new ResourceLocation(MiningMod.MOD_ID, "jade"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

    public static final Tier ALUMINUM = new ForgeTier(3, 250,10.0f,1f,0,
                            BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.of(ModItems.ALUMINUM.get()));

    public static final Tier TUNGSTEN = TierSortingRegistry.registerTier
            (new ForgeTier(6, 1421,7.0f,3f,15,
                            ModTags.Blocks.NEEDS_TUNGSTEN_TOOL, () -> Ingredient.of(ModItems.TUNGSTEN.get())),
                    new ResourceLocation(MiningMod.MOD_ID,"tungsten"), List.of(ModTiers.JADE), List.of(Tiers.DIAMOND));

}
