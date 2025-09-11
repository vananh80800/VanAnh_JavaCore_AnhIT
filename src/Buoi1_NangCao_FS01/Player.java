package Buoi1_NangCao_FS01;

import java.util.Random;

public class Player {
    // Biến instance
    private String name; // tên người chơi
    private int health;  // số máu hiện tại

    // Biến static
    private static final int MAX_HEALTH = 100; // số máu tối đa

    // Constructor
    public Player(String name) {
        this.name = name;
        this.health = MAX_HEALTH; // khi tạo player thì máu đầy = 100
    }

    // Phương thức tấn công
    public void attack(Player enemy) {
        Random rand = new Random(); // tạo đối tượng random
        int damage = rand.nextInt(21) + 10; // sát thương random từ 10–30
        enemy.health -= damage; // trừ máu của đối thủ
        if (enemy.health < 0) enemy.health = 0; // không để máu âm

        // In ra thông tin sau lượt tấn công
        System.out.println(this.name + " tấn công " + enemy.name + " gây " + damage + " sát thương.");
        System.out.println("Máu còn lại của " + enemy.name + ": " + enemy.health);
        System.out.println("-------------------");
    }

    public static void main(String[] args) {
        Player p1 = new Player("Người chơi A");
        Player p2 = new Player("Người chơi B");
        for (int i = 1; i <= 3; i++) {
            System.out.println("---- Lượt " + i + " ----");
            p1.attack(p2); // A đánh B
            p2.attack(p1); // B đánh A
        }
    }
}