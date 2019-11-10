package lab6demo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

interface Lambda {
    int sumList(ArrayList<Integer> list);
}

public class LambdaShit {
    public static void main(String[] args) {
        // clasa anonima
        Lambda l1 = new Lambda() {
            @Override
            public int sumList(ArrayList<Integer> list) {
                int sum = 0;
                for (var elem: list) {
                    sum += elem;
                }
                return sum;
            }
        };

        // lambda function
        /*
        implementam o interfata care are o singura metoda (neimplementata)
        folosind functii lambda / anonime
         */
        Lambda l2 = (list) -> {
            int sum = 0;
            for (var elem: list) {
                sum += elem;
            }
            return sum;
        };
    }
}
