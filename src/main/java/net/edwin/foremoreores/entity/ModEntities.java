package net.edwin.foremoreores.entity;

import net.edwin.foremoreores.ForeMoreOres;
import net.edwin.foremoreores.entity.custom.BaseballProjectile;
import net.edwin.foremoreores.entity.custom.DynamiteProjectile;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ForeMoreOres.MOD_ID);

    public static final RegistryObject<EntityType<BaseballProjectile>> BASEBALL_PROJECTILE =
            ENTITY_TYPES.register("baseball_projectile", () -> EntityType.Builder.<BaseballProjectile>of(BaseballProjectile::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).build("baseball_projectile"));

    public static final RegistryObject<EntityType<DynamiteProjectile>> DYNAMITE_PROJECTILE =
            ENTITY_TYPES.register("dynamite_projectile", () -> EntityType.Builder.<DynamiteProjectile>of(DynamiteProjectile::new, MobCategory.MISC)
                    .sized(0.5f, 0.5f).build("dynamite_projectile"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
