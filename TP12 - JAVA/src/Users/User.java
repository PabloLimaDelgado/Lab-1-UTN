package Users;

import java.util.Date;

public class User {
    public String first_name, last_name, mail;
    public int number, cp;
    public Date days;
    private String password;
    public  User(String first_name, String last_name, String mail, int number, int cp, Date days, String password){
        this.first_name = first_name;
        this.last_name = last_name;
        this.mail = mail;
        this.number = number;
        this.cp = cp;
        this.days = days;
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
