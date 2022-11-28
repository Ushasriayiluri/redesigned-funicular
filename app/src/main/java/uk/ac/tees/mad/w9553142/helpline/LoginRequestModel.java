package uk.ac.tees.mad.w9553142.helpline;

public class LoginRequestModel {
    String email;
    String password;

    public LoginRequestModel(String email, String password )
    {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
