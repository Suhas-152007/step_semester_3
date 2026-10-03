
class HealthBar {
    private int health;

    HealthBar(int health) {
        this.health = health;
    }

    void takeDamage(int damage) {
        health = health - damage;

        if (health < 0) {
            health = 0;
        }
    }

    void showHealth() {
        System.out.println("Current Health: " + health);
    }
}

public class HealthBarDemo {
    public static void main(String[] args) {
        HealthBar player = new HealthBar(100);

        player.showHealth();
        player.takeDamage(30);
        player.showHealth();
    }
}