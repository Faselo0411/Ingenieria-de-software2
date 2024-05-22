package co.edu.central.citamedicas;

public class Paciente {
    private String username;
    private String password;

    public Paciente(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
