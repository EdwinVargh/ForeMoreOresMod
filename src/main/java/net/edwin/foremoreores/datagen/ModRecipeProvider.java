package net.edwin.foremoreores.datagen;


import net.edwin.foremoreores.ForeMoreOres;
import net.edwin.foremoreores.block.ModBlocks;
import net.edwin.foremoreores.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        oreSmelting(consumer, List.of(ModItems.RAW_GALENA.get()), RecipeCategory.MISC,
                ModItems.LEAD_INGOT.get(), 0.7f, 200, "lead_smelting");
        oreSmelting(consumer, List.of(ModItems.BAUXITE.get()), RecipeCategory.MISC,
                ModItems.ALUMINUM_INGOT.get(), 0.7f, 200, "aluminum_smelting");
        oreBlasting(consumer, List.of(ModItems.RAW_GALENA.get()), RecipeCategory.MISC,
                ModItems.LEAD_INGOT.get(), 0.7f, 100, "lead_blasting");
        oreBlasting(consumer, List.of(ModItems.BAUXITE.get()), RecipeCategory.MISC,
                ModItems.ALUMINUM_INGOT.get(), 0.7f, 100, "aluminum_blasting");

        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.JADE.get(), RecipeCategory.MISC,
                ModBlocks.JADE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.LEAD_INGOT.get(), RecipeCategory.MISC,
                ModBlocks.LEAD_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.BAUXITE.get(), RecipeCategory.MISC,
                ModBlocks.BAUXITE_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.ALUMINUM_INGOT.get(), RecipeCategory.MISC,
                ModBlocks.ALUMINUM_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.RAW_GALENA.get(), RecipeCategory.MISC,
                ModBlocks.RAW_LEAD_BLOCK.get());
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.TUNGSTEN.get(), RecipeCategory.MISC,
                ModBlocks.TUNGSTEN_BLOCK.get());
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.SODA.get())
               .requires(ModItems.ALUMINUM_INGOT.get())
                .requires(Items.SUGAR)
                .unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_BEEF.get())
                .requires(ModItems.ALUMINUM_INGOT.get())
                .requires(Items.COOKED_BEEF)
                .unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_BERRIES.get())
                .requires(ModItems.ALUMINUM_INGOT.get())
                .requires(Items.SWEET_BERRIES)
                .unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_BEETROOT_SOUP.get())
                .requires(ModItems.ALUMINUM_INGOT.get())
                .requires(Items.BEETROOT_SOUP)
                .unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_BREAD.get())
                .requires(ModItems.ALUMINUM_INGOT.get())
                .requires(Items.BREAD)
                .unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_CARROTS.get())
                .requires(ModItems.ALUMINUM_INGOT.get())
                .requires(Items.CARROT)
                .unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_CHICKEN.get())
                .requires(ModItems.ALUMINUM_INGOT.get())
                .requires(Items.COOKED_CHICKEN)
                .unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_CHORUS_FRUIT.get())
                .requires(ModItems.ALUMINUM_INGOT.get())
                .requires(Items.CHORUS_FRUIT)
                .unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_APPLES.get())
                .requires(ModItems.ALUMINUM_INGOT.get())
                .requires(Items.APPLE)
                .unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_POTATOES.get())
                .requires(ModItems.ALUMINUM_INGOT.get())
                .requires(Items.BAKED_POTATO)
                .unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_COD.get())
                .requires(ModItems.ALUMINUM_INGOT.get())
                .requires(Items.COOKED_COD)
                .unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_SALMON.get())
                .requires(ModItems.ALUMINUM_INGOT.get())
                .requires(Items.COOKED_SALMON)
                .unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_MELON.get())
                .requires(ModItems.ALUMINUM_INGOT.get())
                .requires(Items.MELON)
                .unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, ModItems.CANNED_ROTTEN_FLESH.get())
                .requires(ModItems.ALUMINUM_INGOT.get())
                .requires(Items.ROTTEN_FLESH)
                .unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(consumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_PICKAXE.get())
                 .define('J', ModItems.JADE.get())
                 .define('I', Items.STICK)
                 .pattern("JJJ")
                 .pattern(" I ")
                 .pattern(" I ")
                 .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                         .of(ModItems.JADE.get()).build()))
                 .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.JADE_SWORD.get())
                .define('J', ModItems.JADE.get())
                .define('I', Items.STICK)
                .pattern(" J ")
                .pattern(" J ")
                .pattern(" I ")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_SHOVEL.get())
                .define('J', ModItems.JADE.get())
                .define('I', Items.STICK)
                .pattern(" J ")
                .pattern(" I ")
                .pattern(" I ")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_HOE.get())
                .define('J', ModItems.JADE.get())
                .define('I', Items.STICK)
                .pattern("JJ ")
                .pattern(" I ")
                .pattern(" I ")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.JADE_AXE.get())
                .define('J', ModItems.JADE.get())
                .define('I', Items.STICK)
                .pattern("JJ ")
                .pattern("JI ")
                .pattern(" I ")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.JADE_HELMET.get())
                .define('J', ModItems.JADE.get())
                .pattern("JJJ")
                .pattern("J J")
                .pattern("   ")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.JADE_CHESTPLATE.get())
                .define('J', ModItems.JADE.get())
                .pattern("J J")
                .pattern("JJJ")
                .pattern("JJJ")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.JADE_LEGGINGS.get())
                .define('J', ModItems.JADE.get())
                .pattern("JJJ")
                .pattern("J J")
                .pattern("J J")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.JADE_BOOTS.get())
                .define('J', ModItems.JADE.get())
                .pattern("   ")
                .pattern("J J")
                .pattern("J J")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.JADE.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.BASEBALL_BAT.get())
                .define('J', ModItems.ALUMINUM_INGOT.get())
                .define('I', Items.STICK)
                .pattern(" J ")
                .pattern(" J ")
                .pattern(" I ")
                .unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.ALUMINUM_INGOT.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TUNGSTEN_PICKAXE.get())
                .define('J', ModItems.TUNGSTEN.get())
                .define('I', Items.STICK)
                .pattern("JJJ")
                .pattern(" I ")
                .pattern(" I ")
                .unlockedBy("has_tungsten", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TUNGSTEN.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_SWORD.get())
                .define('J', ModItems.TUNGSTEN.get())
                .define('I', Items.STICK)
                .pattern(" J ")
                .pattern(" J ")
                .pattern(" I ")
                .unlockedBy("has_tungsten", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TUNGSTEN.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TUNGSTEN_SHOVEL.get())
                .define('J', ModItems.TUNGSTEN.get())
                .define('I', Items.STICK)
                .pattern(" J ")
                .pattern(" I ")
                .pattern(" I ")
                .unlockedBy("has_tungsten", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TUNGSTEN.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TUNGSTEN_HOE.get())
                .define('J', ModItems.TUNGSTEN.get())
                .define('I', Items.STICK)
                .pattern("JJ ")
                .pattern(" I ")
                .pattern(" I ")
                .unlockedBy("has_tungsten", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TUNGSTEN.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.TUNGSTEN_AXE.get())
                .define('J', ModItems.TUNGSTEN.get())
                .define('I', Items.STICK)
                .pattern("JJ ")
                .pattern("JI ")
                .pattern(" I ")
                .unlockedBy("has_tungsten", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TUNGSTEN.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_HELMET.get())
                .define('J', ModItems.TUNGSTEN.get())
                .pattern("JJJ")
                .pattern("J J")
                .pattern("   ")
                .unlockedBy("has_tungsten", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TUNGSTEN.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_CHESTPLATE.get())
                .define('J', ModItems.TUNGSTEN.get())
                .pattern("J J")
                .pattern("JJJ")
                .pattern("JJJ")
                .unlockedBy("has_jade", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TUNGSTEN.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_LEGGINGS.get())
                .define('J', ModItems.TUNGSTEN.get())
                .pattern("JJJ")
                .pattern("J J")
                .pattern("J J")
                .unlockedBy("has_tungsten", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TUNGSTEN.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.COMBAT, ModItems.TUNGSTEN_BOOTS.get())
                .define('J', ModItems.TUNGSTEN.get())
                .pattern("   ")
                .pattern("J J")
                .pattern("J J")
                .unlockedBy("has_tungsten", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.TUNGSTEN.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.REINFORCED_GLASS.get())
                .define('L', ModItems.LEAD_INGOT.get())
                .define('G', Blocks.GLASS)
                .pattern(" L ")
                .pattern("LGL")
                .pattern(" L ")
                .unlockedBy("has_lead", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEAD_INGOT.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_LEAD_BLOCK.get())
                .define('L', ModBlocks.LEAD_BLOCK.get())
                .pattern("LL")
                .pattern("LL")
                .unlockedBy("has_lead", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LEAD_INGOT.get()).build()))
                .save(consumer);

    }
    protected static void oreSmelting(Consumer<FinishedRecipe> p_250654_, List<ItemLike> p_250172_, RecipeCategory p_250588_, ItemLike p_251868_, float p_250789_, int p_252144_, String p_251687_) {
        oreCooking(p_250654_, RecipeSerializer.SMELTING_RECIPE, p_250172_, p_250588_, p_251868_, p_250789_, p_252144_, p_251687_, "_from_smelting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> p_250791_, RecipeSerializer<? extends AbstractCookingRecipe> p_251817_, List<ItemLike> p_249619_, RecipeCategory p_251154_, ItemLike p_250066_, float p_251871_, int p_251316_, String p_251450_, String p_249236_) {
        for(ItemLike itemlike : p_249619_) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), p_251154_, p_250066_, p_251871_, p_251316_, p_251817_).group(p_251450_)
                    .unlockedBy(getHasName(itemlike), has(itemlike)).save(p_250791_, new ResourceLocation(ForeMoreOres.MOD_ID, getItemName(p_250066_)) + p_249236_ + "_" + getItemName(itemlike));
        }
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_249580_, RecipeCategory p_251203_, ItemLike p_251689_, RecipeCategory p_251376_, ItemLike p_248771_) {
        nineBlockStorageRecipes(p_249580_, p_251203_, p_251689_, p_251376_, p_248771_, getSimpleRecipeName(p_248771_), (String)null, getSimpleRecipeName(p_251689_), (String)null);
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> p_250423_, RecipeCategory p_250083_, ItemLike p_250042_,
                                                  RecipeCategory p_248977_, ItemLike p_251911_, String p_250475_, @Nullable String p_248641_,
                                                  String p_252237_, @Nullable String p_250414_) {
        ShapelessRecipeBuilder.shapeless(p_250083_, p_250042_, 9).requires(p_251911_).group(p_250414_).unlockedBy(getHasName(p_251911_), has(p_251911_))
                .save(p_250423_, new ResourceLocation(ForeMoreOres.MOD_ID, p_252237_));
        ShapedRecipeBuilder.shaped(p_248977_, p_251911_).define('#', p_250042_).pattern("###").pattern("###").pattern("###").group(p_248641_)
                .unlockedBy(getHasName(p_250042_), has(p_250042_)).save(p_250423_, new ResourceLocation(ForeMoreOres.MOD_ID, p_250475_));
    }

    protected static void chiseled(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pChiseledResult, ItemLike pMaterial) {
        chiseledBuilder(pCategory, pChiseledResult, Ingredient.of(pMaterial)).unlockedBy(getHasName(pMaterial), has(pMaterial)).save(pFinishedRecipeConsumer);
    }
    protected static ShapedRecipeBuilder chiseledBuilder(RecipeCategory pCategory, ItemLike pChiseledResult, Ingredient pMaterial) {
        return ShapedRecipeBuilder.shaped(pCategory, pChiseledResult).define('#', pMaterial).pattern("#").pattern("#");
    }
    protected static void stonecutterResultFromBase(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pResult, ItemLike pMaterial, int pResultCount) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(pMaterial), pCategory, pResult, pResultCount).unlockedBy(getHasName(pMaterial), has(pMaterial)).save(pFinishedRecipeConsumer, getConversionRecipeName(pResult, pMaterial) + "_stonecutting");
    }
}
