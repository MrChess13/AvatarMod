package net.mcreator.avatar.procedures;

@AvatarModElements.ModElement.Tag
public class BoomerangBulletItemProcedure extends AvatarModElements.ModElement {

	public BoomerangBulletItemProcedure(AvatarModElements instance) {
		super(instance, 134);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AvatarMod.LOGGER.warn("Failed to load dependency entity for procedure BoomerangBulletItem!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");

		if (entity instanceof PlayerEntity) {
			ItemStack _setstack = new ItemStack(BoomerangItem.block, (int) (1));
			_setstack.setCount((int) 1);
			ItemHandlerHelper.giveItemToPlayer(((PlayerEntity) entity), _setstack);
		}

	}

}
