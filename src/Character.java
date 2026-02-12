import java.util.ArrayList;
import java.util.List;
class Character {
    private AttackStrategy attackStrategy;
    private List<DefenseStrategy> defenseStrategies = new ArrayList<>();

    public Character(AttackStrategy attack) {
        this.attackStrategy = attack;
    }

    public void addDefenseStrategy(DefenseStrategy defense) {
        defenseStrategies.add(defense);
    }

    public void performAttack() {
        attackStrategy.attack();
    }

    public void performDefense() {
        for (DefenseStrategy strategy : defenseStrategies) {
            strategy.defend();
        }
    }
}