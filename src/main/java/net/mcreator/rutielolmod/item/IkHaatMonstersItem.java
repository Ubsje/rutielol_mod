
package net.mcreator.rutielolmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.rutielolmod.itemgroup.RutieLolModItemGroup;
import net.mcreator.rutielolmod.RutielolModModElements;

@RutielolModModElements.ModElement.Tag
public class IkHaatMonstersItem extends RutielolModModElements.ModElement {
	@ObjectHolder("rutielol_mod:ik_haat_monsters")
	public static final Item block = null;
	public IkHaatMonstersItem(RutielolModModElements instance) {
		super(instance, 51);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, RutielolModModElements.sounds.get(new ResourceLocation("rutielol_mod:disc_ikhaatmonsters")),
					new Item.Properties().group(RutieLolModItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("ik_haat_monsters");
		}
	}
}
