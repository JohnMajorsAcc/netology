package com.company.task212;

// Реализация пирамидальной сортировки на Java
public class HeapSort {




    public void sort(int arr[]) {
        int n = arr.length;

        System.out.println ("Начальный массив длинной " +  n);
        printArray(arr);
        System.out.println("Построение кучи:");

        for (int i = n / 2 - 1; i >= 0; i--) {        // Построение кучи (перегруппируем массив) 8
            heapify(arr, n, i);                         // arr 8 3
         }

        System.out.println("После построения кучи:");
        printArray(arr);


        for (int i = n - 1; i >= 0; i--) {

            // Перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            printArray(arr);

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
    // индексом в arr[]. n - размер кучи
    void heapify(int arr[], int n, int i) { //8 3
        int largest = i; // Инициализируем наибольший элемент как корень  3 -> 13
        int l = 2 * i + 1; // левый = 2*i + 1                             7 -> 1
        int r = 2 * i + 2; // правый = 2*i + 2                            8 -> none

        System.out.println("largest = " + largest + " arr[" + largest + "] = " + arr[largest]);

        System.out.print("l = " + l + " arr[" + l + "] = ");
        try {
            System.out.println(arr[l]);
        } catch (IndexOutOfBoundsException e){
            System.out.println(" none");
        }

        System.out.print("r = " + r + " arr[" + r + "] = ");
        try {
            System.out.println(arr[r]);
        } catch (IndexOutOfBoundsException e){
            System.out.println(" none");
        }
        // Если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[largest]) {         //
            largest = l;
            System.out.println("L largest -> " + largest + " значение " + arr[largest] ) ;
        }

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arr[r] > arr[largest]) {
            largest = r;
            System.out.println("R largest -> " + largest + " значение "  + arr[largest] ) ;
        }

        // Если самый большой элемент не корень
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            System.out.println("swap " + arr[i] + " and " + arr[largest]);

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, largest);
        }
        System.out.println("Ничего не меняем!");
    }

    /* Вспомогательная функция для вывода на экран массива размера n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.printf("%2d   ", arr[i]);
        System.out.println();
    }




}