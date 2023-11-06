package DB;
import Users.User;
import java.util.ArrayList;
public class Database {
    ArrayList <User> users = new ArrayList<>();

    private String id;

    public Database(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void insertUserToDB(User user){
        users.add(user);
    }

    public void showUsersFromDB(){
        for(User user : users){
            System.out.print("First name: " + user.first_name);
        }
    }
}
