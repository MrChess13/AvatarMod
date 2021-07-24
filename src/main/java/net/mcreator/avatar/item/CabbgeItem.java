
package net.mcreator.avatar.item;

@AvatarModElements.ModElement.Tag
public class CabbgeItem extends AvatarModElements.ModElement {

	@ObjectHolder("avatar:cabbge")
	public static final Item block = null;

	public CabbgeItem(AvatarModElements instance) {
		super(instance, 123);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}

	public static class FoodItemCustom extends Item {

		public FoodItemCustom() {
			super(new Item.Properties().group(AvatarModTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f)

							.build()));
			setRegistryName("cabbge");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

	}

}
