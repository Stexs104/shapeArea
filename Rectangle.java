public class Rectangle extends Shape{
    private double breathr;
    private double heightr;
    public Rectangle(double breathr, double heightr){
        this.breathr= breathr;
        this.heightr= heightr;
    }
    @Override
    public double getArea(){
        return (breathr*heightr);
    
}
@Override
public String getName(){
    return "Rectangle";
}
}
