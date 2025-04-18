package net.droidcrafter23.droidsimplements;

import com.mojang.logging.LogUtils;
import net.droidcrafter23.droidsimplements.items.ModItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(DroidsImplements.MOD_ID)
public class DroidsImplements
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "droidsimplements" +
            "";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public DroidsImplements() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(modEventBus);
        ModCreativeModeTabs.register(modEventBus);
    }}