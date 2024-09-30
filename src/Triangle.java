public class Triangle extends Shape
{
    @Override
    public void calculatePerimeter(int x, int y) {
        System.out.println("perimetr");
    }

    @Override
    public void calculateArea(int x, int y) {
        System.out.println((x*y)/2);
    }
}
