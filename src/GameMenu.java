public class GameMenu {
    static abstract class MenuItem{
        public abstract String getAction();
    }
    public void act(MenuItem item){
        if (item instanceof Start){
            System.out.println(item.getAction());
        }
        if (item instanceof Options){
            System.out.println(item.getAction());
        }
        if (item instanceof Exit){
            System.out.println(item.getAction());
        }
    }
    static class Start extends GameMenu.MenuItem {

        @Override
        public String getAction() {
            return "start";
        }
    }
    static class Options extends GameMenu.MenuItem {

        @Override
        public String getAction() {
            return "options";
        }
    }
    static class Exit extends GameMenu.MenuItem{

        @Override
        public String getAction() {
            return "exit";
        }
    }
}
class GameMenuTest {
    public static void main(String[] args) {
        GameMenu menu = new GameMenu();

        //options
        menu.act(new GameMenu.Options());

        //start
        menu.act(new GameMenu.Start());

        //exit
        menu.act(new GameMenu.Exit());
    }
}