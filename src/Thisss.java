public class Thisss {
    public static void main(String[] args){
        Human human1 = new Human();
        human1.setName("Коля");
        human1.setAge(20);
        human1.getInfo();
    }
}
// используется в классах и указывает на объект класса
class Human{
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name+", "+age);
    }
}
