public class MountainHare {

    // добавьте переменные и конструктор

    public static String color;
    private int age;
    private double weight;
    private double jumpLength;

    public MountainHare(int age, double weight, double jumpLength){
        this.age=age;
        this.weight=weight;
        this.jumpLength=jumpLength;
    }

    @Override
    public String toString() {
        return "Заяц-беляк: " +
                "age=" + age +
                ", weight=" + weight +
                ", jumpLength=" + jumpLength +
                ", color=" + color +
                '.';
    }
}