package com.bossgear;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("example")
public interface BossGearConfig extends Config
{
	@ConfigItem(
		keyName = "temp",
		name = "Temporary Configuration",
		description = "Temporary configuration item"
	)
	default String greeting()
	{
		return "Temp";
	}
}
