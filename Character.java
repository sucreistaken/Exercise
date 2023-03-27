public class Character {
    private int health;

    public Character(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public int takeDamage(int damage){
        if(health- damage>0){
            System.out.println("You are DEAD☠️");
        }
        return this.health- damage;
    }
}
