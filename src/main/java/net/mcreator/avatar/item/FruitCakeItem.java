
package net.mcreator.avatar.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

import net.mcreator.avatar.itemgroup.AvatarModTabItemGroup;
import net.mcreator.avatar.AvatarModElements;

@AvatarModElements.ModElement.Tag
public class FruitCakeItem extends AvatarModElements.ModElement {
	@ObjectHolder("avatar:fruit_cake")
	public static final Item block = null;
	public FruitCakeItem(AvatarModElements instance) {
		super(instance, 126);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(AvatarModTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(16).saturation(0.7999999999999999f).build()));
			setRegistryName("fruit_cake");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
