public class Rectangle {
    private int a;
    private int b;
    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    public boolean canPlaceInto(Rectangle anotherRect){
        return anotherRect.a >= a && anotherRect.b >= b || anotherRect.b >= a && anotherRect.a >= b;
    }
}
class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}