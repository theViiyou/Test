public class Tier {
    private String type;
    private String food;
    private int age;

    public Tier(String type, String food, int age) {
        this.type = type;
        this.food = food;
        this.age = age;
    }

    public void fressen() {
        System.out.println(food);
    }

    public void gerauschMachen() {
        System.out.println("noise noise");
    }

    @Override
    public String toString(){
        return " Tierart: " + type + " Futter: " + food + " Alter: " + age;
    }
}
