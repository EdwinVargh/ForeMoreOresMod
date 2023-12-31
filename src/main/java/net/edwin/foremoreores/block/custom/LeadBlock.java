package net.edwin.foremoreores.block.custom;

import net.edwin.foremoreores.item.ModItems;
import net.edwin.foremoreores.item.ModTags;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class LeadBlock extends Block {
    public LeadBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos blockPos, Player player,
                                 InteractionHand hand, BlockHitResult blockHitResult) {
        // Server: Main Hand & Off Hand
        // Client: Main Hand & Off Hand
        player.addEffect(new MobEffectInstance(MobEffects.POISON, 100));
        player.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100));
        return super.use(state, level, blockPos, player, hand, blockHitResult);
    }
    boolean damagedOnLead(ItemStack stack, LivingEntity wearer)
    {
        return (stack.isEmpty());
    }
    @Override
    public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
        if(entity instanceof LivingEntity livingEntity) {
                if (damagedOnLead(((LivingEntity)entity).getItemBySlot(EquipmentSlot.FEET),(LivingEntity) entity)) {
                    livingEntity.addEffect(new MobEffectInstance(MobEffects.POISON, 200));
                    livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 200));
                }
        }

        super.stepOn(level, pos, state, entity);
    }
}