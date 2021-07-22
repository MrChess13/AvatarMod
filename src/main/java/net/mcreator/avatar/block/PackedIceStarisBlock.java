
package net.mcreator.avatar.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.avatar.itemgroup.AvatarModTabItemGroup;
import net.mcreator.avatar.AvatarModElements;

import java.util.List;
import java.util.Collections;

@AvatarModElements.ModElement.Tag
public class PackedIceStarisBlock extends AvatarModElements.ModElement {
	@ObjectHolder("avatar:packed_ice_staris")
	public static final Block block = null;
	public PackedIceStarisBlock(AvatarModElements instance) {
		super(instance, 17);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(AvatarModTabItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends StairsBlock {
		public CustomBlock() {
			super(() -> new Block(Block.Properties.create(Material.PACKED_ICE).sound(SoundType.GLASS).hardnessAndResistance(1f, 10f)
					.setLightLevel(s -> 0).slipperiness(1f)).getDefaultState(),
					Block.Properties.create(Material.PACKED_ICE).sound(SoundType.GLASS).hardnessAndResistance(1f, 10f).setLightLevel(s -> 0)
							.slipperiness(1f));
			setRegistryName("packed_ice_staris");
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
