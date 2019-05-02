import java.util.Scanner;

public class Szyfr {



    public Szyfr() {

    }

    public String szyfruj() {


        Scanner text = new Scanner(System.in);

        System.out.println("Podaj tekst, ktory ma byc zaszyfrowany:");
        String txt = text.nextLine();

        StringBuffer result = new StringBuffer();
        StringBuffer result1 = new StringBuffer();

        for(int i = 0; i < txt.length(); i++) {

            if(Character.isUpperCase(txt.charAt(i))) { //checking the size of letters

                char ch = (char) (((int) txt.charAt(i) + 3 - 65) % 26 + 65);
                result.append(ch);
            }
            else {

                char ch = (char) (((int) txt.charAt(i) + 3 - 97) % 26 + 97);
                result.append(ch);
            }
        }

        System.out.println("Podaj cyfrę, która ma być zaszyfrowana:");
        String liczba = text.nextLine();

        for(int i = 0; i < liczba.length(); i++) {

            char cha = (char) (((int) liczba.charAt(i) + 3 - 48) % 10 + 48);
            result1.append(cha);
        }

        return String.format("Zaszyfrowany tekst: %s\nZaszyfrowana liczba: %s", result.toString(), result1.toString());
    }

}

