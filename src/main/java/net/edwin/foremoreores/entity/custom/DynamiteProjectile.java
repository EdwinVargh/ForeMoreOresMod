package net.edwin.foremoreores.entity.custom;

import net.edwin.foremoreores.entity.ModEntities;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.projectile.ThrowableItemProjectile;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.TntBlock;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.level.Level;

public class DynamiteProjectile extends ThrowableItemProjectile{
    public DynamiteProjectile(EntityType<? extends ThrowableItemProjectile> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    public DynamiteProjectile(Level pLevel) {
        super(ModEntities.DYNAMITE_PROJECTILE.get(), pLevel);
    }

    public DynamiteProjectile(Level pLevel, LivingEntity livingEntity) {
        super(ModEntities.DYNAMITE_PROJECTILE.get(), livingEntity, pLevel);
    }
    @Override
    protected Item getDefaultItem() {
        return null;
    }

    @Override
    protected void onHitBlock(BlockHitResult pResult) {
        if(!this.level().isClientSide()) {
            this.level().broadcastEntityEvent(this, ((byte) 3));
            this.level().explode(this.getOwner(), this.getX(), this.getY(), this.getZ(), 4,false, Level.ExplosionInteraction.TNT);
        }
        this.discard();
    }
}

