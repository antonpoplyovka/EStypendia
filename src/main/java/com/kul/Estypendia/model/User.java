package com.kul.Estypendia.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="usr")
public class User {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "userpic", nullable = false)
    private String userpic;
    @Column(name = "email", nullable = false, length = 50)
    private String email;
    @Column(name = "role", nullable = false)
    private String role= "USER";
    @Column(name = "locale", nullable = false)
    private String locale;
    @Column(name = "lastVisit", nullable = false)
    private LocalDateTime lastVisit;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUserpic() {
        return userpic;
    }

    public String getEmail() {
        return email;
    }

    public String getLocale() {
        return locale;
    }

    public LocalDateTime getLastVisit() {
        return lastVisit;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserpic(String userpic) {
        this.userpic = userpic;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }

    public void setLastVisit(LocalDateTime lastVisit) {
        this.lastVisit = lastVisit;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
