
package net.mcreator.avatar.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.avatar.itemgroup.AvatarModTabItemGroup;
import net.mcreator.avatar.AvatarModElements;

@AvatarModElements.ModElement.Tag
public class FlakesItem extends AvatarModElements.ModElement {
	@ObjectHolder("avatar:flakes")
	public static final Item block = null;
	public FlakesItem(AvatarModElements instance) {
		super(instance, 128);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AvatarModTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("flakes");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
