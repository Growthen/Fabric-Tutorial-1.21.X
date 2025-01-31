package net.grow.tutorialmod.item;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.grow.tutorialmod.TutorialMod;

public class ModFuelItems{


    public static void RegisterFuelItems(){
        FuelRegistry.INSTANCE.add(ModItems.STARLIGHT_ASHES, 200);

        TutorialMod.LOGGER.info("Registering Item Fuel for " + TutorialMod.MOD_ID);
    }
}
