package org.launchcode.play_ball_UI.models;

import com.sun.istack.NotNull;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class User {


    @Id
    @GeneratedValue
    private int id;

    @NotNull
    private String username;

    @NotNull
    private String pwHash;

    // no arg constructor
    public User() {}

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();


    // Notice that the constructor takes a parameter named password and uses it to set the value of pwHash.
    public User(String username, String password) {
        this.username = username;
        this.pwHash = encoder.encode(password);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    // Notice that we are using encoder.matches() rather than directly comparing hash values.
    // This is because bcrypt internally uses a technique called salting, which requires additional steps before comparison.
    // These additional steps are carried out by encoder.matches().
    public boolean isMatchingPassword(String password) {
        return encoder.matches(password, pwHash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}