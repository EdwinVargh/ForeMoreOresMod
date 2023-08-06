package net.edwin.miningmod.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.core.Direction;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingKnockBackEvent;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static java.lang.Math.*;

public class BaseballBat extends SwordItem {
    public BaseballBat(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        double dx = (double)(pAttacker.getLookAngle().x);
        double dz = (double)(pAttacker.getLookAngle().z);
        pTarget.knockback(15,-0.75*dx, -0.75*dz);
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}
