public class TexturePool {
    private static TexturePool instance = new TexturePool();

    private TexturePool(){}

    public String getTexture(String textureName){
        return "Get texture " + textureName;
    }
    public static TexturePool getInstance(){
        return instance;
    }
}
class TexturePoolTest {
    public static void main(String[] args) {
        //Get texture MainHero
        System.out.println(TexturePool.getInstance().getTexture("MainHero"));
    }
}