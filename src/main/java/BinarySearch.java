import java.util.Scanner;

public class BinarySearch {

    public static void main(String args[]) {
        int w, p, o, s, m, search, array[];

        Scanner in = new Scanner(System.in);
        System.out.println("Ile elementow tablicy");
        m = in.nextInt();
        array = new int[m];

        System.out.println("Wskaz wartosci" + m + "elemntow tablicy");
        for (w = 0; w < m; w++)
            array[w] = in.nextInt();
        System.out.println("Podaj szukana wartosc");
        search = in.nextInt();

        p = 0;
        o = m - 1;
        s = (p + o) / 2;

        while (p <= o) {
            if (array[s] < search)
                p = s + 1;

            else if (array[s] == search) {
                System.out.println(search + " znalziono na pozycji " + (s));
                break;

            } else
                o = s - 1;
                s = (p + o) / 2;
        }

        if (p > o)
            System.out.println("wartosci" + search + "nie znalziono.");
    }
}




