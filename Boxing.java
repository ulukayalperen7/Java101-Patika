
public class Boxing {

    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc", 15, 100, 90, 40);
        Fighter alex = new Fighter("Alex", 10, 95, 100, 60);
        Ring r = new Ring(marc, alex, 90, 100);
        r.run();
    }
}

class Fighter {

    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }

        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  
        return randomValue <= this.dodge;
    }
}

class Ring {

    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {
        if (checkWeight()) {

            // İlk round da kimin başlayacak ? 
            boolean isFirstTurn = Math.random() * 100 < 50;

            while (f1.health > 0 && f2.health > 0) {
                System.out.println("======== YENİ ROUND ===========");

                if (isFirstTurn) {
                    this.f2.health = this.f1.hit(this.f2);
                    if (isWin()) {
                        break;
                    }
                    isFirstTurn = false;
                } else {
                    this.f1.health = this.f2.hit(this.f1);
                    if (isWin()) {
                        break;
                    }
                    isFirstTurn = true;
                }

                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }

    }

    public boolean checkWeight() {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin() {
        if (f1.health == 0) {
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        } else if (f2.health == 0) {
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        }

        return false;
    }

    public void printScore() {
        System.out.println("------------");
        System.out.println(this.f1.name + " Kalan Can \t:" + this.f1.health);
        System.out.println(this.f2.name + " Kalan Can \t:" + this.f2.health);
    }
}
