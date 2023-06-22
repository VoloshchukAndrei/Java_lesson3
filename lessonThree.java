import java.util.*;

public class lessonThree {

    public static void main(String[] args) {

        int size = 30;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list1.add(new Random().nextInt(99));
            list2.add(new Random().nextInt(99));
            list3.add(new Random().nextInt(99));
            list4.add(new Random().nextInt(99));
        }

        System.out.println(list1);
        int number = size;
        for (int i = 0; i < number; i++){
            if ((list1.get(i) % 2) == 0){
                list1.remove(i);
                i = i - 1;
                number = number - 1;
            }
        }
        System.out.println("1) Удалены чётные числа -");
        System.out.println(list1);

        System.out.println(list2);
        list2.sort(Comparator.reverseOrder());
        for (int i = 1; i < size; i++){
            list2.remove(0);
        }
        System.out.println("2) Минимальное значение -");
        System.out.println(list2);

        System.out.println(list3);
        list3.sort(Comparator.naturalOrder());
        for (int i = 1; i < size; i++){
            list3.remove(0);
        }
        System.out.println("3) Максимальное значение -");
        System.out.println(list3);

        System.out.println(list4);
        int sum = 0;
        int average = 0;
        for (int i = 0; i < size; i++){
            sum = sum + list4.get(i);
            average = sum / size;
        }
        System.out.println("4) Среднее значение -");
        System.out.println(average);
    }
}
