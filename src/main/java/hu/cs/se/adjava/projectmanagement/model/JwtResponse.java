package hu.cs.se.adjava.projectmanagement.model;

public class JwtResponse {
    private String name;
    private String username;
    private String token;

    public JwtResponse(String name, String username, String token) {
        this.name = name;
        this.username = username;
        this.token = token;
    }

    public JwtResponse() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
