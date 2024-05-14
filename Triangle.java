public class Triangle extends Shape{
    private double breath;
    private double height;
    public Triangle(double breath, double height){
        this.breath= breath;
        this.height= height;
    }
    @Override
    public double getArea(){
        return (breath*height)/2;
    }
    @Override
    public String getName(){
        return "Triangle";

    }


}