public class Cube extends Shape {
    private double shapelenth;
    public Cube(double shapelenth){
        this.shapelenth = shapelenth;
    }
    @Override
    public double getArea(){
    return 6 * Math.pow(shapelenth,2);
    }
    

@Override
public double getVolume(){
    return Math.pow(shapelenth, 3);
}
@Override
public String getName(){
    return "Cube";
}

}