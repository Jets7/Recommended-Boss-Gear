package com.bossgear;

import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.PluginPanel;

import javax.swing.*;
import java.awt.*;

public class BossGearPluginPanel extends PluginPanel {
    private static ImageIcon HELP_ICON;
    private final JLabel mainTitle;

    private static String MAIN_TITLE;

    static
    {
        MAIN_TITLE = "Boss Gear";
    }

    public BossGearPluginPanel(final BossGearPlugin plugin, final ItemManager itemManager)
    {
        this.mainTitle = new JLabel();
        mainTitle.setText(MAIN_TITLE);
        mainTitle.setForeground(Color.WHITE);
    }


}
