import java.util.Scanner;

public class LinearSearch2 {

        public static void main(String args[]) {
            int w, m, search = 0, array[];

            Scanner in = new Scanner(System.in);
            System.out.println("Ilosc elementow ssstablicysss");
            m = in.nextInt();
            array = new int[m];

            System.out.println("Podaj wartosci " + m + " elemtow tablucy");

            for (w = 0; w < m; w++)
                array[w] = in.nextInt();

            System.out.println("Podaj szukana wartosc");
            search = in.nextInt();

            for (w = 0; w < m; w++) {
                if (array[w] == search) {
                    System.out.println(search + " znaleziono na pozycji " + (w));
                    break;
                }
            }
            if (w == m)
                System.out.println(search + " nie znaleziono elentu tablicy.");
        }
    }

