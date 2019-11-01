import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] people = {"Паша", "Света", "Кира"};
        people = Arrays.copyOf(people,people.length+1);
        people[3]= "Вячеслав";
        for (int i = 0; i < people.length; i++) {
            switch (i){
                case 0:
                    System.out.println("Доброе утро,"+ " " + people[0]);
                    break;
                case 1:
                    System.out.println("Добрый день,"+ " " + people[1]);
                    break;
                case 2:
                    System.out.println("Добрый вечер,"+" " + people[2]);
                    break;
                case 3:
                    System.out.println("Привет новенький,"+" " + people [3]);
                    break;


            }

        }

    }
}
