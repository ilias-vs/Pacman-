package model;

import factory.DiffFactory;
import factory.FactoryFrame;

import javax.swing.*;

public class PacManImpl implements PacMan{


    @Override
    public void doWin(Player player, int[][] mapper,JFrame frame) {
        if(mapper[player.getRows()][player.getCols()]==5){
            if(player.getKey()==1){
                System.out.println("Your points is: "+player.getPoints());
                JOptionPane.showMessageDialog(frame,
                        "YOU WON",
                        "YOU WON",
                        JOptionPane.PLAIN_MESSAGE);
                frame.dispose();
                FactoryFrame newgame=new FactoryFrame();
                newgame.gamemode();
            }
            else{
                System.out.println("The gate is closed");
            }
        }
    }

    @Override
    public void doGhostMove(Player npc1, Icon ghost, int[][] mapper, JPanel[][] panels) {
        if(npc1.getKey()==0){
            //go Down!
            if (mapper[npc1.getRows() + 1][npc1.getCols()] != 1) {
                if(mapper[npc1.getRows()][npc1.getCols()] == 3 || mapper[npc1.getRows()][npc1.getCols()] == 4 || mapper[npc1.getRows()][npc1.getCols()] == 5){
                    panels[npc1.getRows()][npc1.getCols()].remove(1);
                }
                else{
                    panels[npc1.getRows()][npc1.getCols()].remove(0);
                }
                panels[npc1.getRows()][npc1.getCols()].revalidate();
                panels[npc1.getRows()][npc1.getCols()].repaint();
                panels[npc1.getRows() + 1][npc1.getCols()].add(new JLabel(ghost));
                panels[npc1.getRows() + 1][npc1.getCols()].revalidate();
                panels[npc1.getRows() + 1][npc1.getCols()].repaint();
                npc1.setRows(npc1.getRows() + 1);
            }
            //go right
            else if (mapper[npc1.getRows()][npc1.getCols() + 1] != 1) {
                if(mapper[npc1.getRows()][npc1.getCols()] == 3 || mapper[npc1.getRows()][npc1.getCols()] == 4 || mapper[npc1.getRows()][npc1.getCols()] == 5){
                    panels[npc1.getRows()][npc1.getCols()].remove(1);
                }
                else{
                    panels[npc1.getRows()][npc1.getCols()].remove(0);
                }
                panels[npc1.getRows()][npc1.getCols()].revalidate();
                panels[npc1.getRows()][npc1.getCols()].repaint();
                panels[npc1.getRows()][npc1.getCols() + 1].add(new JLabel(ghost));
                panels[npc1.getRows()][npc1.getCols() + 1].revalidate();
                panels[npc1.getRows()][npc1.getCols() + 1].repaint();
                npc1.setCols(npc1.getCols() + 1);
            }
            //go left
            else {
                if(mapper[npc1.getRows()][npc1.getCols()] == 3 || mapper[npc1.getRows()][npc1.getCols()] == 4 || mapper[npc1.getRows()][npc1.getCols()] == 5){
                    panels[npc1.getRows()][npc1.getCols()].remove(1);
                }
                else{
                    panels[npc1.getRows()][npc1.getCols()].remove(0);
                }
                panels[npc1.getRows()][npc1.getCols()].revalidate();
                panels[npc1.getRows()][npc1.getCols()].repaint();
                panels[npc1.getRows()][npc1.getCols() - 1].add(new JLabel(ghost));
                panels[npc1.getRows()][npc1.getCols() - 1].revalidate();
                panels[npc1.getRows()][npc1.getCols() - 1].repaint();
                npc1.setCols(npc1.getCols() - 1);
                npc1.setKey(1);
                return;
            }



        }
        if(npc1.getKey()==1){
            //go Left
            if (mapper[npc1.getRows()][npc1.getCols() - 1] != 1) {
                if(mapper[npc1.getRows()][npc1.getCols()] == 3 || mapper[npc1.getRows()][npc1.getCols()] == 4 || mapper[npc1.getRows()][npc1.getCols()] == 5){
                    panels[npc1.getRows()][npc1.getCols()].remove(1);
                }
                else{
                    panels[npc1.getRows()][npc1.getCols()].remove(0);
                }
                panels[npc1.getRows()][npc1.getCols()].revalidate();
                panels[npc1.getRows()][npc1.getCols()].repaint();
                panels[npc1.getRows()][npc1.getCols() - 1].add(new JLabel(ghost));
                panels[npc1.getRows()][npc1.getCols() - 1].revalidate();
                panels[npc1.getRows()][npc1.getCols() - 1].repaint();
                npc1.setCols(npc1.getCols() - 1);
            }
            //go Down!
            else if (mapper[npc1.getRows() + 1][npc1.getCols()] != 1) {
                if(mapper[npc1.getRows()][npc1.getCols()] == 3 || mapper[npc1.getRows()][npc1.getCols()] == 4 || mapper[npc1.getRows()][npc1.getCols()] == 5){
                    panels[npc1.getRows()][npc1.getCols()].remove(1);
                }
                else{
                    panels[npc1.getRows()][npc1.getCols()].remove(0);
                }
                panels[npc1.getRows()][npc1.getCols()].revalidate();
                panels[npc1.getRows()][npc1.getCols()].repaint();
                panels[npc1.getRows() + 1][npc1.getCols()].add(new JLabel(ghost));
                panels[npc1.getRows() + 1][npc1.getCols()].revalidate();
                panels[npc1.getRows() + 1][npc1.getCols()].repaint();
                npc1.setRows(npc1.getRows() + 1);
            }
            //go Up
            else{
                if(mapper[npc1.getRows()][npc1.getCols()] == 3 || mapper[npc1.getRows()][npc1.getCols()] == 4 || mapper[npc1.getRows()][npc1.getCols()] == 5){
                    panels[npc1.getRows()][npc1.getCols()].remove(1);
                }
                else{
                    panels[npc1.getRows()][npc1.getCols()].remove(0);
                }
                panels[npc1.getRows()][npc1.getCols()].revalidate();
                panels[npc1.getRows()][npc1.getCols()].repaint();
                panels[npc1.getRows()-1][npc1.getCols()].add(new JLabel(ghost));
                panels[npc1.getRows()-1][npc1.getCols()].revalidate();
                panels[npc1.getRows()-1][npc1.getCols()].repaint();
                npc1.setRows(npc1.getRows() - 1);
                npc1.setKey(2);
                return;
            }//go Left

        }
        if(npc1.getKey()==2){
            //go Up
            if (mapper[npc1.getRows()-1][npc1.getCols()] != 1) {
                if(mapper[npc1.getRows()][npc1.getCols()] == 3 || mapper[npc1.getRows()][npc1.getCols()] == 4 || mapper[npc1.getRows()][npc1.getCols()] == 5){
                    panels[npc1.getRows()][npc1.getCols()].remove(1);
                }
                else{
                    panels[npc1.getRows()][npc1.getCols()].remove(0);
                }
                panels[npc1.getRows()][npc1.getCols()].revalidate();
                panels[npc1.getRows()][npc1.getCols()].repaint();
                panels[npc1.getRows()-1][npc1.getCols()].add(new JLabel(ghost));
                panels[npc1.getRows()-1][npc1.getCols()].revalidate();
                panels[npc1.getRows()-1][npc1.getCols()].repaint();
                npc1.setRows(npc1.getRows() - 1);
            }//go Right
            else if (mapper[npc1.getRows()][npc1.getCols() + 1] != 1) {
                if(mapper[npc1.getRows()][npc1.getCols()] == 3 || mapper[npc1.getRows()][npc1.getCols()] == 4 || mapper[npc1.getRows()][npc1.getCols()] == 5){
                    panels[npc1.getRows()][npc1.getCols()].remove(1);
                }
                else{
                    panels[npc1.getRows()][npc1.getCols()].remove(0);
                }
                panels[npc1.getRows()][npc1.getCols()].revalidate();
                panels[npc1.getRows()][npc1.getCols()].repaint();
                panels[npc1.getRows()][npc1.getCols() + 1].add(new JLabel(ghost));
                panels[npc1.getRows()][npc1.getCols() + 1].revalidate();
                panels[npc1.getRows()][npc1.getCols() + 1].repaint();
                npc1.setCols(npc1.getCols() + 1);
                npc1.setKey(3);
                return;
            }


        }
        if(npc1.getKey()==3){
            //go Right
            if (mapper[npc1.getRows()][npc1.getCols() + 1] != 1) {
                if(mapper[npc1.getRows()][npc1.getCols()] == 3 || mapper[npc1.getRows()][npc1.getCols()] == 4 || mapper[npc1.getRows()][npc1.getCols()] == 5){
                    panels[npc1.getRows()][npc1.getCols()].remove(1);
                }
                else{
                    panels[npc1.getRows()][npc1.getCols()].remove(0);
                }
                panels[npc1.getRows()][npc1.getCols()].revalidate();
                panels[npc1.getRows()][npc1.getCols()].repaint();
                panels[npc1.getRows()][npc1.getCols() + 1].add(new JLabel(ghost));
                panels[npc1.getRows()][npc1.getCols() + 1].revalidate();
                panels[npc1.getRows()][npc1.getCols() + 1].repaint();
                npc1.setCols(npc1.getCols() + 1);
            }//go Up
            else if (mapper[npc1.getRows()-1][npc1.getCols()] != 1) {
                if(mapper[npc1.getRows()][npc1.getCols()] == 3 || mapper[npc1.getRows()][npc1.getCols()] == 4 || mapper[npc1.getRows()][npc1.getCols()] == 5){
                    panels[npc1.getRows()][npc1.getCols()].remove(1);
                }
                else{
                    panels[npc1.getRows()][npc1.getCols()].remove(0);
                }
                panels[npc1.getRows()][npc1.getCols()].revalidate();
                panels[npc1.getRows()][npc1.getCols()].repaint();
                panels[npc1.getRows()-1][npc1.getCols()].add(new JLabel(ghost));
                panels[npc1.getRows()-1][npc1.getCols()].revalidate();
                panels[npc1.getRows()-1][npc1.getCols()].repaint();
                npc1.setRows(npc1.getRows() - 1);
            }
            //go Down!
            else {
                if(mapper[npc1.getRows()][npc1.getCols()] == 3 || mapper[npc1.getRows()][npc1.getCols()] == 4 || mapper[npc1.getRows()][npc1.getCols()] == 5){
                    panels[npc1.getRows()][npc1.getCols()].remove(1);
                }
                else{
                    panels[npc1.getRows()][npc1.getCols()].remove(0);
                }
                panels[npc1.getRows()][npc1.getCols()].revalidate();
                panels[npc1.getRows()][npc1.getCols()].repaint();
                panels[npc1.getRows() + 1][npc1.getCols()].add(new JLabel(ghost));
                panels[npc1.getRows() + 1][npc1.getCols()].revalidate();
                panels[npc1.getRows() + 1][npc1.getCols()].repaint();
                npc1.setRows(npc1.getRows() + 1);
                npc1.setKey(0);
                return;
            }
        }



    }


    @Override
    public void doPoints(Player player, int[][] mapper) {
        player.setPoints(player.getPoints()+1);
    }

    @Override
    public void youLost(Player player,Player npc,JFrame frame) {
        if(player.getRows()==npc.getRows() && player.getCols()== npc.getCols()){
            JOptionPane.showMessageDialog(frame,
                    "YOU LOSE",
                    "YOU LOSE",
                    JOptionPane.ERROR_MESSAGE);
            frame.dispose();
            FactoryFrame newgame=new FactoryFrame();
            newgame.gamemode();
        }
    }


}
