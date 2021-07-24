
package net.mcreator.avatar.block;

import net.minecraft.block.material.Material;

@AvatarModElements.ModElement.Tag
public class IceBricks3StarisBlock extends AvatarModElements.ModElement {

	@ObjectHolder("avatar:ice_bricks_3_staris")
	public static final Block block = null;

	public IceBricks3StarisBlock(AvatarModElements instance) {
		super(instance, 118);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(AvatarModTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends StairsBlock {

		public CustomBlock() {
			super(() -> new Block(
					Block.Properties.create(Material.PACKED_ICE).sound(SoundType.GLASS).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0))
							.getDefaultState(),
					Block.Properties.create(Material.PACKED_ICE).sound(SoundType.GLASS).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0));

			setRegistryName("ice_bricks_3_staris");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {

			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}

	}

}
