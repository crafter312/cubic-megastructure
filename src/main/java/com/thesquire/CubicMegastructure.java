package com.thesquire;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
	modid = CubicMegastructure.MODID,
	name = CubicMegastructure.NAME,
	version = CubicMegastructure.VERSION
)
public class CubicMegastructure {
	public static final String MODID = "cubic_megastructure";
	public static final String NAME = "Cubic Megastructure 1.12.2";
	public static final String VERSION = ".1";
	
	public static final Logger LOGGER = LogManager.getLogger(MODID);
	
	@Mod.EventHandler
	public void preinit(FMLPreInitializationEvent preinit) {
		LOGGER.info("Hello, world!");
	}
}
