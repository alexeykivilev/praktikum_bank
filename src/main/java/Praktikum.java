public class Praktikum {

    public static void main(String[] args) {
        String cardHolderName = "Alexey Kivilev";
        Account accountName = new Account(cardHolderName);
        accountName.checkNameToEmboss();
        System.out.println(cardHolderName);
    }

}