public class Admin extends User{
    
    public Admin(String Name, int Id){
        super(Name, Id);    
    }

    public void manageSystem(String Course){
        System.out.println(Name + " is managing the " + Course);
    }
    
    @Override
    public String getUserDetail(){
        return "Admin - name: " + Name + ", ID: " + Id;
    }

}
