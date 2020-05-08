public class Task12AccountApplication {
    public static void main(String[] args) {
        Task12Account account = new Task12Account();
        account.setName("Konto Premium");
        System.out.println("Nazwa: " + account.getName());
        System.out.println("Stan konta: " + account.getBalance());
    }
}
