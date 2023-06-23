package hw4;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class ex1 {
     public static ArrayDeque<String> reversed(ArrayDeque<String> deque) {
        ArrayDeque<String> reversedDeque = new ArrayDeque<>();
        while (!deque.isEmpty()) {
            reversedDeque.push(deque.pop());
        }
        return reversedDeque;
    }

    public static int retNumber(ArrayDeque<String> deque) {
        StringBuilder sb = new StringBuilder();
        while (!deque.isEmpty()) {
            sb.append(deque.pop());
        }
        int number = Integer.parseInt(sb.toString());
        return number;
    }

    public static LinkedList<Character> numberToLinkedList(int number) {
        String numberStr = String.valueOf(number);

        LinkedList<Character> list = new LinkedList<>();
        for (char c : numberStr.toCharArray()) {
            list.addLast(c);
        }
        return list;
    }
    public static void main(String[] args) throws Exception {
        ArrayDeque<String> firstDeque = new ArrayDeque<String>();
        ArrayDeque<String> secondDeque = new ArrayDeque<String>();
        firstDeque.add("3");
        firstDeque.add("2");
        firstDeque.add("1");
        firstDeque.add("-");
        secondDeque.add("5");
        secondDeque.add("4");
        secondDeque.add("3");
        System.out.println(firstDeque);
        System.out.println(secondDeque);
        ArrayDeque<String> reversedFirst = reversed(firstDeque);
        System.out.println(reversedFirst);
        ArrayDeque<String> reversedSecond = reversed(secondDeque);
        System.out.println(reversedSecond);
        int first = retNumber(reversedFirst);
        int second = retNumber(reversedSecond);
        System.out.println(first);
        System.out.println(second);
        System.out.println(first * second);
        int result = first * second;
        System.out.println(numberToLinkedList(result));
    }
}
