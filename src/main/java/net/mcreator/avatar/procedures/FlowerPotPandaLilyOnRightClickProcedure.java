package net.mcreator.avatar.procedures;

@AvatarModElements.ModElement.Tag
public class FlowerPotPandaLilyOnRightClickProcedure extends AvatarModElements.ModElement {

	public FlowerPotPandaLilyOnRightClickProcedure(AvatarModElements instance) {
		super(instance, 120);

	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AvatarMod.LOGGER.warn("Failed to load dependency entity for procedure FlowerPotPandaLilyOnRightClick!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AvatarMod.LOGGER.warn("Failed to load dependency x for procedure FlowerPotPandaLilyOnRightClick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AvatarMod.LOGGER.warn("Failed to load dependency y for procedure FlowerPotPandaLilyOnRightClick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AvatarMod.LOGGER.warn("Failed to load dependency z for procedure FlowerPotPandaLilyOnRightClick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AvatarMod.LOGGER.warn("Failed to load dependency world for procedure FlowerPotPandaLilyOnRightClick!");
			return;
		}

		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem())) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = Blocks.FLOWER_POT.getDefaultState();

				world.setBlockState(_bp, _bs, 3);

			}
			if (entity instanceof LivingEntity) {
				ItemStack _setstack = new ItemStack(PandaLilyBlock.block, (int) (1));
				_setstack.setCount((int) 1);
				((LivingEntity) entity).setHeldItem(Hand.MAIN_HAND, _setstack);
				if (entity instanceof ServerPlayerEntity)
					((ServerPlayerEntity) entity).inventory.markDirty();
			}
		}

	}

}
