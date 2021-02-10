import java.util.Scanner;
// НЕ ЗАБЫВАЙ, МЕТОДЫ ВЫЗЫВАЮТСЯ ЧЕРЕЗ ТОЧКУ...
public class СlassAndObjects {
    public static void main(String[] args){
        Cat cat1 = new Cat();
        cat1.name = "Kisa";
        cat1.sayName();
        Cat cat2 = new Cat();
        System.out.println("введите возраст второго кота: ");
        Scanner scanName = new Scanner(System.in);
        int s = scanName.nextInt();
        System.out.println("возраст на 50 больше: "+cat1.sayAge(s));
        cat2.sayName2(cat1.name);


    }

}

class Cat{
    String name;
    private int age;  // модификатор доступа, нужны для ограничения прав(инкапсуляции)
    void sayName(){
        System.out.println("кошку зовут: " + name);
    }
    void sayName2(String s){  // параметр метода, через запятую могут быть перечислено несколько входных параметров.
        name = s+50;
        System.out.println("вот имя запрашиваемого кошака: "+ name);
    }
    int sayAge(int years){
        age = years + 50;
        return age; // return возвращает значение. Его можно использовать и в void для выхода из функции.
    }
    // сеттеры и геттеры, с помощью которых можно получать значения в main-е от полей в других классах.(+ от них, что можно менять внутренние переменные класса)

    public void setName(String sss){ //переменная в параметрах видна только в методе и всё
        name = sss;
    }
    public String getName(){
        return name;
    }

    public void setAge(int ageage){
        age = ageage;
    }
    public int getAge(){
        return age;
    }

}
