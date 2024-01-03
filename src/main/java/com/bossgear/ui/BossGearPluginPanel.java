package com.bossgear.ui;

import com.bossgear.BossGearPlugin;
import com.bossgear.BossList;
import net.runelite.api.EquipmentInventorySlot;
import net.runelite.client.game.ItemManager;
import net.runelite.client.ui.ColorScheme;
import net.runelite.client.ui.PluginPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Map;

public class BossGearPluginPanel extends PluginPanel {

    JComboBox<BossList> slotDropDown;

    JPanel equipmentPanel;

    public BossGearPluginPanel(final BossGearPlugin plugin, final ItemManager itemManager) {
        setLayout(new BorderLayout());
        setBackground(ColorScheme.DARK_GRAY_COLOR);

        // Boss Selection Panel
        JPanel selectionPanel = new JPanel();
        selectionPanel.setBorder(new EmptyBorder(1, 0, 1, 0));
        selectionPanel.setLayout(new GridLayout(4, 1));

        JLabel slotLabel = new JLabel();
        slotLabel.setText("Select boss: ");
        selectionPanel.add(slotLabel);

        slotDropDown = new JComboBox<>(BossList.values());
        slotDropDown.setFocusable(false);
        selectionPanel.add(slotDropDown);

        selectionPanel.add(new JLabel());

        add(selectionPanel, BorderLayout.NORTH);

        // Equipment Panel
        equipmentPanel = new JPanel();
        equipmentPanel.setBackground(ColorScheme.DARK_GRAY_COLOR);
        equipmentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        equipmentPanel.setLayout(new GridBagLayout());

        // Create equipment slots at specified positions
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(1, 1, 1, 1);

        Map<EquipmentInventorySlot, Point> equipmentPositions = EquipmentPanel.getEquipmentPositions();

        for (EquipmentInventorySlot equipmentSlot : equipmentPositions.keySet()) {
            JPanel equipmentSlotPanel = EquipmentPanel.createEquipmentSlotPanel(equipmentSlot);
            Point position = equipmentPositions.get(equipmentSlot);
            gbc.gridx = position.x;
            gbc.gridy = position.y;
            equipmentPanel.add(equipmentSlotPanel, gbc);
        }

        add(equipmentPanel, BorderLayout.CENTER);
    }
}
