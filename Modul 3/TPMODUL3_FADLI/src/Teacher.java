public class Teacher extends User{

    public Teacher(String Name,  int Id){
        super(Name, Id);;
    }

    public void teachClasss(String Course){
        System.out.println("Pak " + Name + " is teaching " + Course);
    }

    public String getUserDetail(String Course){
        return "Teacher - name: " + Name + ", ID: " + Id;
    }
}
