package lab6.task5._6;

public class Main {
    public static void main(String[] args) {
        FloweringPlant rose = new FloweringPlant("Rose", 2);
        Tree oak = new Tree("Oak", 5);

        rose.grow();    
        rose.blossom(); 
        oak.grow();    
    }
}
