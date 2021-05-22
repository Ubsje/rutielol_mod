
package net.mcreator.rutielolmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.rutielolmod.itemgroup.RutieLolModItemGroup;
import net.mcreator.rutielolmod.RutielolModModElements;

@RutielolModModElements.ModElement.Tag
public class StekelNetheriteItem extends RutielolModModElements.ModElement {
	@ObjectHolder("rutielol_mod:stekel_netherite")
	public static final Item block = null;
	public StekelNetheriteItem(RutielolModModElements instance) {
		super(instance, 62);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 5f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 15;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Items.NETHERITE_INGOT, (int) (1)));
			}
		}, 3, -2.4f, new Item.Properties().group(RutieLolModItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("stekel_netherite"));
	}
}
