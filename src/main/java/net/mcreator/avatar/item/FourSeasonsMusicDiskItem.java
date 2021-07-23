
package net.mcreator.avatar.item;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

import net.mcreator.avatar.itemgroup.AvatarModTabItemGroup;
import net.mcreator.avatar.AvatarModElements;

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
