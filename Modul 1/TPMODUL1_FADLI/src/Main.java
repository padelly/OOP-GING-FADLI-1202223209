public class Main {
    public static void main(String[] args) {
    
        Account account1 = new Account();
        account1.setPrivateName("Andre");
        account1.setAccountNumber("1202224539");
        account1.setBalance(100000.0);

        Account account2 = new Account();
        account2.setPrivateName("\nPadre");
        account2.setAccountNumber("1202228491");
        account2.setBalance(150000.0);

        Account account3 = new Account();
        account3.setPrivateName("\nPedro");
        account3.setAccountNumber("1202225182");
        account3.setBalance(200000.0);

        Bank bank = new Bank();
        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        System.out.println("\nSaldo Akun");
        System.out.println("Andre: " + account1.getBalance());
        System.out.println("Padre: " + account2.getBalance());
        System.out.println("Pedro: " + account3.getBalance());

        System.out.println("\nAndre telah melakukan deposit");
        account1.deposit(50000.0);

        System.out.println("\nPadre telah melakukan withdraw");
        account2.withdraw(20000.0);

        System.out.println("\nPedro telah melakukan deposit");
        account3.withdraw(70000.0);

        System.out.println("\nDaftar Semua bank:");

        for (Account account : bank.getAllAccounts()) {
            System.out.println("Nama: " + account.getPrivateName());
            System.out.println("Nomor Akun: " + account.getAccountNumber());
            System.out.println("Saldo: " + account.getBalance());
            System.out.println();
        }
    }
}