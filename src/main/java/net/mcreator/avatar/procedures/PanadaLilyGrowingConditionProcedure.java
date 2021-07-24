package net.mcreator.avatar.procedures;

@AvatarModElements.ModElement.Tag
public class PanadaLilyGrowingConditionProcedure extends AvatarModElements.ModElement {

	public PanadaLilyGrowingConditionProcedure(AvatarModElements instance) {
		super(instance, 118);

	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AvatarMod.LOGGER.warn("Failed to load dependency x for procedure PanadaLilyGrowingCondition!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AvatarMod.LOGGER.warn("Failed to load dependency y for procedure PanadaLilyGrowingCondition!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AvatarMod.LOGGER.warn("Failed to load dependency z for procedure PanadaLilyGrowingCondition!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AvatarMod.LOGGER.warn("Failed to load dependency world for procedure PanadaLilyGrowingCondition!");
			return false;
		}

		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");

		double sx = 0;
		double sy = 0;
		double sz = 0;
		if ((!(world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z)).isSolid()))) {
			return (false);
		}
		sx = (double) (-2);
		for (int index0 = 0; index0 < (int) (5); index0++) {
			sy = (double) (-2);
			for (int index1 = 0; index1 < (int) (5); index1++) {
				sz = (double) (-2);
				for (int index2 = 0; index2 < (int) (5); index2++) {
					if (((world.getBlockState(new BlockPos((int) (x + (sx)), (int) (y + (sy)), (int) (z + (sz))))).getBlock() == Blocks.LAVA
							.getDefaultState().getBlock())) {
						return (true);
					}
					sz = (double) ((sz) + 1);
				}
				sy = (double) ((sy) + 1);
			}
			sx = (double) ((sx) + 1);
		}
		return (false);

	}

}
