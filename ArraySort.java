public class ArraySort {
    public static void main(String[] args) {

        //Створіть масив цілих чисел з 15 елементами.
        int[] array = new int[15];

        //Заповніть масив випадковими цілими числами в діапазоні від 1 до 100.
        int minRandome = 1;
        int maxRandome = 100;
        for (int i = 0; i < array.length; i++) {
            array[i] = minRandome + (int) (Math.random() * ((maxRandome - minRandome) + 1));
        }
        System.out.print("Початковий масив: ");
        printArray(array);

        insertionSort(array); // Викликаємо функцію сортування

        System.out.println();

        System.out.print("Відсортований масив: ");
        printArray(array);

        System.out.println();

        int target = 94; // Число, яке шукаємо

        System.out.println("Введіть число для пошуку: " + target);

        int result = binarySearch(array, target); // Викликаємо бінарний пошук

        if (result == -1) {
            System.out.println("Елемент " + target + " не знайдено в масиві.");
        } else {
            System.out.println("Елемент " + target + " знайдено на індексі " + result);
        }

    }
        /* Відсортуйте масив за допомогою алгоритму сортування вставкою
        (Insertion Sort) в порядку зростання.
         */

    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                // Переміщення елементів, які більше за key, на одну позицію вперед
                array[j + 1] = array[j];
                j--;
            }
            // Вставлення key на правильну позицію у відсортованій частині масиву
            array[j + 1] = key;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + ", ");
        }
    }
    // Метод для реалізації бінарного пошуку (ітеративний підхід)
    public static int binarySearch(int[] arr, int target) {
        int left = 0; // Початковий індекс
        int right = arr.length - 1; // Кінцевий індекс

        while (left <= right) {
            int mid = left + (right - left) / 2; // Знаходимо середній індекс

            if (arr[mid] == target) {
                return mid; // Знайдено елемент, повертаємо його індекс
            }

            if (arr[mid] < target) {
                left = mid + 1; // Ігноруємо ліву частину (шукаємо в правій)
            } else {
                right = mid - 1; // Ігноруємо праву частину (шукаємо в лівій)
            }
        }

        return -1; // Якщо елемент не знайдено, повертаємо -1
    }
}

