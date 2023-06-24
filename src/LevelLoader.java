public class LevelLoader {
    private static LevelLoader instance = new LevelLoader();

    private LevelLoader(){

    }

    public static LevelLoader getInstance() {
        return instance;
    }

    public String load(String levelName) {
        return "Loading level " + levelName + " ...";
    }
}

class Level1LoaderTest {
    public static void main(String[] args) {
        //Loading level Startlevel ...
        System.out.println(LevelLoader.getInstance().load("StartLevel"));
    }
}
