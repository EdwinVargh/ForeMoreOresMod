package net.edwin.foremoreores.item;

import net.edwin.foremoreores.ForeMoreOres;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = ForeMoreOres.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,ForeMoreOres.MOD_ID);
    public static RegistryObject<CreativeModeTab> MINING_TAB = CREATIVE_MODE_TABS.register("mining_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BAUXITE.get())).title(Component.literal("Tutorial Tab")).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
