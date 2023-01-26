import factory.DiffFactory;
import factory.FactoryFrame;
import view.Map;

public class main {
    public static void main(String[] args) {
//        Map map =new Map(new int[10][10]);
//        map.generateMap(10,10);
//        DiffFactory frame=new DiffFactory();
//        frame.getDiff("Normal").draw();
        FactoryFrame frame=new FactoryFrame();
        frame.gamemode();
    }
}
