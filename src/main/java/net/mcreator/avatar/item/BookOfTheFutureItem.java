
package net.mcreator.avatar.item;

@AvatarModElements.ModElement.Tag
public class BookOfTheFutureItem extends AvatarModElements.ModElement {

	@ObjectHolder("avatar:book_of_the_future")
	public static final Item block = null;

	public BookOfTheFutureItem(AvatarModElements instance) {
		super(instance, 136);

	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			super(new Item.Properties().group(AvatarModTabItemGroup.tab).maxStackSize(64).rarity(Rarity.RARE));
			setRegistryName("book_of_the_future");
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

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

	}

}
