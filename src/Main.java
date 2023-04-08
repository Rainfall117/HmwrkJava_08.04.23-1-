// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int clientAcc = 232;
        int refAcc = 1132;
        int bonusX = 100;
        int bonus = refAcc / bonusX;
        int balance = clientAcc + refAcc + bonus;
        if (refAcc > 1000) {
            System.out.println(balance);
        }
        else {
            System.out.println(clientAcc + refAcc);
        }
    }
}