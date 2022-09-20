public class Animal {

    private String food;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }






    public Animal(String food, String name) {
        this.food = food;
        this.name = name;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Animal{" + "food='" + food + '\'' + '}';
    }
}
