import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'decentNumber' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void decentNumber(int n) {
        for (int fives = n; fives >= 0; fives--) {

            if (fives % 3 == 0 && (n - fives) % 5 == 0) {

                for (int i = 0; i < fives; i++)
                    System.out.print("5");

                for (int i = 0; i < n - fives; i++)
                    System.out.print("3");

                System.out.println();
                return;
            }
        }

        System.out.println("-1");
    }
}

