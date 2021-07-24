
package net.mcreator.avatar.item;

@AvatarModElements.ModElement.Tag
public class SuckItem extends AvatarModElements.ModElement {

	@ObjectHolder("avatar:suck")
	public static final Item block = null;

	public SuckItem(AvatarModElements instance) {
		super(instance, 130);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(AvatarModTabItemGroup.tab).maxStackSize(1).rarity(Rarity.COMMON));
			setRegistryName("suck");
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
