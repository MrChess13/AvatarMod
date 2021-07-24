
package net.mcreator.avatar.block;

import net.minecraft.block.material.Material;

@AvatarModElements.ModElement.Tag
public class IceBricks3SlabBlock extends AvatarModElements.ModElement {

	@ObjectHolder("avatar:ice_bricks_3_slab")
	public static final Block block = null;

	public IceBricks3SlabBlock(AvatarModElements instance) {
		super(instance, 117);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(AvatarModTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends SlabBlock {

		public CustomBlock() {
			super(Block.Properties.create(Material.PACKED_ICE).sound(SoundType.GLASS).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));

			setRegistryName("ice_bricks_3_slab");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, state.get(TYPE) == SlabType.DOUBLE ? 2 : 1));
		}

	}

}
