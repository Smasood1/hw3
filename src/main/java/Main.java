public class Main {



    public static void feedAnimal(Animal[] list){


        for(int i  = 0; i < list.length; i++){

            System.out.println(list[i].getName() + " eats " + list[i].getFood());


        }


    }

    public static void main(String[] args) {

       Animal[] list = new Animal[]{new Dog("Dogfood","Gucci"),new Dinosaur("dogs","Pablo")};

        feedAnimal(list);
    }
}
