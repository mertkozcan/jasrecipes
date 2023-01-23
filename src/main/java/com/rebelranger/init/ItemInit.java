package com.rebelranger.init;

import com.rebelranger.item.TinyCharcoalItem;
import com.rebelranger.item.TinyCoalItem;
import com.rebelranger.jasrecipes.JasRecipesMain;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
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
