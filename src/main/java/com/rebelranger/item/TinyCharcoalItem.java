package com.rebelranger.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

public class TinyCharcoalItem  extends Item{

    public TinyCharcoalItem() {
        super(new Item.Properties().tab(CreativeModeTab.TAB_MATERIALS));
    }

    @Override
    public int getBurnTime(ItemStack itemStack, RecipeType<?> recipeType) {
        return 200;
    }

}
