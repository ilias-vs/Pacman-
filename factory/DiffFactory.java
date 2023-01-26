package factory;

public class DiffFactory {
    public Diff getDiff(String DiffType){
        if(DiffType == null){
            return null;
        }
        if(DiffType.equalsIgnoreCase("Easy")){
            return new Easy();

        } else if(DiffType.equalsIgnoreCase("Normal")){
            return new Normal();

        }
        return null;
    }
}
