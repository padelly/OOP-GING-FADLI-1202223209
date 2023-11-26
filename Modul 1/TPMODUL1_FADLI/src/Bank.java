import java.util.ArrayList;

public class Bank {
    ArrayList<Account> daftarAkun = new ArrayList<Account>();

    public void addAccount(Account account) {
        daftarAkun.add(account);
        System.out.println("Nama: " + account.getPrivateName() + " Nomor Akun: " + account.getAccountNumber());
    }

    public boolean removeAccount(String Number) {
        for (Account account : daftarAkun) {
            if (account.getAccountNumber().equals(Number)) {
                System.out.println("Akun telah dihapus");
                daftarAkun.remove(account);
                return true;
            }
        }
        System.out.println("Akun tidak Valid");
        return false;
    }
    
    
    public Account getAccount(String Number) {
        for (Account account : daftarAkun) {
            if (account.getAccountNumber().equals(Number)) {
                return account;
            }
        }
        return null;
    }

    public ArrayList<Account> getAllAccounts() {
        return daftarAkun;
    }
}