public class RectangleArea {
    private int width;
    private int height;
    public RectangleArea(int[] coords){
        width = Math.abs(coords[2] - coords[0]);
        height = Math.abs(coords[3] - coords[1]);
    }
    public int getArea(){
        return width * height;
    }
}
class RectangleAreaTest {
    public static void main(String[] args) {
        int[] coords = {2, 2, 12, 12};

        //Expect 100
        System.out.println(new RectangleArea(coords).getArea());
    }
}