package net.droidcrafter23.droidsimplements.items;

import net.droidcrafter23.droidsimplements.DroidsImplements;
import net.droidcrafter23.droidsimplements.items.custom.*;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, DroidsImplements.MOD_ID);

    // Daggers

    public static final RegistryObject<Item> WOOD_DAGGER = ITEMS.register("wooden_dagger",
            () -> new DaggerItem(Tiers.WOOD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.WOOD, 1, 4))));

    public static final RegistryObject<Item> GOLD_DAGGER = ITEMS.register("golden_dagger",
            () -> new DaggerItem(Tiers.GOLD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.GOLD, 1, 4))));

    public static final RegistryObject<Item> STONE_DAGGER = ITEMS.register("stone_dagger",
            () -> new DaggerItem(Tiers.STONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.STONE, 1, 4))));

    public static final RegistryObject<Item> IRON_DAGGER = ITEMS.register("iron_dagger",
            () -> new DaggerItem(Tiers.IRON, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.IRON, 1, 4))));

    public static final RegistryObject<Item> DIAMOND_DAGGER = ITEMS.register("diamond_dagger",
            () -> new DaggerItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.DIAMOND, 1, 4))));

    public static final RegistryObject<Item> NETHERITE_DAGGER = ITEMS.register("netherite_dagger",
            () -> new DaggerItem(Tiers.NETHERITE, new Item.Properties().fireResistant()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 1, 4))));

    // Warhammers

    public static final RegistryObject<Item> WOOD_WARHAMMER = ITEMS.register("wooden_warhammer",
            () -> new WarhammerItem(Tiers.WOOD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.WOOD, 4, -2.3F))));

    public static final RegistryObject<Item> GOLD_WARHAMMER = ITEMS.register("golden_warhammer",
            () -> new WarhammerItem(Tiers.GOLD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.GOLD, 4, -2.3F))));

    public static final RegistryObject<Item> STONE_WARHAMMER = ITEMS.register("stone_warhammer",
            () -> new WarhammerItem(Tiers.STONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.STONE, 4, -2.3F))));

    public static final RegistryObject<Item> IRON_WARHAMMER = ITEMS.register("iron_warhammer",
            () -> new WarhammerItem(Tiers.IRON, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.IRON, 4, -2.3F))));

    public static final RegistryObject<Item> DIAMOND_WARHAMMER = ITEMS.register("diamond_warhammer",
            () -> new WarhammerItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.DIAMOND, 4, -2.3F))));

    public static final RegistryObject<Item> NETHERITE_WARHAMMER = ITEMS.register("netherite_warhammer",
            () -> new WarhammerItem(Tiers.NETHERITE, new Item.Properties().fireResistant()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 4, -2.3F))));

    // Clubs

    public static final RegistryObject<Item> WOOD_CLUB = ITEMS.register("wooden_club",
            () -> new ClubItem(Tiers.WOOD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.WOOD, 3, -2.5F))));

    public static final RegistryObject<Item> GOLD_CLUB = ITEMS.register("golden_club",
            () -> new ClubItem(Tiers.GOLD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.GOLD, 3, -2.5F))));

    public static final RegistryObject<Item> STONE_CLUB = ITEMS.register("stone_club",
            () -> new ClubItem(Tiers.STONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.STONE, 3, -2.5F))));

    public static final RegistryObject<Item> IRON_CLUB = ITEMS.register("iron_club",
            () -> new ClubItem(Tiers.IRON, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.IRON, 3, -2.5F))));

    public static final RegistryObject<Item> DIAMOND_CLUB = ITEMS.register("diamond_club",
            () -> new ClubItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.DIAMOND, 3, -2.5F))));

    public static final RegistryObject<Item> NETHERITE_CLUB = ITEMS.register("netherite_club",
            () -> new ClubItem(Tiers.NETHERITE, new Item.Properties().fireResistant()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 3, -2.5F))));

    // Spears

    public static final RegistryObject<Item> WOOD_SPEAR = ITEMS.register("wooden_spear",
            () -> new SpearItem(Tiers.WOOD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.WOOD, 2, 3))));

    public static final RegistryObject<Item> GOLD_SPEAR = ITEMS.register("golden_spear",
            () -> new SpearItem(Tiers.GOLD, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.GOLD, 2, 3))));

    public static final RegistryObject<Item> STONE_SPEAR = ITEMS.register("stone_spear",
            () -> new SpearItem(Tiers.STONE, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.STONE, 2, 3))));

    public static final RegistryObject<Item> IRON_SPEAR = ITEMS.register("iron_spear",
            () -> new SpearItem(Tiers.IRON, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.IRON, 2, 3))));

    public static final RegistryObject<Item> DIAMOND_SPEAR = ITEMS.register("diamond_spear",
            () -> new SpearItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(SwordItem.createAttributes(Tiers.DIAMOND, 2, 3))));
    public static final RegistryObject<Item> NETHERITE_SPEAR = ITEMS.register("netherite_spear",
            () -> new SpearItem(Tiers.NETHERITE, new Item.Properties().fireResistant()
                    .attributes(SwordItem.createAttributes(Tiers.NETHERITE, 2, 3))));

    // Mining Hammers

    public static final RegistryObject<Item> WOOD_MINING_HAMMER = ITEMS.register("wooden_mining_hammer",
            () -> new MiningHammerItem(Tiers.WOOD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.WOOD, 2, -2.8F))));

    public static final RegistryObject<Item> GOLD_MINING_HAMMER = ITEMS.register("golden_mining_hammer",
            () -> new MiningHammerItem(Tiers.GOLD, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.GOLD, 2, -2.8F))));

    public static final RegistryObject<Item> STONE_MINING_HAMMER = ITEMS.register("stone_mining_hammer",
            () -> new MiningHammerItem(Tiers.STONE, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.STONE, 2, -2.8F))));

    public static final RegistryObject<Item> IRON_MINING_HAMMER = ITEMS.register("iron_mining_hammer",
            () -> new MiningHammerItem(Tiers.IRON, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.IRON, 2, -2.8F))));

    public static final RegistryObject<Item> DIAMOND_MINING_HAMMER = ITEMS.register("diamond_mining_hammer",
            () -> new MiningHammerItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(PickaxeItem.createAttributes(Tiers.DIAMOND, 2, -2.8F))));

    public static final RegistryObject<Item> NETHERITE_MINING_HAMMER = ITEMS.register("netherite_mining_hammer",
            () -> new MiningHammerItem(Tiers.NETHERITE, new Item.Properties().fireResistant()
                    .attributes(PickaxeItem.createAttributes(Tiers.NETHERITE, 2, -2.8F))));

    // Heavy Shovels

    public static final RegistryObject<Item> WOOD_HEAVY_SHOVEL = ITEMS.register("wooden_heavy_shovel",
            () -> new HeavyShovelItem(Tiers.WOOD, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.WOOD, 2, -2.8F))));

    public static final RegistryObject<Item> GOLD_HEAVY_SHOVEL = ITEMS.register("golden_heavy_shovel",
            () -> new HeavyShovelItem(Tiers.GOLD, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.GOLD, 2, -2.8F))));

    public static final RegistryObject<Item> STONE_HEAVY_SHOVEL = ITEMS.register("stone_heavy_shovel",
            () -> new HeavyShovelItem(Tiers.STONE, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.STONE, 2, -2.8F))));

    public static final RegistryObject<Item> IRON_HEAVY_SHOVEL = ITEMS.register("iron_heavy_shovel",
            () -> new HeavyShovelItem(Tiers.IRON, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.IRON, 2, -2.8F))));

    public static final RegistryObject<Item> DIAMOND_HEAVY_SHOVEL = ITEMS.register("diamond_heavy_shovel",
            () -> new HeavyShovelItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(ShovelItem.createAttributes(Tiers.DIAMOND, 2, -2.8F))));

    public static final RegistryObject<Item> NETHERITE_HEAVY_SHOVEL = ITEMS.register("netherite_heavy_shovel",
            () -> new HeavyShovelItem(Tiers.NETHERITE, new Item.Properties().fireResistant()
                    .attributes(ShovelItem.createAttributes(Tiers.NETHERITE, 2, -2.8F))));

    // Scythes

    public static final RegistryObject<Item> WOOD_SCYTHE = ITEMS.register("wooden_scythe",
            () -> new ScytheItem(Tiers.WOOD, new Item.Properties()
                    .attributes(ScytheItem.createAttributes(Tiers.WOOD, 1, -2.3F))));

    public static final RegistryObject<Item> GOLD_SCYTHE = ITEMS.register("golden_scythe",
            () -> new ScytheItem(Tiers.GOLD, new Item.Properties()
                    .attributes(ScytheItem.createAttributes(Tiers.GOLD, 1, -2.3F))));

    public static final RegistryObject<Item> STONE_SCYTHE = ITEMS.register("stone_scythe",
            () -> new ScytheItem(Tiers.STONE, new Item.Properties()
                    .attributes(ScytheItem.createAttributes(Tiers.STONE, 1, -2.3F))));

    public static final RegistryObject<Item> IRON_SCYTHE = ITEMS.register("iron_scythe",
            () -> new ScytheItem(Tiers.IRON, new Item.Properties()
                    .attributes(ScytheItem.createAttributes(Tiers.IRON, 1, -2.3F))));

    public static final RegistryObject<Item> DIAMOND_SCYTHE = ITEMS.register("diamond_scythe",
            () -> new ScytheItem(Tiers.DIAMOND, new Item.Properties()
                    .attributes(ScytheItem.createAttributes(Tiers.DIAMOND, 1, -2.3F))));

    public static final RegistryObject<Item> NETHERITE_SCYTHE = ITEMS.register("netherite_scythe",
            () -> new ScytheItem(Tiers.NETHERITE, new Item.Properties()
                    .attributes(ScytheItem.createAttributes(Tiers.NETHERITE, 1, -2.3F))));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
