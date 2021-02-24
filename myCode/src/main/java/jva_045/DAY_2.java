package jva_045;

/**
 * 16.02.2021
 */
public class DAY_2 {

    public static void main(String[] args) {
        splitNumberOnIntegerAndDoubleParts(565.266);
        Game game = new Game();
        game.start();
    }

    /**
     * split for double is " . "
     * @param inputDouble
     */
    private static void splitNumberOnIntegerAndDoubleParts(double inputDouble) {
        double tempDouble = inputDouble;

        String str = tempDouble + "";
        System.out.println("Int part: " + str.substring( 0, str.indexOf( "." ) ));
        System.out.println("Double part: " + str.substring( str.indexOf( "." )+1, str.length() ));
    }

}

class Game extends Thread {
    private Hero[] heroes;

    public Game() {
        heroes = new Hero[2];
        heroes[0] = new Hero("Mr. D", 15, 300);
        heroes[1] = new Hero("ORK", 25, 150);
    }

    private boolean isGame() {
        if(heroes[0].isAlive() && heroes[1].isAlive())
            return true;
        else
            return false;
    }

    @Override
    public void run() {
        int iteration = 0;
        while(isGame()) {
            if(iteration==0) {
                int damage = heroes[0].attack();
                heroes[1].getDamageForMe( damage );
                System.out.println(heroes[1].getInfoAboutMe());
                iteration++;
            }
            else {
                int damage = heroes[1].attack();
                heroes[0].getDamageForMe( damage );
                System.out.println(heroes[0].getInfoAboutMe());
                iteration = 0;
            }
        }
    }
}

class Hero {
    private String name;
    private int power;
    private int hp;

    private Hero() {}

    public Hero(String name, int power, int hp) {
        this.name = name;
        this.power = power;
        this.hp = hp;
    }

    public int attack(){
        return power;
    }

    public void getDamageForMe(int damage) {
        hp -= damage;
    }

    public boolean isAlive() {
        if( hp<= 0 )
            return false;
        else
            return true;
    }

    public String getInfoAboutMe() {
        StringBuilder builder = new StringBuilder();
        builder.append( "Name = " ).append( name );
        builder.append( "; HP = " ).append( hp );

        return builder.toString();
    }

}