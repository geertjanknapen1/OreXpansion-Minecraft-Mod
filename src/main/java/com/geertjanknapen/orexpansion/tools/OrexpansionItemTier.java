package com.geertjanknapen.orexpansion.tools;

import com.geertjanknapen.orexpansion.util.ToolRegistryHandler;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum OrexpansionItemTier implements IItemTier {

    SILVER(3, 800, 7.0F, 1.5F, 17, () -> {
        return Ingredient.fromItems(ToolRegistryHandler.SILVER_SWORD.get());
    }),

    STEEL(3, 900, 7.5F, 1.0F, 18, () -> {
        return Ingredient.fromItems(ToolRegistryHandler.SILVER_SWORD.get());
    }),

    COPPER(3, 850, 7.0F, 1.5F, 17, () -> {
        return Ingredient.fromItems(ToolRegistryHandler.COPPER_SWORD.get());
    });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    OrexpansionItemTier(int harvestLevel, int maxUses, float efficiency, float attackDamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}
