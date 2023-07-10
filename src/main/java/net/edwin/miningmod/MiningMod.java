package net.edwin.miningmod;

import com.mojang.logging.LogUtils;
import net.edwin.miningmod.block.ModBlocks;
import net.edwin.miningmod.item.ModItems;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.edwin.miningmod.item.ModCreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MiningMod.MOD_ID)
public class MiningMod
{
    public static final String MOD_ID = "miningmod";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MiningMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTab() == ModCreativeModeTabs.TUTORIAL_TAB.get()) {
            event.accept(ModItems.LEAD);
            event.accept(ModItems.RAW_LEAD);
            event.accept(ModItems.ALUMINUM);
            event.accept(ModItems.BAUXITE);
            event.accept(ModItems.JADE);
            event.accept(ModItems.TUNGSTEN);
            event.accept(ModBlocks.DEEPSLATE_GALENA);
            event.accept(ModBlocks.NETHER_GALENA);
            event.accept(ModBlocks.GALENA);
            event.accept(ModBlocks.JADE_ORE);
            event.accept(ModBlocks.DEEPSLATE_JADE_ORE);
            event.accept(ModBlocks.TUNGSTEN_ORE);
            event.accept(ModBlocks.DEEPSLATE_TUNGSTEN_ORE);
            event.accept(ModBlocks.BAUXITE_ORE);
            event.accept(ModBlocks.DEEPSLATE_BAUXITE_ORE);
            event.accept(ModItems.JADE_AXE);
            event.accept(ModItems.JADE_HOE);
            event.accept(ModItems.JADE_SHOVEL);
            event.accept(ModItems.JADE_PICKAXE);
            event.accept(ModItems.TUNGSTEN_AXE);
            event.accept(ModItems.TUNGSTEN_HOE);
            event.accept(ModItems.TUNGSTEN_SHOVEL);
            event.accept(ModItems.TUNGSTEN_PICKAXE);
            event.accept(ModItems.JADE_SWORD);
            event.accept(ModItems.BASEBALL_BAT);
            event.accept(ModItems.JADE_HELMET);
            event.accept(ModItems.JADE_CHESTPLATE);
            event.accept(ModItems.JADE_LEGGINGS);
            event.accept(ModItems.JADE_BOOTS);
            event.accept(ModItems.TUNGSTEN_SWORD);
            event.accept(ModItems.TUNGSTEN_HELMET);
            event.accept(ModItems.TUNGSTEN_CHESTPLATE);
            event.accept(ModItems.TUNGSTEN_LEGGINGS);
            event.accept(ModItems.TUNGSTEN_BOOTS);
            event.accept(ModBlocks.CHISELED_LEAD_BLOCK);
            event.accept(ModItems.CANNED_APPLES);
            event.accept(ModItems.CANNED_BEEF);
            event.accept(ModItems.CANNED_BREAD);
            event.accept(ModItems.CANNED_MELON);
            event.accept(ModItems.CANNED_POTATOES);
            event.accept(ModItems.CANNED_COD);
            event.accept(ModItems.CANNED_SALMON);
            event.accept(ModItems.CANNED_ROTTEN_FLESH);
            event.accept(ModItems.SODA);
        }

        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.ALUMINUM);
            event.accept(ModItems.BAUXITE);
            event.accept(ModItems.RAW_LEAD);
            event.accept(ModItems.LEAD);
            event.accept(ModItems.JADE);
            event.accept(ModItems.TUNGSTEN);
            event.accept(ModBlocks.REINFORCED_GLASS);
        }

        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.BAUXITE_BLOCK);
            event.accept(ModBlocks.ALUMINUM_BLOCK);
            event.accept(ModBlocks.JADE_BLOCK);
            event.accept(ModBlocks.LEAD_BLOCK);
            event.accept(ModBlocks.RAW_LEAD_BLOCK);
            event.accept(ModBlocks.TUNGSTEN_BLOCK);
            event.accept(ModBlocks.CHISELED_LEAD_BLOCK);
            event.accept(ModBlocks.REINFORCED_GLASS);
        }
        if(event.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
            event.accept(ModItems.JADE_AXE);
            event.accept(ModItems.JADE_HOE);
            event.accept(ModItems.JADE_SHOVEL);
            event.accept(ModItems.JADE_PICKAXE);
            event.accept(ModItems.TUNGSTEN_AXE);
            event.accept(ModItems.TUNGSTEN_HOE);
            event.accept(ModItems.TUNGSTEN_SHOVEL);
            event.accept(ModItems.TUNGSTEN_PICKAXE);
        }
        if(event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.JADE_SWORD);
            event.accept(ModItems.JADE_HELMET);
            event.accept(ModItems.JADE_CHESTPLATE);
            event.accept(ModItems.JADE_LEGGINGS);
            event.accept(ModItems.JADE_BOOTS);
            event.accept(ModItems.TUNGSTEN_SWORD);
            event.accept(ModItems.TUNGSTEN_HELMET);
            event.accept(ModItems.TUNGSTEN_CHESTPLATE);
            event.accept(ModItems.TUNGSTEN_LEGGINGS);
            event.accept(ModItems.TUNGSTEN_BOOTS);
            event.accept(ModItems.BASEBALL_BAT);
        }
        if(event.getTabKey() == CreativeModeTabs.FOOD_AND_DRINKS) {
            event.accept(ModItems.CANNED_APPLES);
            event.accept(ModItems.CANNED_BEEF);
            event.accept(ModItems.CANNED_BREAD);
            event.accept(ModItems.CANNED_MELON);
            event.accept(ModItems.CANNED_POTATOES);
            event.accept(ModItems.CANNED_COD);
            event.accept(ModItems.CANNED_SALMON);
            event.accept(ModItems.CANNED_ROTTEN_FLESH);
            event.accept(ModItems.SODA);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
        LOGGER.info("HELLO from server starting");
    }
    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.REINFORCED_GLASS.get(), RenderType.cutout());
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {

        }
    }
}
