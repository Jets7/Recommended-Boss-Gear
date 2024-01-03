package com.bossgear.ui;

import net.runelite.api.EquipmentInventorySlot;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class EquipmentPanel {

    private static final Map<EquipmentInventorySlot, Point> EQUIPMENT_POSITIONS = new HashMap<>();

    static {
        EQUIPMENT_POSITIONS.put(EquipmentInventorySlot.HEAD, new Point(1, 0));
        EQUIPMENT_POSITIONS.put(EquipmentInventorySlot.AMULET, new Point(1, 1));
        EQUIPMENT_POSITIONS.put(EquipmentInventorySlot.CAPE, new Point(0, 1));
        EQUIPMENT_POSITIONS.put(EquipmentInventorySlot.AMMO, new Point(2, 1));
        EQUIPMENT_POSITIONS.put(EquipmentInventorySlot.BODY, new Point(1, 2));
        EQUIPMENT_POSITIONS.put(EquipmentInventorySlot.WEAPON, new Point(0, 2));
        EQUIPMENT_POSITIONS.put(EquipmentInventorySlot.SHIELD, new Point(2, 2));
        EQUIPMENT_POSITIONS.put(EquipmentInventorySlot.LEGS, new Point(1, 3));
        EQUIPMENT_POSITIONS.put(EquipmentInventorySlot.BOOTS, new Point(0, 4));
        EQUIPMENT_POSITIONS.put(EquipmentInventorySlot.GLOVES, new Point(1, 4));
        EQUIPMENT_POSITIONS.put(EquipmentInventorySlot.RING, new Point(2, 4));
    }

    public static Map<EquipmentInventorySlot, Point> getEquipmentPositions() {
        return new HashMap<>(EQUIPMENT_POSITIONS);
    }

    public static JPanel createEquipmentSlotPanel(EquipmentInventorySlot equipmentSlot) {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(new Color(62, 53, 41)); // Dark gray color similar to RuneScape
        panel.setPreferredSize(new Dimension(43, 43)); // Adjust the size to match RuneScape's slots
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Border for separation

       /* JLabel slotLabel = new JLabel(equipmentSlot.name());
        slotLabel.setHorizontalAlignment(SwingConstants.CENTER);
        slotLabel.setForeground(Color.WHITE);

        panel.add(slotLabel, BorderLayout.CENTER); */

        return panel;
    }
}
