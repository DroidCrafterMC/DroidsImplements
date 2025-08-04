package net.droidcrafter23.droidsimplements;

import net.droidcrafter23.droidsimplements.items.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, DroidsImplements.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MOD_CREATIVE_TAB = CREATIVE_MODE_TABS.register("mod_creative_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIAMOND_DAGGER.get()))
                    .title(Component.translatable("creativetab.droidsimplements.mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.WOOD_DAGGER.get());
                        output.accept(ModItems.GOLD_DAGGER.get());
                        output.accept(ModItems.STONE_DAGGER.get());
                        output.accept(ModItems.IRON_DAGGER.get());
                        output.accept(ModItems.DIAMOND_DAGGER.get());
                        output.accept(ModItems.NETHERITE_DAGGER.get());

                        output.accept(ModItems.WOOD_WARHAMMER.get());
                        output.accept(ModItems.GOLD_WARHAMMER.get());
                        output.accept(ModItems.STONE_WARHAMMER.get());
                        output.accept(ModItems.IRON_WARHAMMER.get());
                        output.accept(ModItems.DIAMOND_WARHAMMER.get());
                        output.accept(ModItems.NETHERITE_WARHAMMER.get());

                        output.accept(ModItems.WOOD_CLUB.get());
                        output.accept(ModItems.GOLD_CLUB.get());
                        output.accept(ModItems.STONE_CLUB.get());
                        output.accept(ModItems.IRON_CLUB.get());
                        output.accept(ModItems.DIAMOND_CLUB.get());
                        output.accept(ModItems.NETHERITE_CLUB.get());

                        output.accept(ModItems.WOOD_SPEAR.get());
                        output.accept(ModItems.GOLD_SPEAR.get());
                        output.accept(ModItems.STONE_SPEAR.get());
                        output.accept(ModItems.IRON_SPEAR.get());
                        output.accept(ModItems.DIAMOND_SPEAR.get());
                        output.accept(ModItems.NETHERITE_SPEAR.get());

                        output.accept(ModItems.WOOD_MINING_HAMMER.get());
                        output.accept(ModItems.GOLD_MINING_HAMMER.get());
                        output.accept(ModItems.STONE_MINING_HAMMER.get());
                        output.accept(ModItems.IRON_MINING_HAMMER.get());
                        output.accept(ModItems.DIAMOND_MINING_HAMMER.get());
                        output.accept(ModItems.NETHERITE_MINING_HAMMER.get());

                        output.accept(ModItems.WOOD_HEAVY_SHOVEL.get());
                        output.accept(ModItems.GOLD_HEAVY_SHOVEL.get());
                        output.accept(ModItems.STONE_HEAVY_SHOVEL.get());
                        output.accept(ModItems.IRON_HEAVY_SHOVEL.get());
                        output.accept(ModItems.DIAMOND_HEAVY_SHOVEL.get());
                        output.accept(ModItems.NETHERITE_HEAVY_SHOVEL.get());

                        output.accept(ModItems.WOOD_SCYTHE.get());
                        output.accept(ModItems.GOLD_SCYTHE.get());
                        output.accept(ModItems.STONE_SCYTHE.get());
                        output.accept(ModItems.IRON_SCYTHE.get());
                        output.accept(ModItems.DIAMOND_SCYTHE.get());
                        output.accept(ModItems.NETHERITE_SCYTHE.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
