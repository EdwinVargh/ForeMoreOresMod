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
                ModItems.STEEL_INGOT.get(), 0.7f, 150, "aluminum_blasting");

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
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STEEL_BEAM.get())
                .define('S', ModItems.STEEL_INGOT.get())
                .pattern("SSS")
                .pattern(" S ")
                .pattern("SSS")
                .unlockedBy("has_steel-ingot", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.STEEL_INGOT.get()).build()))
                .save(consumer);
        steelBlock(consumer,Blocks.BRICKS,ModBlocks.STEEL_BRICKS.get());
        steelBlock(consumer,Blocks.DEEPSLATE_BRICKS,ModBlocks.STEEL_DEEPSLATE_BRICKS.get());
        steelBlock(consumer,Blocks.DEEPSLATE_TILES,ModBlocks.STEEL_DEEPSLATE_TILES.get());
        steelBlock(consumer,Blocks.STONE_BRICKS,ModBlocks.STEEL_STONE_BRICKS.get());
        steelBlock(consumer,Blocks.MUD_BRICKS,ModBlocks.STEEL_MUD_BRICKS.get());
        steelBlock(consumer,Blocks.NETHER_BRICKS,ModBlocks.STEEL_NETHER_BRICKS.get());
        steelBlock(consumer,Blocks.RED_NETHER_BRICKS,ModBlocks.STEEL_RED_NETHER_BRICKS.get());
        steelBlock(consumer,Blocks.END_STONE_BRICKS,ModBlocks.STEEL_END_STONE_BRICKS.get());
        steelBlock(consumer,Blocks.PURPUR_BLOCK,ModBlocks.STEEL_PURPUR_BLOCK.get());
        steelBlock(consumer,Blocks.PURPUR_PILLAR,ModBlocks.STEEL_PURPUR_PILLAR.get());
        steelBlock(consumer,Blocks.PRISMARINE_BRICKS,ModBlocks.STEEL_PRISMARINE_BRICKS.get());
        steelBlock(consumer,Blocks.DARK_PRISMARINE,ModBlocks.STEEL_DARK_PRISMARINE.get());
        steelBlock(consumer,Blocks.CUT_SANDSTONE,ModBlocks.STEEL_CUT_SANDSTONE.get());
        steelBlock(consumer,Blocks.CUT_RED_SANDSTONE,ModBlocks.STEEL_CUT_RED_SANDSTONE.get());
        steelBlock(consumer,Blocks.QUARTZ_BRICKS,ModBlocks.STEEL_QUARTZ_BRICKS.get());
        steelBlock(consumer,Blocks.POLISHED_BLACKSTONE_BRICKS,ModBlocks.STEEL_BLACKSTONE_BRICKS.get());
        cannedFood(consumer,Items.SUGAR,ModItems.SODA.get());
        cannedFood(consumer,Items.BEEF,ModItems.CANNED_BEEF.get());
        cannedFood(consumer,Items.SWEET_BERRIES,ModItems.CANNED_BERRIES.get());
        cannedFood(consumer,Items.BEETROOT_SOUP,ModItems.CANNED_BEETROOT_SOUP.get());
        cannedFood(consumer,Items.BREAD,ModItems.CANNED_BREAD.get());
        cannedFood(consumer,Items.CARROT,ModItems.CANNED_CARROTS.get());
        cannedFood(consumer,Items.COOKED_CHICKEN,ModItems.CANNED_CHICKEN.get());
        cannedFood(consumer,Items.CHORUS_FRUIT,ModItems.CANNED_CHORUS_FRUIT.get());
        cannedFood(consumer,Items.APPLE,ModItems.CANNED_APPLES.get());
        cannedFood(consumer,Items.BAKED_POTATO,ModItems.CANNED_POTATOES.get());
        cannedFood(consumer,Items.COOKED_COD,ModItems.CANNED_COD.get());
        cannedFood(consumer,Items.COOKED_SALMON,ModItems.CANNED_SALMON.get());
        cannedFood(consumer,Items.MELON,ModItems.CANNED_MELON.get());
        cannedFood(consumer,Items.ROTTEN_FLESH,ModItems.CANNED_ROTTEN_FLESH.get());
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.BASEBALL.get())
                .requires(Items.LEATHER)
                .requires(Items.WHITE_WOOL)
                .unlockedBy("has_leather", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(Items.LEATHER).build()))
                .save(consumer);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.FERTILIZER.get())
                .requires(ModItems.SULFUR.get())
                .requires(Items.BONE_MEAL)
                .unlockedBy("has_sulfur", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.SULFUR.get()).build()))
                .save(consumer);
        ShapedRecipeBuilder.shaped(RecipeCategory.TOOLS, ModItems.DYNAMITE.get(),3)
                .define('S', ModItems.SULFUR.get())
                .define('P', Items.PAPER)
                .pattern("   ")
                .pattern("PPP")
                .pattern("SSS")
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

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pConsumer, RecipeCategory pBlockCategory, ItemLike pIngredient, RecipeCategory pItemCategory, ItemLike pResult) {
        nineBlockStorageRecipes(pConsumer, pBlockCategory, pIngredient, pItemCategory, pResult, getSimpleRecipeName(pResult), (String)null, getSimpleRecipeName(pIngredient), (String)null);
    }

    protected static void nineBlockStorageRecipes(Consumer<FinishedRecipe> pConsumer, RecipeCategory pBlockCategory, ItemLike pIngredient,
                                                  RecipeCategory pItemCategory, ItemLike pResult, String pBlockRecipe, @Nullable String p_248641_,
                                                  String pItemRecipe, @Nullable String p_250414_) {
        ShapelessRecipeBuilder.shapeless(pBlockCategory, pIngredient, 9).requires(pResult).group(p_250414_).unlockedBy(getHasName(pResult), has(pResult))
                .save(pConsumer, new ResourceLocation(ForeMoreOres.MOD_ID, pItemRecipe));
        ShapedRecipeBuilder.shaped(pItemCategory, pResult).define('#', pIngredient).pattern("###").pattern("###").pattern("###").group(p_248641_)
                .unlockedBy(getHasName(pIngredient), has(pIngredient)).save(pConsumer, new ResourceLocation(ForeMoreOres.MOD_ID, pBlockRecipe));
    }

    protected static void stonecutterResultFromBase(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeCategory pCategory, ItemLike pResult, ItemLike pMaterial, int pResultCount) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(pMaterial), pCategory, pResult, pResultCount).unlockedBy(getHasName(pMaterial), has(pMaterial)).save(pFinishedRecipeConsumer, getConversionRecipeName(pResult, pMaterial) + "_stonecutting");
    }
    protected static void cannedFood(Consumer<FinishedRecipe> pConsumer, ItemLike pIngredient, ItemLike pResult) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.FOOD, pResult).requires(pIngredient).requires(ModItems.ALUMINUM_INGOT.get()).group((String)null).unlockedBy("has_aluminum", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModItems.ALUMINUM_INGOT.get()).build())).save(pConsumer, new ResourceLocation(ForeMoreOres.MOD_ID, getSimpleRecipeName(pResult)));
    }
    protected static void steelBlock(Consumer<FinishedRecipe> pConsumer, ItemLike pIngredient, ItemLike pResult) {
        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pResult).define('#',pIngredient).define('S',ModItems.STEEL_INGOT.get()).pattern(" S ").pattern("S#S").pattern(" S ").group((String)null).unlockedBy("has_steel", inventoryTrigger(ItemPredicate.Builder.item()
                .of(ModItems.STEEL_INGOT.get()).build())).save(pConsumer, new ResourceLocation(ForeMoreOres.MOD_ID, getSimpleRecipeName(pResult)));
    }
}
