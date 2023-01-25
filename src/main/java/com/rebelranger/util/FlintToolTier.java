package com.rebelranger.util;

import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum FlintToolTier implements Tier {
    FLINT_PICKAXE(1, 100, 2.5F, 0.5F, 1, () -> {
        return Ingredient.of(Items.FLINT);
    }),
    FLINT_AXE(1, 100, 2.5F, 1.0F, 1, () -> {
        return Ingredient.of(Items.FLINT);
    }),
    FLINT_SHOVEL(1, 100, 2.5F, 1.0F, 1, () -> {
        return Ingredient.of(Items.FLINT);
    }),
    FLINT_HOE(1, 100, 2.5F, 0.0F, 1, () -> {
        return Ingredient.of(Items.FLINT);
    }),
    FLINT_SWORD(1, 100, 2.5F, 0.5F, 1, () -> {
        return Ingredient.of(Items.FLINT);
    });


    private final int level;
    private final int uses;
    private final float speed;
    private final float damage;
    private final int enchantmentValue;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    FlintToolTier(int level, int durability, float miningSpeed, float damage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.level = level;
        this.uses = durability;
        this.speed = miningSpeed;
        this.damage = damage;
        this.enchantmentValue = enchantability;
        this.repairIngredient = new LazyLoadedValue<>(repairIngredient);
    }

    public int getUses() {
        return this.uses;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getAttackDamageBonus() {
        return this.damage;
    }

    public int getLevel() {
        return this.level;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
