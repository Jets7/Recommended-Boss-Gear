package com.bossgear;

public enum BossList {
    ABYSSAL_SIRE,
    ALCHEMICAL_HYDRA,
    BARROWS_BROTHERS,
    CALLISTO,
    CERBERUS,
    CHAMBERS_OF_XERIC,
    CHAOS_ELEMENTAL,
    COMMANDER_ZILYANA,
    CORPOREAL_BEAST,
    DAGANNOTH_KINGS,
    GENERAL_GRAARDOR,
    GIANT_MOLE,
    GROTESQUE_GUARDIANS,
    HESPORI,
    KALPHITE_QUEEN,
    KING_BLACK_DRAGON,
    KREE_ARRA,
    KRAKEN,
    KRIL_TSUTSAROTH,
    THE_MIMIC,
    NIGHTMARE,
    OBOR,
    SARACHNIS,
    SCORPIA,
    SKOTIZO,
    THE_GAUNTLET,
    THEATRE_OF_BLOOD,
    THERMONUCLEAR_SMOKE_DEVIL,
    TZKAL_ZUK,
    TZTOK_JAD,
    VENENATIS,
    VET_ION,
    ZALCANO,
    ZULRAH;

    @Override
    public String toString() {
        // Override toString to remove underscores and capitalize words
        String[] words = name().split("_");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word.charAt(0)).append(word.substring(1).toLowerCase()).append(" ");
        }
        return result.toString().trim();
    }

}


