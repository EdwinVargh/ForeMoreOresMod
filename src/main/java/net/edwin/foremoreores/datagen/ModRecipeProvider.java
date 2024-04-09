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
        oreBlasting(consumer, List.of(Items.IRON_INGOT), RecipeCategory.MISC,
                ModItems.STEEL_INGOT.get(), 0.7f, 150, "steel_blasting");

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
        nineBlockStorageRecipes(consumer, RecipeCategory.BUILDING_BLOCKS, ModItems.SULFUR.get(), RecipeCategory.MISC,
                ModBlocks.SULFUR_BLOCK.get());
        cannedFood(consumer,ModItems.SODA.get(),Items.SUGAR);
        cannedFood(consumer,ModItems.CANNED_APPLES.get(),Items.APPLE);
        cannedFood(consumer,ModItems.CANNED_BEEF.get(),Items.COOKED_BEEF);
        cannedFood(consumer,ModItems.CANNED_BERRIES.get(),Items.SWEET_BERRIES);
        cannedFood(consumer,ModItems.CANNED_BEETROOT_SOUP.get(),Items.BEETROOT_SOUP);
        cannedFood(consumer,ModItems.CANNED_BREAD.get(),Items.BREAD);
        cannedFood(consumer,ModItems.CANNED_CARROTS.get(),Items.CARROT);
        cannedFood(consumer,ModItems.CANNED_CHICKEN.get(),Items.COOKED_CHICKEN);
        cannedFood(consumer,ModItems.CANNED_CHORUS_FRUIT.get(),Items.CHORUS_FRUIT);
        cannedFood(consumer,ModItems.CANNED_COD.get(),Items.COOKED_COD);
        cannedFood(consumer,ModItems.CANNED_MELON.get(),Items.MELON);
        cannedFood(consumer,ModItems.CANNED_POTATOES.get(),Items.BAKED_POTATO);
        cannedFood(consumer,ModItems.CANNED_ROTTEN_FLESH.get(),Items.ROTTEN_FLESH);
        cannedFood(consumer,ModItems.CANNED_SALMON.get(),Items.COOKED_SALMON);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BASEBALL.get())
                .requires(Items.LEATHER)
                .requires(Items.WHITE_WOOL)
                .unlockedBy("has_leather", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModBlocks.STEEL_BEAM.get()).build()))
                .save(consumer);
        steelReinforcement(consumer,ModBlocks.STEEL_BRICKS.get(),Blocks.BRICKS);
        steelReinforcement(consumer,ModBlocks.STEEL_STONE_BRICKS.get(),Blocks.STONE_BRICKS);
        steelReinforcement(consumer,ModBlocks.STEEL_NETHER_BRICKS.get(),Blocks.NETHER_BRICKS);
        steelReinforcement(consumer,ModBlocks.STEEL_RED_NETHER_BRICKS.get(),Blocks.RED_NETHER_BRICKS);
        steelReinforcement(consumer,ModBlocks.STEEL_END_STONE_BRICKS.get(),Blocks.END_STONE_BRICKS);
        steelReinforcement(consumer,ModBlocks.STEEL_PURPUR.get(),Blocks.PURPUR_BLOCK);
        steelReinforcement(consumer,ModBlocks.STEEL_PURPUR_PILLAR.get(),Blocks.PURPUR_PILLAR);
        steelReinforcement(consumer,ModBlocks.STEEL_PRISMARINE_BRICKS.get(),Blocks.PRISMARINE_BRICKS);
        steelReinforcement(consumer,ModBlocks.STEEL_DARK_PRISMARINE.get(),Blocks.DARK_PRISMARINE);
        steelReinforcement(consumer,ModBlocks.STEEL_QUARTZ_BRICKS.get(),Blocks.QUARTZ_BRICKS);
        steelReinforcement(consumer,ModBlocks.STEEL_QUARTZ_PILLAR.get(),Blocks.QUARTZ_PILLAR);
        steelReinforcement(consumer,ModBlocks.STEEL_DEEPSLATE_BRICKS.get(),Blocks.DEEPSLATE_BRICKS);
        steelReinforcement(consumer,ModBlocks.STEEL_DEEPSLATE_TILES.get(),Blocks.DEEPSLATE_TILES);
        steelReinforcement(consumer,ModBlocks.STEEL_MUD_BRICKS.get(),Blocks.MUD_BRICKS);
        steelReinforcement(consumer,ModBlocks.STEEL_BLACKSTONE_BRICKS.get(),Blocks.POLISHED_BLACKSTONE_BRICKS);
        steelReinforcement(consumer,ModBlocks.STEEL_CUT_RED_SANDSTONE.get(),Blocks.CUT_RED_SANDSTONE);
        steelReinforcement(consumer,ModBlocks.STEEL_CUT_SANDSTONE.get(),Blocks.CUT_SANDSTONE);

        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.DYNAMITE.get())
                .define('S', ModItems.SULFUR.get())
                .define('P', Items.PAPER)
                .pattern("   ")
                .pattern(" P ")
                .pattern(" S ")
                .unlockedBy("has_sulfur", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SULFUR.get()).build()))
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
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BEAM.get())
                .define('S', ModItems.STEEL_INGOT.get())
                .pattern("SSS")
                .pattern(" S ")
                .pattern("SSS")
                .unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.STEEL_INGOT.get()).build()))
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
    protected static void steelReinforcement(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pResult, ItemLike pMaterial) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, pResult).requires(ModBlocks.STEEL_BEAM.get()).requires(pMaterial).unlockedBy(getHasName(ModBlocks.STEEL_BEAM.get()), has(ModBlocks.STEEL_BEAM.get())).save(pFinishedRecipeConsumer);
    }
    protected static void cannedFood(Consumer<FinishedRecipe> pFinishedRecipeConsumer, ItemLike pResult, ItemLike pMaterial) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, pResult).requires(ModItems.ALUMINUM_INGOT.get()).requires(pMaterial).unlockedBy(getHasName(ModItems.ALUMINUM_INGOT.get()), has(ModItems.ALUMINUM_INGOT.get())).save(pFinishedRecipeConsumer);
    }
}
