import java.util.ArrayList;
import java.util.List;

public class GameApp {
    public static void main(String[] args) {

        Character knight = new Character(new SwingSword());
        knight.addDefenseStrategy(new Shield());
        knight.addDefenseStrategy(new Dodge());
        knight.addDefenseStrategy(new CreateMagic());

        Character wizard = new Character(new CastSpell());
        wizard.addDefenseStrategy(new CreateMagic());

        Character archer = new Character(new ShootArrow());
        archer.addDefenseStrategy(new Shield());

        System.out.println("--- Knight Actions ---");
        knight.performAttack();
        knight.performDefense();

        System.out.println("\n--- Wizard Actions ---");
        wizard.performAttack();
        wizard.performDefense();

        System.out.println("\n--- Archer Actions ---");
        archer.performAttack();
        archer.performDefense();
    }
}