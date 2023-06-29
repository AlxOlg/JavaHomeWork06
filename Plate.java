public class Plate {

    private int food;

    // если без аргумента, то значение задается по умолчанию
    public Plate() {
        this(100);
    }

    // если с аргументом, то присваивается значение
    public Plate(int food) {
        if (food < 0) {
            throw new IllegalArgumentException("food must be positive");
        }
        this.food = food;
    }

    // getter
    public int getFood() {
        return food;
    }

    // setter
    public void setFood(int food) {
        this.food = food;
    }

    // увеличение еды в тарелке
    public void increaseFood(int food) {
        if (food > 0) {
            this.food += food;
        }
    }

    // уменьшение еды в тарелке
    public int decreaseFood(int food) {
        int eaten; // фактически съедено
        if (this.food >= food) { // если еды в тарелке достаточно
            this.food -= food;
            eaten = food; // фактически съедено = может съесть
        } else {
            eaten = this.food; // фактически съедено = количество еды в тарелке
            this.food = 0;
        }
        return eaten;
    }

    @Override
    public String toString() {
        return "Количество еды в тарелке: " + food;
    }
}
