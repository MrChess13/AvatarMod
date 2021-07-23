package net.mcreator.avatar.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.avatar.AvatarModElements;
import net.mcreator.avatar.AvatarMod;

import java.util.Map;

@AvatarModElements.ModElement.Tag
public class FireFlakesFoodEatenProcedure extends AvatarModElements.ModElement {
	public FireFlakesFoodEatenProcedure(AvatarModElements instance) {
		super(instance, 125);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AvatarMod.LOGGER.warn("Failed to load dependency entity for procedure FireFlakesFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 60, (int) 3, (true), (true)));
	}
}
