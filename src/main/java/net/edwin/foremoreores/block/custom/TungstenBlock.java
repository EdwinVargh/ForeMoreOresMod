package net.edwin.foremoreores.block.custom;

import net.minecraft.world.entity.item.FallingBlockEntity;
import net.minecraft.world.level.block.FallingBlock;

public class TungstenBlock extends FallingBlock {
    public TungstenBlock(Properties pProperties) {
        super(pProperties);
    }
    protected void falling(FallingBlockEntity p_48779_) {
        p_48779_.setHurtsEntities(2.0F, 25);
    }
}
