import java.util.Arrays;

public class TargetFinder {
    public int[] findTarget(int[] aiCoords, int[][] targets) {
        if (targets.length == 0) {
            return null;
        }

        int minDistance = Integer.MAX_VALUE;
        int[] nearestTarget = null;

        for (int[] target : targets) {
            int distance = calculateDistance(aiCoords, target);

            if (distance < minDistance) {
                minDistance = distance;
                nearestTarget = target;
            }
        }

        return nearestTarget;
    }

    private int calculateDistance(int[] coords1, int[] coords2) {
        int x1 = coords1[0];
        int y1 = coords1[1];
        int x2 = coords2[0];
        int y2 = coords2[1];

        int distance = (int) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return distance;
    }
}
class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}