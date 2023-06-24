public class CircleIntersector {
    private int distanceSquared;
    private int sumRadiiSquared;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2){
        distanceSquared = (int) ((int) Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        sumRadiiSquared = (int) Math.pow(r1 + r2, 2);
    }
    @Override
    public String toString() {
        if (distanceSquared > sumRadiiSquared) {
            return "not intersects";
        } else {
            return "intersects";
        }
    }
}
class CircleIntersectorTest {
    public static void main(String[] args) {
        //intersects
        System.out.println(new CircleIntersector(0, 0, 2, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(0, 0, 1, 4, 0, 2));

        //not intersects
        System.out.println(new CircleIntersector(5, 5, 2, 8, 8, 2));
    }
}