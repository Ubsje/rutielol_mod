
package net.mcreator.rutielolmod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import net.mcreator.rutielolmod.procedures.UraniumFoodEatenProcedure;
import net.mcreator.rutielolmod.itemgroup.RutieLolModItemGroup;
import net.mcreator.rutielolmod.RutielolModModElements;

import java.util.Map;
import java.util.HashMap;

@RutielolModModElements.ModElement.Tag
public class UraniumItem extends RutielolModModElements.ModElement {
	@ObjectHolder("rutielol_mod:uranium")
	public static final Item block = null;
	public UraniumItem(RutielolModModElements instance) {
		super(instance, 76);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(RutieLolModItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(0).saturation(0f).setAlwaysEdible().build()));
			setRegistryName("uranium");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				UraniumFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
