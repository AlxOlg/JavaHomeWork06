public class program {

   public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 300, 5);
        Plate plate = new Plate(100);

        System.out.println(cat);
        System.out.println(plate);

        cat.eat(plate);

        System.out.println(cat);
        System.out.println(plate);
   } 
}
