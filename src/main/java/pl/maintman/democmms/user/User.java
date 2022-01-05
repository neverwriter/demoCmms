package pl.maintman.democmms.user;


import org.springframework.data.annotation.Id;

public class User {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String login;
    private Long password;
    private String role;

    public User(Long id, String firstName, String lastName, String email, String login, Long password, String role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.login = login;
        this.password = password;
        this.role = role;
    }

//    public User(String firstName, String lastName, String email, String login, Long password, String role) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.login = login;
//        this.password = password;
//        this.role = role;
//    }
//
//    public User(){};
}

