import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
        int[] numbers = new int[]{45, 32,20,18,7,0,-3};         //Posortowana tablica w porządku rosnącym
        int x = 0;                                              //Numer

        System.out.println(new Search().search(numbers, x));    //Wdrażanie metody search
    }

    private boolean search(int[] numbers, int x) {              //Metoda search
        int firstIndex = 0;
        int lastIndex = numbers.length - 1;



        /* Algorytm wyszukiwania binarnego dla podanej liczby.
         Z każdą iteracją liczba wyszukiwań zmniejsza się o połowę.
         Złożoność obliczeniową algorytmy O(log n), pamięciową O(1)*/
        
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (numbers[middleIndex] == x) {
                return true;
            } else if (numbers[middleIndex] < x) {
                firstIndex = middleIndex + 1;
            } else if (numbers[middleIndex] > x) {
                lastIndex = middleIndex - 1;
            }
        }
        return false;
    }
}
