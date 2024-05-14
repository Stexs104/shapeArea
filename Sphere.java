public class Sphere extends Shape {
    private double radiusr;
    public Sphere(double radiusr){
        this.radiusr = radiusr;
    }
    @Override
    public double getArea(){
        return 4 * Math.PI * Math.pow(radiusr, 2);
    }
    @Override
    public double getVolume(){
        return (4.0/3.0) * Math.PI * Math.pow(radiusr, 3);

    }
@Override
public String getName(){
     return "Sphere";
}
    
}
