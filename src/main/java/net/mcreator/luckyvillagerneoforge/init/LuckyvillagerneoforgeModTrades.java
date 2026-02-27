/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.luckyvillagerneoforge.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@EventBusSubscriber
public class LuckyvillagerneoforgeModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.DIRT), new ItemStack(Items.NETHERITE_CHESTPLATE, 3), 100, 12, 0.05f));
		}
		if (event.getType() == VillagerProfession.LIBRARIAN) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.DIRT), new ItemStack(Items.ENCHANTED_BOOK, 5), 100, 17, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.DIRT), new ItemStack(Items.NETHERITE_SWORD, 3), 100, 17, 0.05f));
		}
		if (event.getType() == VillagerProfession.FARMER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.DIRT), new ItemStack(Items.ENCHANTED_GOLDEN_APPLE, 3), 100, 20, 0.05f));
		}
		if (event.getType() == VillagerProfession.FLETCHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.DIRT), new ItemStack(Blocks.EMERALD_BLOCK, 64), 100, 50, 0.05f));
		}
		if (event.getType() == VillagerProfession.CARTOGRAPHER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.DIRT), new ItemStack(Items.FILLED_MAP, 15), 100, 5, 0.05f));
		}
	}
}