package lab5.task2;

import java.util.ArrayList;
import java.util.List;

public class Relationships {
    private List<String> friends = new ArrayList<>();
    private List<String> enemies = new ArrayList<>();

    public void addFriend(String friend) {
        friends.add(friend);
    }

    public void removeFriend (String friend) {
        friends.remove(friend);
    }

    public void addEnemy(String enemy) {
        enemies.add(enemy);
    }

    public void removeEnemy (String enemy) {
        enemies.remove(enemy);
    }

    List<String> getFriends() {
        return friends;
    }

    List<String> getEnemies() {
        return enemies;
    }
}
