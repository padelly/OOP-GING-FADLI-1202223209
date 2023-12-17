
public class User {
    protected String Name;
    protected int Id;

    public User(String Name, int Id){
        this.Name = Name;
        this.Id = Id;
    }
    
    public String getUserDetail(){
        return 
        "Name    :" + Name + 
        "\nID     :" + Id;
    }
}
