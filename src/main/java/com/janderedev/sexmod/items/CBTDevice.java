package com.janderedev.sexmod.items;

import com.janderedev.sexmod.SexMod;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
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
    public void appendHoverText(ItemStack p_77624_1_, @Nullable World p_77624_2_, List<ITextComponent> tooltip, ITooltipFlag p_77624_4_) {
        super.appendHoverText(p_77624_1_, p_77624_2_, tooltip, p_77624_4_);
        tooltip.add(new TranslationTextComponent("tooltip.sexmod.cbt_device"));
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity player) {
        target.hurt(new DamageSource("cbt"), 69f);

        stack.setCount(0);

        player.getCommandSenderWorld().playSound(null, player.blockPosition(), new SoundEvent(
                new ResourceLocation(SexMod.MODID, "cbt")
        ), SoundCategory.PLAYERS, 1.0f, 1.0f);
        return false;
    }
}
