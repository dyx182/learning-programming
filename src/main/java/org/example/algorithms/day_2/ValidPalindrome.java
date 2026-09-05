package org.example.algorithms.day_2;

public class ValidPalindrome {

    /**
     * Задача 1 — Valid Palindrome.
     *
     * Строка считается валидным палиндромом, если после удаления всех
     * НЕ алфавитно-цифровых символов и приведения к нижнему регистру она
     * читается одинаково слева направо и справа налево.
     *
     * Алфавитно-цифровые символы: буквы a-z, A-Z и цифры 0-9. Регистр НЕ важен.
     *
     * ОБЯЗАТЕЛЬНО должны возвращать true:
     * - "" (пустая строка);
     * - строка ТОЛЬКО из неалфавитно-цифровых символов, например "  " или ".,";
     * - строка ровно из ОДНОГО символа: "a" или "1".
     *
     * Примеры:
     * - "A man, a plan, a canal: Panama" -> true (буквы: "amanaplanacanalpanama");
     * - "race a car" -> false;
     * - "aA" -> true (после очистки "aa" — палиндром, регистр не важен);
     * - "0P" -> false (цифра 0 участвует: "0p" != "p0");
     * - "ab0ba" -> true (цифры участвуют).
     */
    public static boolean isPalindrome(String s) {
        String replaced = s.toLowerCase().replaceAll("[^\\p{L}]", "");
        char[] charArr = replaced.toCharArray();

        if (charArr.length == 0) {
            return true;
        } else if (charArr.length == 1) {
            return false;
        }

        for (int i = 0; i <= charArr.length / 2; i++) {
            int j = charArr.length - 1 - i;
            if (charArr[i] != charArr[j]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Альтернативный подход: очистить строку от мусора, привести к нижнему
     * регистру, развернуть через StringBuilder и сравнить с исходной.
     */
    public static boolean isPalindromeUsingReverse(String s) {
        return false;
    }
}
