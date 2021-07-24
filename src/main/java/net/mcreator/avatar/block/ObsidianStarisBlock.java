
package net.mcreator.avatar.block;

import net.minecraft.block.material.Material;

@AvatarModElements.ModElement.Tag
public class ObsidianStarisBlock extends AvatarModElements.ModElement {

	@ObjectHolder("avatar:obsidian_staris")
	public static final Block block = null;

	public ObsidianStarisBlock(AvatarModElements instance) {
		super(instance, 140);

	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(AvatarModTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends StairsBlock {

		public CustomBlock() {
			super(() -> new Block(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 20f).setLightLevel(s -> 0)
					.harvestLevel(3).harvestTool(ToolType.PICKAXE).setRequiresTool()).getDefaultState(),
					Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 20f).setLightLevel(s -> 0).harvestLevel(3)
							.harvestTool(ToolType.PICKAXE).setRequiresTool());

			setRegistryName("obsidian_staris");
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
