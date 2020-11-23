

public class Main {

    public static void main(String[] args) {
        //Excercise1

        int numbers[] = {1, 4, 5, 6, 7, 4, 6, 233, 344};
        int even = 0;
        int odd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Count of even numbers: " + even);
        System.out.println("Count of even numbers: " + odd);

        System.out.println("");

        //Exercise2

        int lists[] = {1, 2, 3, 4, 5};

        lists[lists.length - 1] = lists[0] + lists[lists.length - 1];
        lists[0] = lists[lists.length - 1] - lists[0];
        lists[lists.length - 1] = lists[lists.length - 1] - lists[0];

        for (int i = 0; i < lists.length; i++) {
            System.out.println(lists[i]);
        }

        System.out.println("");

        //Exercise3 - sort ascending

        int[] numero = {6, 8, 0, 3, 4, 7, -9, 78, 23};
        int min;

        for (int i = 0; i < numero.length; i++) {
            min = numero[i];
            for (int j = i + 1; j < numero.length; j++) {
                if (numero[j] < min) {
                    min = numero[j];
                    numero[j] = numero[i];
                    numero[i] = min;
                }
            }
        }

        for (int i = 0; i < numero.length; i++) {
            System.out.println(numero[i]);
        }

        System.out.println("");


        //Exercise4 additional - sort descending
        int[] numero1 = {6, 8, 0, 3, 4, 7, -9, 78, 23};
        int max;

        for (int i = 0; i < numero1.length; i++) {
            max = numero1[i];
            for (int j = i + 1; j < numero1.length; j++) {
                if (numero[j] > max) {
                    max = numero1[j];
                    numero1[j] = numero1[i];
                    numero1[i] = max;
                }
            }

        }

        for (int i = 0; i < numero1.length; i++) {
            System.out.println(numero1[i]);
        }


    }
}

