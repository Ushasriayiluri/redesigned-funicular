package uk.ac.tees.mad.w9553142.helpline;

public class RegisterRequestModel {
    String name;
    String email;
    String password;
    String type;
    String doctorId;

    public RegisterRequestModel(String name, String email, String password, String type, String doctorId )
    {
        this.name = name;
        this.email = email;
        this.password = password;
        this.type = type;
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }
}
