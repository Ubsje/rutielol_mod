
package net.mcreator.rutielolmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.rutielolmod.itemgroup.RutieLolModItemGroup;
import net.mcreator.rutielolmod.RutielolModModElements;

@RutielolModModElements.ModElement.Tag
public class ManexietItem extends RutielolModModElements.ModElement {
	@ObjectHolder("rutielol_mod:manexiet")
	public static final Item block = null;

	public ManexietItem(RutielolModModElements instance) {
		super(instance, 16);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(RutieLolModItemGroup.tab).maxStackSize(64).isImmuneToFire().rarity(Rarity.RARE));
			setRegistryName("manexiet");
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
