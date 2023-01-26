package controller;
import model.PacMan;
import model.PacManImpl;
import model.Player;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowAction implements KeyListener {
    JPanel[][] panel;
    Player player;
    int[][] mapper;
    Icon icon;
    JFrame frame;
    Player npc;
    Icon imageIconghost;
    Player npc2;

    public ArrowAction(JPanel[][] panel, Player player, int[][] mapper, Icon icon, JFrame frame, Player npc, Icon imageIconghost, Player npc2) {
        this.panel = panel;
        this.player = player;
        this.mapper = mapper;
        this.icon=icon;
        this.frame=frame;
        this.npc=npc;
        this.imageIconghost=imageIconghost;
        this.npc2=npc2;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode= e.getKeyCode();
        PacMan game=new PacManImpl();


         switch (keyCode){
             case KeyEvent.VK_UP:
                if(mapper[player.getRows()-1][player.getCols()]==1) {
                    System.out.println("You hitted a Wall");
                }else{
                    if(mapper[player.getRows()-1][player.getCols()]==3){
                        game.doPoints(player,mapper);
                        mapper[player.getRows()-1][player.getCols()]=0;
                        panel[player.getRows()-1][player.getCols()].remove(0);
                        panel[player.getRows()-1][player.getCols()].revalidate();
                        panel[player.getRows()-1][player.getCols()].repaint();
                    }
                    if(mapper[player.getRows()-1][player.getCols()]==4){
                        mapper[player.getRows()-1][player.getCols()]=0;
                        System.out.println("You got the key");
                        player.setKey(1);
                        panel[player.getRows()-1][player.getCols()].remove(0);
                        panel[player.getRows()-1][player.getCols()].revalidate();
                        panel[player.getRows()-1][player.getCols()].repaint();
                    }
                    panel[player.getRows()][player.getCols()].remove(0);
                    panel[player.getRows()][player.getCols()].revalidate();
                    panel[player.getRows()][player.getCols()].repaint();
                    panel[player.getRows()-1][player.getCols()].add(new JLabel(icon));
                    panel[player.getRows()-1][player.getCols()].revalidate();
                    panel[player.getRows()-1][player.getCols()].repaint();
                    player.setRows(player.getRows()-1);
                }
                break;
             case KeyEvent.VK_DOWN:
                 if(mapper[player.getRows()+1][player.getCols()]==1) {
                     System.out.println("You hitted a Wall");

                 }else{
                     if(mapper[player.getRows()+1][player.getCols()]==3){
                         game.doPoints(player,mapper);
                         mapper[player.getRows()+1][player.getCols()]=0;
                         panel[player.getRows()+1][player.getCols()].remove(0);
                         panel[player.getRows()+1][player.getCols()].revalidate();
                         panel[player.getRows()+1][player.getCols()].repaint();
                     }
                     if(mapper[player.getRows()+1][player.getCols()]==4){
                         mapper[player.getRows()+1][player.getCols()]=0;
                         System.out.println("You got the key");
                         player.setKey(1);
                         panel[player.getRows()+1][player.getCols()].remove(0);
                         panel[player.getRows()+1][player.getCols()].revalidate();
                         panel[player.getRows()+1][player.getCols()].repaint();
                     }
                     panel[player.getRows()][player.getCols()].remove(0);
                     panel[player.getRows()][player.getCols()].revalidate();
                     panel[player.getRows()][player.getCols()].repaint();
                     panel[player.getRows()+1][player.getCols()].add(new JLabel(icon));
                     panel[player.getRows()+1][player.getCols()].revalidate();
                     panel[player.getRows()+1][player.getCols()].repaint();
                     player.setRows(player.getRows()+1);
                 }
                 break;
             case KeyEvent.VK_LEFT:
                 if(mapper[player.getRows()][player.getCols()-1]==1) {
                     System.out.println("You hitted a Wall");
                 }else{
                     if(mapper[player.getRows()][player.getCols()-1]==3){
                         game.doPoints(player,mapper);
                         mapper[player.getRows()][player.getCols()-1]=0;
                         panel[player.getRows()][player.getCols()-1].remove(0);
                         panel[player.getRows()][player.getCols()-1].revalidate();
                         panel[player.getRows()][player.getCols()-1].repaint();
                     }
                     if(mapper[player.getRows()][player.getCols()-1]==4){
                         mapper[player.getRows()][player.getCols()-1]=0;
                         System.out.println("You got the key");
                         player.setKey(1);
                         panel[player.getRows()][player.getCols()-1].remove(0);
                         panel[player.getRows()][player.getCols()-1].revalidate();
                         panel[player.getRows()][player.getCols()-1].repaint();
                     }
                     panel[player.getRows()][player.getCols()].remove(0);
                     panel[player.getRows()][player.getCols()].revalidate();
                     panel[player.getRows()][player.getCols()].repaint();
                     panel[player.getRows()][player.getCols()-1].add(new JLabel(icon));
                     panel[player.getRows()][player.getCols()-1].revalidate();
                     panel[player.getRows()][player.getCols()-1].repaint();
                     player.setCols(player.getCols()-1);
                 }
                 break;
             case KeyEvent.VK_RIGHT:
                 if(mapper[player.getRows()][player.getCols()+1]==1) {
                     System.out.println("You hitted a Wall");

                 }else{
                     if(mapper[player.getRows()][player.getCols()+1]==3){
                         game.doPoints(player,mapper);
                         mapper[player.getRows()][player.getCols()+1]=0;
                         panel[player.getRows()][player.getCols()+1].remove(0);
                         panel[player.getRows()][player.getCols()+1].revalidate();
                         panel[player.getRows()][player.getCols()+1].repaint();
                     }
                     if(mapper[player.getRows()][player.getCols()+1]==4){
                         mapper[player.getRows()][player.getCols()+1]=0;
                         System.out.println("You got the key");
                         player.setKey(1);
                         panel[player.getRows()][player.getCols()+1].remove(0);
                         panel[player.getRows()][player.getCols()+1].revalidate();
                         panel[player.getRows()][player.getCols()+1].repaint();
                     }
                     panel[player.getRows()][player.getCols()].remove(0);
                     panel[player.getRows()][player.getCols()].revalidate();
                     panel[player.getRows()][player.getCols()].repaint();
                     panel[player.getRows()][player.getCols()+1].add(new JLabel(icon));
                     panel[player.getRows()][player.getCols()+1].revalidate();
                     panel[player.getRows()][player.getCols()+1].repaint();
                     player.setCols(player.getCols()+1);
                 }
                 break;

         }
         game.doWin(player,mapper,frame);
         game.doGhostMove(npc,imageIconghost,mapper,panel);
         game.doGhostMove(npc2,imageIconghost,mapper,panel);
         game.youLost(player,npc2,frame);
         game.youLost(player,npc,frame);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
