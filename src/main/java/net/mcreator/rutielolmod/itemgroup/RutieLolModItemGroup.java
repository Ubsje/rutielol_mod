
package net.mcreator.rutielolmod.itemgroup;

@RutielolModModElements.ModElement.Tag
public class RutieLolModItemGroup extends RutielolModModElements.ModElement {

	public RutieLolModItemGroup(RutielolModModElements instance) {
		super(instance, 48);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabrutie_lol_mod") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(ManexietItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;

}
