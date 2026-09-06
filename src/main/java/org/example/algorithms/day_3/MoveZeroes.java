package org.example.algorithms.day_3;

public class MoveZeroes {

    /**
     * Задача — Move Zeroes.
     *
     * Дан массив целых чисел nums. Перемести все нули В КОНЕЦ массива, сохранив
     * относительный порядок ненулевых элементов. Работай В МЕСТЕ (in-place),
     * не создавая копию массива. Метод ничего не возвращает — меняет сам массив.
     *
     * Все тест-кейсы (вход -> ожидание после вызова):
     * - [0,1,0,3,12]     -> [1,3,12,0,0]
     * - [1,0,0,2,0,3,0]  -> [1,2,3,0,0,0,0]
     * - [0,0,1]          -> [1,0,0]
     * - [1,2,3]          -> [1,2,3]
     * - [0,0,0]          -> [0,0,0]
     * - [0]              -> [0]
     * - []               -> []
     */
    public static void moveZeroes(int[] nums) {
        int write = 0;

        for (int read = 0; read < nums.length; read++) {
            if (nums[read] != 0) {
                nums[write] = nums[read];
                write = write + 1;
            }
        }
        for (int i = write; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
