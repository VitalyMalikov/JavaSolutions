import java.util.Scanner;
// break сразу же выходит с цикла полностью, continue же инкрементирует счётчик (если это возможно)
public class SwichBreakContinue {
    public static void main(String[] args){
        System.out.println("Hello world");
        System.out.println("Макс - конч");
        Scanner value = new Scanner(System.in);
        System.out.println("Введите число до 100");
        int invalue = value.nextInt();
        while(invalue <= 100){
            System.out.println("Ваше чило: "+ invalue + ", выведем оставшиеся нечетные числа до 100");
            for (int i = invalue; i <= 100;i++) {
                if (i % 2 == 0) {
                    continue;
                }
                System.out.println(i);
            }
            break;
        }
// Вторая часть посвящённая swicth-ам (для конкретных значений)(можно использовать строку), которые заменяют кучу if-ов
        Scanner value2 = new Scanner(System.in);
        System.out.println("Введите возраст кошака");
        int age = value2.nextInt();
        switch(age){
            case 0 :
                System.out.println("еще не родился махонькой");
                break;
            case 1 :
                System.out.println("мААлый павзраслел, туруруру ту...");
                break;
            case 2 :
                System.out.println("Пушистый говноед уже совсем большООй");
                break;
            default :
                System.out.println("ты ввёл хуету, чел");





        }

    }
}
