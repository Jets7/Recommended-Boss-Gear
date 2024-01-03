package com.bossgear;

import net.runelite.api.EquipmentInventorySlot;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BossGearPluginPanel extends PluginPanel {

    JComboBox<BossList> slotDropDown;

    JPanel itemsPanel;

    private static final int ITEMS_PER_ROW = 4;
    private static final int NUM_INVENTORY_ITEMS = 28;

    public BossGearPluginPanel(final BossGearPlugin plugin, final ItemManager itemManager)
    {
        setLayout(new BorderLayout());
        setBackground(ColorScheme.DARK_GRAY_COLOR);

        JPanel selectionPanel = new JPanel();
        //selectionPanel.setBackground(ColorScheme.DARKER_GRAY_COLOR);
        selectionPanel.setBorder(new EmptyBorder(1, 0, 1, 0));
        selectionPanel.setLayout(new GridLayout(4, 1));

        // Select Slot
        JLabel slotLabel = new JLabel();
        slotLabel.setText("Select boss: ");
        selectionPanel.add(slotLabel);

        slotDropDown = new JComboBox<>(BossList.values());
        slotDropDown.setFocusable(false);
        selectionPanel.add(slotDropDown);

        selectionPanel.add(new JLabel());

        add(selectionPanel, BorderLayout.NORTH);

        itemsPanel = new JPanel();
        itemsPanel.setBackground(ColorScheme.DARK_GRAY_COLOR);
        itemsPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        add(itemsPanel, BorderLayout.SOUTH);

    }


}
