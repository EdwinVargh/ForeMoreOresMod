package net.edwin.miningmod.item.custom;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.UseAnim;

public class SodaDrink extends Item {
    public SodaDrink(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public UseAnim getUseAnimation(ItemStack pStack) {
        return super.getUseAnimation(new ItemStack(Items.HONEY_BOTTLE));
    }

    @Override
    public SoundEvent getDrinkingSound() {
        return super.getDrinkingSound();
    }
}
