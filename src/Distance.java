public class Distance {
    private int result;

    public Distance(int startX, int startY, int endX, int endY) {
        double distance = Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2);
        this.result = (int) Math.round(Math.sqrt(distance));
    }

    public int getDistance() {
        return result;
    }
}
class DistanceTest {
    public static void main(String[] args) {
        //Expect 14
        System.out.println(new Distance(10, 10, 20, 20).getDistance());

        //Expect 23
        System.out.println(new Distance(10, 10, 27, 25).getDistance());
    }
}