import java.util.Scanner;
import java.util.ArrayList; 

public class User {

    // TODO: Create Private Attribute of User (Name and Phone Number) then Create Setter method for each attribute
    private String Nama;
    private int No_Handphone;

    public void setNama(String Nama){
        this.Nama = Nama;
    }

    public void setNo_Handphone(St No_Handphone){
        this.No_Handphone = No_Handphone;
    }

    public String getNama(){
        return Nama;
    }

    public St getNo_Handphone(){
        return No_Handphone;
    }
    // TODO: Create Method to Register User and Display User's Name and Phone Number and success message

    ArrayList<String> DataAkun = new ArrayList<String>();

    public void Register(User akun) {
        DataAkun.add(akun);
        System.out.println("Nama : " + akun.getNama() + "\nNo Handphone   : " + akun.getNo_Handphone()); 
    } 


}
