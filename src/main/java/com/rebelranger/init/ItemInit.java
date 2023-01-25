package com.rebelranger.init;

import com.rebelranger.item.TinyCharcoalItem;
import com.rebelranger.item.TinyCoalItem;
import com.rebelranger.jasrecipes.JasRecipesMain;
import com.rebelranger.util.FlintToolTier;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, JasRecipesMain.MODID);

    public static final RegistryObject<Item> TINYCHARCOAL = ITEMS.register("tinycharcoal",
            () -> new TinyCharcoalItem());
    public static final RegistryObject<Item> TINYCOAL = ITEMS.register("tinycoal",
            () -> new TinyCoalItem());

    //TOOLS
    public static final RegistryObject<Item> FLINT_PICKAXE = ITEMS.register("flintpickaxe",
            () -> new PickaxeItem(FlintToolTier.FLINT_PICKAXE,1, -2.8F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> FLINT_AXE = ITEMS.register("flintaxe",
            () -> new AxeItem(FlintToolTier.FLINT_AXE,6, -3.2F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> FLINT_SHOVEL = ITEMS.register("flintshovel",
            () -> new ShovelItem(FlintToolTier.FLINT_SHOVEL,1, -3.0F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> FLINT_HOE = ITEMS.register("flinthoe",
            () -> new HoeItem(FlintToolTier.FLINT_HOE,0, -2.5F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));
    public static final RegistryObject<Item> FLINT_SWORD = ITEMS.register("flintsword",
            () -> new SwordItem(FlintToolTier.FLINT_SWORD,3, -2.4F, new Item.Properties().tab(CreativeModeTab.TAB_TOOLS)));

//    public static class JasRecipesCreativeTab extends CreativeModeTab {
//
//        private JasRecipesCreativeTab(int index, String label) {
//            super(index, label);
//        }
//
//        public static final JasRecipesCreativeTab instance = new JasRecipesCreativeTab(CreativeModeTab.TABS.length, "jasrecipes");
//
//        @Override
//        public ItemStack makeIcon() {
//            return new ItemStack(TINYCHARCOAL.get());
//        }
//    }
}
