import java.util.ArrayList;
import java.util.Iterator;

public class Vspominaem {
    public static void main(String[] args) {
        Men men1 = new Man();
        men1.setName("Вася");
        Woman woman1 = new Woman();
        woman1.lengthOfHairs = 20;
        Man man1 = new Man();
        man1.setName("Юра");
        man1.lengthOfPenis = 15;
        man1.serit();
        Child child1 = new Child();
        child1.serit();

        Men men11 = new Woman();
        Men men12 = new Child();
        Men men13 = new Man();
        men11.speak();
        men12.speak();
        men13.speak();
        Men[] arrayOfMens = new Men[16];
        int a = arrayOfMens.length;
        System.out.println(a);
        arrayOfMens[0] = men11;
        int count = 0;

        System.out.println(count);
        ArrayList<Men> arrayList = new ArrayList<>();
        System.out.println(arrayList.size());
        arrayList.add(men13);
        System.out.println(arrayList.size());
        arrayList.get(0).speak();
        arrayList.add(men12);
        for(int i = 0; i < arrayList.size();++i){
            arrayList.get(i).speak();
        }
        Iterator <







    }
}

abstract class Men{
    public Men(String name, int age){
        setName(name);
        this.age = age;


    }

    abstract public void speak();
    public Men(){

    }

    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}

class Woman extends Men implements srat{
    int lengthOfHairs;
    @Override
    public void speak(){
        System.out.println("тёлка высрала хуету");
    }

    @Override
    public void serit() {
        System.out.println("девушки не какают");
    }
}

class Man extends Men implements srat{
    int lengthOfPenis;
    @Override
    public void speak(){
        System.out.println("Сказал так сказал, АУФ");
    }
    @Override
    public void serit() {
        System.out.println("весь толкан в говне");
    }
}

interface srat{
    default void serit(){
        System.out.println(" Человек срет");
    }

}

class Child extends Men implements srat{
    public void speak(){
        System.out.println("ляляля, фафафа, я тупой мелкий дегрод");
    }
}
