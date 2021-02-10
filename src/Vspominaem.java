public class Vspominaem {
    public static void main(String[] args) {
        Men men1 = new Men();
        men1.setName("Вася");
        Woman woman1 = new Woman();
        woman1.lengthOfHairs = 20;
        Man man1 = new Man();
        man1.setName("Юра");
        man1.lengthOfPenis = 15;
        man1.serit();

    }
}

class Men{

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
    public void serit() {
        System.out.println("девушки не какают");
    }
}

class Man extends Men implements srat{
    int lengthOfPenis;

    @Override
    public void serit() {
        System.out.println("весь толкан в говне");
    }
}

interface srat{
    public void serit();

}
