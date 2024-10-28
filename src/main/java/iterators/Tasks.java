package iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Tasks {
    public static void main(String[] args) {
        String str = " abcdf fDCBA ";
        System.out.println("is palindrom --> " + isPalindrom(str));
    }

    static boolean isPalindrom(String str) {
        boolean flagIsPalindrom = true;
        if (str == null)
            return false;
        else {
            List<Character> charList = new ArrayList<>();
            for (char ch : str.toLowerCase().toCharArray()) {
                charList.add(ch);
            }
            ListIterator<Character> iterator = charList.listIterator();
            ListIterator<Character> reversIterator = charList.listIterator(charList.size());
            char next, prev;
            //while (iterator.hasNext() && iterator.nextIndex() <= charList.size()/2) {
            while (iterator.hasNext() && iterator.nextIndex() <= reversIterator.previousIndex()) {
                next = iterator.next();
                prev = reversIterator.previous();
                System.out.println(next + "--" + prev);
                if (next != prev) {
                    flagIsPalindrom = false;
                    break;
                }
            }

        }
        return flagIsPalindrom;
    }
}
