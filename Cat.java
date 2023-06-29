public class Cat {

    private String name; // поле - имя кота
    private int appetite; // поле - аппетит (сколько сможет съесть)
    private int hunger; // поле - голод (от 0 до 10)

    public Cat(String name, int appetite, int hunger) {
        this.name = name;
        if (appetite < 0) {
            throw new IllegalArgumentException("appetite must be positive");
        }
        this.appetite = appetite;
        if (hunger < 0 || hunger > 10) {
            throw new IllegalArgumentException("hunger must be >= 0 and <= 10");
        }
        this.hunger = hunger;
    }

    // getter
    public String getName() {
        return name;
    }

    // setter
    public void setName(String name) {
        this.name = name;
    }

    // кот ест из тарелки
    public void eat(Plate plate) {
        int wantsToEat = appetite * hunger / 10; // кот хочет съесть с учетом аппетита и голода
        System.out.println("Хочет съесть: " + wantsToEat);
        if (wantsToEat != 0) { // если кот хочет есть
            int actuallyEaten = plate.decreaseFood(wantsToEat); // фактически съедено с учетом еды в тарелке
            System.out.println("Фактически съедено: " + actuallyEaten);
            hunger -= hunger * actuallyEaten / wantsToEat; // уменьшение голода
        }
    }

    @Override // метод переопределяется
    public String toString() {
        return name + ", аппетит: " + appetite + ", голод: " + hunger;
    }
}
