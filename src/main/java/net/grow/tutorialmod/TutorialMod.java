package net.grow.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.grow.tutorialmod.block.ModBlocks;
import net.grow.tutorialmod.item.ModFuelItems;
import net.grow.tutorialmod.item.ModItems;
import net.grow.tutorialmod.item.ModItemsGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroup.RegisterItemGroups();

		ModFuelItems.RegisterFuelItems();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

	}

}