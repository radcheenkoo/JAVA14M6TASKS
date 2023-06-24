public class HeroTest {
    public static void main(String[] args) {
        Hero1 hero = new Hero1();

        //Expect Paratrooper
        System.out.println(hero.getName());

        //Expect 100
        System.out.println(hero.getHp());
    }
}
class Hero {
    private String name;
    private int hp;
    public Hero(){
        name = "Paratrooper";
        hp = 100;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}
