package org.example.algorithms.day_3;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class ValidParentheses {

    /**
     * Задача — Valid Parentheses.
     *
     * Дана строка, состоящая только из символов '(', ')', '{', '}', '[' и ']'.
     * Верни true, если скобки расставлены корректно:
     * 1) каждая открывающая скобка закрывается ТАКОЙ ЖЕ закрывающей;
     * 2) закрывающая скобка закрывает ПОСЛЕДНЮЮ открытую (порядок вложенности);
     * 3) для каждой закрывающей есть своя парная открывающая.
     *
     * Все тест-кейсы (вход -> ожидание):
     * - "()"        -> true
     * - "()[]{}"    -> true
     * - "{[]}"      -> true
     * - "{}()[]"    -> true
     * - "{}([])"    -> true
     * - "(]"        -> false
     * - "([)]"      -> false
     * - "{[}]"      -> false
     * - ""          -> true
     * - "("         -> false
     * - "(()"       -> false
     * - ")"         -> false
     * - "]"         -> false
     */
    public static boolean isValid(String strings) {
        Deque<String> que = new ArrayDeque<>();

        if (strings.isEmpty()) {
            return true;
        }

        List<String> array = Arrays.stream(strings.split("")).toList();

        if (array.size() % 2 != 0) {
            return false;
        }

        for (String s : array) {
            if ("(".equals(s) || "{".equals(s) || "[".equals(s)) {
                switch (s) {
                    case "(" -> que.push(")");
                    case "[" -> que.push("]");
                    case "{" -> que.push("}");
                }
            } else if (")".equals(s) || "}".equals(s) || "]".equals(s)) {
                if (s.equals(que.peek())) {
                    que.pop();
                } else if (!s.equals(que.peek())){
                    return false;
                }
            }
        }

        if (!que.isEmpty()) {
            return false;
        }
        return true;
    }
}
