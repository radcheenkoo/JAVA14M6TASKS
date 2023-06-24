public class Hero1 {
    private String name;
    private int hp;

    public Hero1(String name, int hp) {
        this.name = name;
        this.hp = Math.min(200, Math.max(0, hp));

    }

    public Hero1() {
        this("Paratrooper", 100);
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }
}

class Hero1Test {
    public static void main(String[] args) {
        Hero1 hero = new Hero1("Stranger", 50);

        //Expect Stranger
        System.out.println(hero.getName());

        //Expect 50
        System.out.println(hero.getHp());
    }
}
