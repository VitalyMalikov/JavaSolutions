public class Сonstructor {
    public static void main(String[] args){
        Car car1 = new Car(); // вызывается пустой конструктор из класса Car, обладающий пустыми параметрами и пустым телом.
        Car car2 = new Car("Mersedes",15000);
    }
}
// конструктор - особый метод, который вызывается при создании нового объекта.
// отличия от метода - нет типа возвращаемого значения, имя конструктора = имя класса
class Car{
    String name;
    int price;

// ниже представлена перегрузка методов, то бишь можно иметь метод с одинаковым называанием, но разными параметрами (тип возвращаемого значения не имеет значения)
    public Car() {  // тот самый первичный конструктор

    }
    public Car(String name, int price){
        this.name = name;
        this.price = price;
        System.out.println("автомобиль: "+this.name+ ", по цене " + this.price);
    }


}
