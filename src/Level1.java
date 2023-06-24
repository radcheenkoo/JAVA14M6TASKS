public class Level1 {
    private int width;
    private int height;

    public Level1(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        int area = width * height;
        return area;
    }

}
class LevelTooBigException extends Exception {
    public LevelTooBigException(String message) {
        super(message);
    }
}
class Level1Loader {
    public void load(Level1 level) throws LevelTooBigException {
        if (level.getArea() > 100000) {
            throw new LevelTooBigException("Level is too big");
        }
        System.out.println("Level loaded");
    }
}

class LevelLoaderTest {
    public static void main(String[] args) {
        //Level loaded
        try {
            new Level1Loader().load(new Level1(10, 20));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }

        //Level too big
        try {
            new Level1Loader().load(new Level1(10000, 2000));
        } catch (LevelTooBigException ex) {
            System.out.println("Level too big");
        }
    }
}
