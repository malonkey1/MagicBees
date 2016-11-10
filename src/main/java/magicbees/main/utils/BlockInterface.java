package magicbees.main.utils;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class BlockInterface
{
	public static Block getBlock(String item)
	{
		return GameRegistry.findBlock("Forestry", item);
	}

	public static Block getBlock(String modId, String item)
	{
		return GameRegistry.findBlock(modId, item);
	}
}
