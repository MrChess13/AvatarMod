
package net.mcreator.avatar.painting;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.entity.item.PaintingType;

import net.mcreator.avatar.AvatarModElements;

@AvatarModElements.ModElement.Tag
public class AvatarWorldMapPainting extends AvatarModElements.ModElement {
	public AvatarWorldMapPainting(AvatarModElements instance) {
		super(instance, 1);
		FMLJavaModLoadingContext.get().getModEventBus().register(this);
	}

	@SubscribeEvent
	public void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(48, 32).setRegistryName("avatar_world_map"));
	}
}
