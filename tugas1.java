class searchMyString {
    private char maxChar, minChar;
    private String kata;

    public searchMyString(String value) {
        this.maxChar = getMaxChar(value);
        this.minChar = getMinChar(value);
        this.kata = value;
    }

    public char getMaxChar() {
        return maxChar;
    }

    public char getMinChar() {
        return minChar;
    }

    private char getMaxChar(String string) {
        char maxChar = string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) > maxChar) {
                maxChar = string.charAt(i);
            }
        }
        return maxChar;
    }

    private char getMinChar(String string) {
        char minChar = string.charAt(0);
        for (int i = 1; i < string.length(); i++) {
            if (string.charAt(i) < minChar) {
                minChar = string.charAt(i);
            }
        }
        return minChar;
    }

    public int searchChar(char character) {
        int hitung = 0;

        for (int i = 0; i < kata.length(); i++) {
            if (kata.charAt(i) == character) {
                hitung++;
            }
        }
        return hitung;
    }

}

public class tugas1 {
    public static void main(String[] args) {
        String kalimat = "TugasSementaraMCSelamanya";
        searchMyString kata = new searchMyString(kalimat);

        System.out.println("Karakter dengan urutan terbesar: " + kata.getMaxChar());
        System.out.println("Karakter dengan urutan terkecil: " + kata.getMinChar());
        System.out.println("Banyak huruf a : " + kata.searchChar('a'));
    }

}
