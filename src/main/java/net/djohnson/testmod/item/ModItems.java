package net.djohnson.testmod.item;

import net.djohnson.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    /* Deferred Register essentially tells Minecraft to "Create" the custom items */
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMod.MOD_ID);

    public static final RegistryObject<Item> GUM_GUM_FRUIT = ITEMS.register("gumgumfruit",
            () -> new Item(new Item.Properties()));

    /* This is different from 1.20 and 1.21; Now in 1.21.8, the EventBus is condensed into one thing instead
    * of multiple different Event Busses to handle seperate things. In order to get the BusGroup, you need to
    * grab it from the Java ModLoading context. */
    public static void register(FMLJavaModLoadingContext context) {
        ITEMS.register(context.getModBusGroup());
    }
}
