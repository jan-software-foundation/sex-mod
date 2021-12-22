package com.janderedev.sexmod.items;

import com.janderedev.sexmod.init.RegistryHandler;

import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class CBTDevice extends ItemBase {
    public CBTDevice() {
        super("cbt_device", new Item.Properties()
                .durability(1)
                .tab(ItemGroup.TAB_TOOLS));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        super.appendHoverText(stack, world, tooltip, flag);
        tooltip.add(new TranslationTextComponent("tooltip.sexmod.cbt_device"));
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity player) {
        target.hurt(new DamageSource("cbt"), 69f);
        stack.hurtAndBreak(1, player, (entity) -> {});

        player.getCommandSenderWorld().playSound(null, player.blockPosition(),
            RegistryHandler.SOUND_CBT, SoundCategory.PLAYERS, 1.0f, 1.0f);
        return true;
    }
    
    @Override
    public boolean canAttackBlock(BlockState state, World world, BlockPos blockPos, PlayerEntity player) {
        return !player.isCreative();
     }
}
