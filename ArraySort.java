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
}
