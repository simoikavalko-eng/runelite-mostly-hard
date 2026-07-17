package com.oneshot.utils;

import net.runelite.client.util.ImageUtil;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class Icons {
    public static final BufferedImage RED_HELM_IMAGE = ImageUtil.loadImageResource(Icons.class, "/redHelm.png");

    public static final BufferedImage WORLD_IMAGE = ImageUtil.loadImageResource(Icons.class, "/World_map_icon.png");

    public static final BufferedImage QUEST_IMAGE = ImageUtil.loadImageResource(Icons.class, "/iconQuestHelper.png");
    public static final BufferedImage DEATH_IMAGE = ImageUtil.loadImageResource(Icons.class, "/iconDamageHitsplat.png");
    public static final BufferedImage LEVEL_IMAGE = ImageUtil.loadImageResource(Icons.class, "/iconStats.png");
    public static final BufferedImage TASKS_IMAGE = ImageUtil.loadImageResource(Icons.class, "/iconTasks.png");

    public static final BufferedImage CLUE_SCROLL_BEGINNER = ImageUtil.loadImageResource(Icons.class, "/Clue_scroll_(beginner)_detail.png");
    public static final BufferedImage CLUE_SCROLL_EASY = ImageUtil.loadImageResource(Icons.class, "/Clue_scroll_(easy)_detail.png");
    public static final BufferedImage CLUE_SCROLL_MEDIUM = ImageUtil.loadImageResource(Icons.class, "/Clue_scroll_(medium)_detail.png");
    public static final BufferedImage CLUE_SCROLL_HARD = ImageUtil.loadImageResource(Icons.class, "/Clue_scroll_(hard)_detail.png");
    public static final BufferedImage CLUE_SCROLL_ELITE = ImageUtil.loadImageResource(Icons.class, "/Clue_scroll_(elite)_detail.png");
    public static final BufferedImage CLUE_SCROLL_MASTER = ImageUtil.loadImageResource(Icons.class, "/Clue_scroll_(master)_detail.png");

    /**
     * Clan logo shown on the About tab and the intro screen.
     * Replace src/main/resources/clanLogo.png with your own image to customise it.
     * Falls back to the red helm if the file is missing.
     */
    public static final BufferedImage CLAN_LOGO_IMAGE;
    static {
        BufferedImage logo;
        try {
            logo = ImageUtil.loadImageResource(Icons.class, "/clanLogo.png");
        } catch (Exception e) {
            logo = RED_HELM_IMAGE;
        }
        CLAN_LOGO_IMAGE = logo;
    }

    public static final ImageIcon RED_HELM = new ImageIcon(RED_HELM_IMAGE);
    public static final ImageIcon RED_HELM_SMALLER = new ImageIcon(RED_HELM_IMAGE.getScaledInstance(Constants.BUTTON_SIZE -2, Constants.BUTTON_SIZE -2, Image.SCALE_DEFAULT));
    public static final ImageIcon WORLD = new ImageIcon(WORLD_IMAGE.getScaledInstance(12, 12, Image.SCALE_SMOOTH));

    /** Scaled clan logo for the navigation button and intro screen. */
    public static final ImageIcon CLAN_LOGO = new ImageIcon(CLAN_LOGO_IMAGE);
    public static final ImageIcon CLAN_LOGO_SMALLER = new ImageIcon(
            CLAN_LOGO_IMAGE.getScaledInstance(Constants.BUTTON_SIZE - 2, Constants.BUTTON_SIZE - 2, Image.SCALE_SMOOTH));

}