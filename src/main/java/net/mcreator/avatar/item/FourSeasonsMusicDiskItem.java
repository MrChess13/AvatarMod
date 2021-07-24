
package net.mcreator.avatar.item;

@AvatarModElements.ModElement.Tag
public class FourSeasonsMusicDiskItem extends AvatarModElements.ModElement {

	@ObjectHolder("avatar:four_seasons_music_disk")
	public static final Item block = null;

	public FourSeasonsMusicDiskItem(AvatarModElements instance) {
		super(instance, 131);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {

		public MusicDiscItemCustom() {
			super(0, AvatarModElements.sounds.get(new ResourceLocation("avatar:fourseasons")),
					new Item.Properties().group(AvatarModTabItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("four_seasons_music_disk");
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

	}

}
