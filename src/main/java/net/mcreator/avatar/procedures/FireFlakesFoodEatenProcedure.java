package net.mcreator.avatar.procedures;

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
