package JavaTest;

public class TestProgram {
    public static void main(String[] args){
        System.out.println("Пососи, чел");
        Cat cat1 = new Cat();
        cat1.setCat("Vaska");

        System.out.println("Cat is ");
    }
}

class Cat{
    private String name;

    public void setCat(String catName){
        name = catName;
        System.out.println(name);
    }
    public String getName(){

        return name;
    }

}
