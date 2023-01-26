package model;

import javax.swing.*;

public interface PacMan {
    void doWin(Player player,int[][] mapper,JFrame frame);
    void doGhostMove(Player npc1, Icon ghost, int[][] mapper, JPanel[][] panels);
    void doPoints(Player player,int[][] mapper);
    void youLost(Player player,Player npc,JFrame frame);
}
