package com.bossgear;

import com.google.inject.Provides;
import javax.inject.Inject;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.game.ItemManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;
import net.runelite.client.ui.ClientToolbar;
import net.runelite.client.ui.NavigationButton;
import net.runelite.client.util.ImageUtil;

import java.awt.image.BufferedImage;

@Slf4j
@PluginDescriptor(
	name = "Recommended Boss Gear"
)
public class BossGearPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	@Getter
	private ItemManager itemManager;

	@Inject
	private BossGearConfig config;

	private NavigationButton navButton;

	private BossGearPluginPanel panel;

	@Inject
	private ClientToolbar clientToolbar;

	@Override
	protected void startUp() throws Exception
	{
		log.info("Example started!");
		this.panel = new BossGearPluginPanel(this, itemManager);
		final BufferedImage icon = ImageUtil.loadImageResource(getClass(), "/bossgear_icon.png");

		navButton = NavigationButton.builder()
				.tooltip("Boss Gear")
				.icon(icon)
				.priority(6)
				.panel(panel)
				.build();

		clientToolbar.addNavigation(navButton);
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("Example stopped!");
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Example says " + config.greeting(), null);
		}
	}

	@Provides
	BossGearConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(BossGearConfig.class);
	}
}
