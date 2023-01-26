package factory;

import model.Player;
import view.Map;

public class Normal implements Diff {
    @Override
    public void draw() {
        System.out.println("Loading Assets...");
        Player player=new Player(11,4,0,0);
        Player npc=new Player(1,8,0,0);
        Player npc2=new Player(7,4,0,0);

        //Wall Creation
        for(int i=0;i<15;i++){
            for(int j=0;j<11;j++){
                if(j==0){
                    mapper[i][j]=1;
                }
                if(i==0){
                    mapper[i][j]=1;
                }
                if(j==10){
                    mapper[i][j]=1;
                }
                if(i==14){
                    mapper[i][j]=1;
                }
            }
        }
        mapper[1][2]=1;
        mapper[1][4]=1;
        mapper[1][5]=1;
        mapper[2][2]=1;
        mapper[2][5]=1;
        mapper[2][8]=1;
        mapper[3][2]=1;
        mapper[3][3]=1;
        mapper[3][5]=1;
        mapper[3][7]=1;
        mapper[3][8]=1;
        mapper[5][1]=1;
        mapper[5][2]=1;
        mapper[5][3]=1;
        mapper[5][5]=1;
        mapper[5][8]=1;
        mapper[6][5]=1;
        mapper[6][8]=1;
        mapper[7][2]=1;
        mapper[7][5]=1;
        mapper[7][6]=1;
        mapper[7][7]=1;
        mapper[7][8]=1;
        mapper[8][2]=1;
        mapper[9][2]=1;
        mapper[9][4]=1;
        mapper[9][5]=1;
        mapper[9][6]=1;
        mapper[9][8]=1;
        mapper[9][9]=1;
        mapper[11][1]=1;
        mapper[11][2]=1;
        mapper[11][3]=1;
        mapper[11][7]=1;
        mapper[12][2]=1;
        mapper[12][5]=1;
        mapper[12][6]=1;
        mapper[12][7]=1;
        mapper[13][7]=1;
        //End of wall creation


        //Coins creation
        mapper[2][1]=3;
        mapper[1][3]=3;
        mapper[1][6]=3;
        mapper[2][3]=3;
        mapper[2][4]=3;
        mapper[2][6]=3;
        mapper[3][4]=3;
        mapper[4][1]=3;
        mapper[4][2]=3;
        mapper[4][3]=3;
        mapper[6][6]=3;
        mapper[6][7]=3;
        mapper[5][9]=3;
        mapper[6][9]=3;
        mapper[7][1]=3;
        mapper[7][9]=3;
        mapper[8][1]=3;
        mapper[9][1]=3;
        mapper[12][9]=3;
        mapper[13][1]=3;
        mapper[13][2]=3;
        mapper[13][5]=3;
        mapper[13][6]=3;
        mapper[13][8]=3;
        mapper[13][9]=3;

        //Key creation
        mapper[1][1]=4;

        //Gate creation
        mapper[12][1]=5;






        Map frame = new Map(mapper,player,npc,npc2);
        frame.setTitle("PacMan");
        frame.generateMap(15,11);
        System.out.println("MODE EASY");
    }
    int[][] mapper = new int[15][11];
}
