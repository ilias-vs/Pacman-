package factory;

import model.Player;
import view.Map;

import javax.swing.*;

public class Easy implements Diff {
    @Override
    public void draw() {
        System.out.println("Loading Assets...");
        Player player=new Player(6,5,0,0);
        Player npc=new Player(1,7,0,0);
        Player npc2= new Player(4,1,0,0);
        //WALL CREATION
            //WALL LEFT
        mapper[0][0]=1;
        mapper[1][0]=1;
        mapper[2][0]=1;
        mapper[3][0]=1;
        mapper[4][0]=1;
        mapper[5][0]=1;
        mapper[6][0]=1;
        mapper[7][0]=1;
        mapper[8][0]=1;
        mapper[9][0]=1;
            //WALL UP
        mapper[0][1]=1;
        mapper[0][2]=1;
        mapper[0][3]=1;
        mapper[0][4]=1;
        mapper[0][5]=1;
        mapper[0][6]=1;
        mapper[0][7]=1;
        mapper[0][8]=1;
            //WALL RIGHT
        mapper[0][9]=1;
        mapper[1][9]=1;
        mapper[2][9]=1;
        mapper[3][9]=1;
        mapper[4][9]=1;
        mapper[5][9]=1;
        mapper[6][9]=1;
        mapper[7][9]=1;
        mapper[8][9]=1;
        mapper[9][9]=1;
            //WALL DOWN
        mapper[9][1]=1;
        mapper[9][2]=1;
        mapper[9][3]=1;
        mapper[9][4]=1;
        mapper[9][5]=1;
        mapper[9][6]=1;
        mapper[9][7]=1;
        mapper[9][8]=1;

            //WALL
        mapper[1][1]=1;
        mapper[1][3]=1;
        mapper[2][1]=1;
        mapper[2][3]=1;
        mapper[2][5]=1;
        mapper[2][6]=1;
        mapper[3][5]=1;
        mapper[4][2]=1;
        mapper[4][4]=1;
        mapper[4][5]=1;
        mapper[4][6]=1;
        mapper[4][7]=1;
        mapper[5][2]=1;
        mapper[5][5]=1;
        mapper[6][7]=1;
        mapper[6][8]=1;
        mapper[7][2]=1;
        mapper[7][3]=1;
        mapper[7][4]=1;
        mapper[7][6]=1;
        mapper[7][8]=1;
        mapper[8][8]=1;


        // WALL CREATION END

        //COINS CREATION
        mapper[1][5]=3;
        mapper[4][2]=3;
        mapper[3][1]=3;
        mapper[5][1]=3;
        mapper[5][6]=3;
        mapper[6][2]=3;
        mapper[6][3]=3;
        mapper[6][4]=3;
        mapper[7][7]=3;
        mapper[8][2]=3;
        mapper[8][7]=3;


        //KEY Creation
        mapper[3][6]=4;

        //Gate Creation
        mapper[1][2]=5;


        Map frame = new Map(mapper,player,npc,npc2);
        frame.setTitle("PacMan");
        frame.generateMap(10,10);
        System.out.println("MODE EASY");
    }
    int[][] mapper = new int[10][10];
}
