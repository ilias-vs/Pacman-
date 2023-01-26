package view;

import controller.ArrowAction;
import model.Player;

import javax.swing.*;
import java.awt.*;

public class Map extends JFrame {
    private  Player player;
    int[][] mapper;
    private Player npc;
    private Player npc2;

    public Map(int[][] mapper, Player player, Player npc, Player npc2) {
        this.mapper=mapper;
        this.player=player;
        this.npc=npc;
        this.npc2=npc2;
    }

    public void generateMap(int rows ,int cols) {
        JPanel[][] panels=new JPanel[rows][cols];
        System.out.println(rows);
        //Create mapper zone
        System.out.println(player.getCols()+" "+player.getRows());
        //create main panel
        JPanel mainPanel=new JPanel();
        Container grid= new Container();
        grid.setLayout(new GridLayout(rows,cols));

        //Creation of icons and panels
        //walls
        ImageIcon imageIconwall = new ImageIcon("src/icons/wall.png"); // load the image to a imageIcon
        Image image = imageIconwall.getImage(); // transform it
        Image newimg = image.getScaledInstance(50, 50,  Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconwall = new ImageIcon(newimg);

        //player
        ImageIcon imageIconpacman = new ImageIcon("src/icons/pacman.png"); // load the image to a imageIcon
        Image imagepacman = imageIconpacman.getImage(); // transform it
        Image newimgpacman = imagepacman.getScaledInstance(50, 50,  Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconpacman = new ImageIcon(newimgpacman);

        //coin
        ImageIcon imageIconcoin = new ImageIcon("src/icons/coin.png"); // load the image to a imageIcon
        Image imagecoin = imageIconcoin.getImage(); // transform it
        Image newimgcoin = imagecoin.getScaledInstance(20, 20,  Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconcoin = new ImageIcon(newimgcoin);

        //Key
        ImageIcon imageIconkey = new ImageIcon("src/icons/key.png"); // load the image to a imageIcon
        Image imagekey = imageIconkey.getImage(); // transform it
        Image newimgkey = imagekey.getScaledInstance(25, 25,  Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconkey = new ImageIcon(newimgkey);

        //Gate
        ImageIcon imageIcongate = new ImageIcon("src/icons/gate.png"); // load the image to a imageIcon
        Image imagegate = imageIcongate.getImage(); // transform it
        Image newimggate = imagegate.getScaledInstance(40, 40,  Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcongate = new ImageIcon(newimggate);

        //Ghost icon
        ImageIcon imageIconghost = new ImageIcon("src/icons/ghost_fixed.png"); // load the image to a imageIcon
        Image imageghost = imageIconghost.getImage(); // transform it
        Image newimgghost = imageghost.getScaledInstance(50, 50,  Image.SCALE_SMOOTH); // scale it the smooth way
        imageIconghost = new ImageIcon(newimgghost);

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                panels[i][j]=new JPanel(new BorderLayout());
                panels[i][j].setSize(50, 50);
                panels[i][j].setBackground(new Color(24,42,53));
                if(mapper[i][j]==1){
                    JLabel wallLabel = new JLabel(imageIconwall);
                    panels[i][j].add(wallLabel);
                }
                else if(player.getRows()==i && player.getCols()==j){
                    JLabel pacman= new JLabel(imageIconpacman);
                    panels[i][j].setBackground(new Color(1,2,3));
                    panels[i][j].add(pacman);
                }
                else if(mapper[i][j]==3){
                    JLabel coin= new JLabel(imageIconcoin);
                    panels[i][j].setBackground(new Color(1,2,3));
                    panels[i][j].add(coin);
                }
                else if(mapper[i][j]==4){
                    JLabel key= new JLabel(imageIconkey);
                    panels[i][j].setBackground(new Color(1,2,3));
                    panels[i][j].add(key);
                }
                else if(mapper[i][j]==5){
                    JLabel gate= new JLabel(imageIcongate);
                    panels[i][j].setBackground(new Color(1,2,3));
                    panels[i][j].add(gate);
                }
                else if(i==npc.getRows()&&j==npc.getCols()){
                    JLabel ghost= new JLabel(imageIconghost);
                    panels[i][j].setBackground(new Color(1,2,3));
                    panels[i][j].add(ghost);
                }
                else if(i==npc2.getRows()&&j==npc2.getCols()){
                    JLabel ghost= new JLabel(imageIconghost);
                    panels[i][j].setBackground(new Color(1,2,3));
                    panels[i][j].add(ghost);
                }
                else{
                    panels[i][j].setBackground(new Color(1,2,3));
                }
                grid.add(panels[i][j]);
            }
        }


        mainPanel.add(grid);
        this.add(mainPanel);
        ArrowAction keyaction=new ArrowAction(panels,player,mapper,imageIconpacman,this,npc,imageIconghost,npc2);
        this.addKeyListener(keyaction);
        pack();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
