package com.kul.Estypendia.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name="usr")
public class User {
    @Id
    private String id;
    private String name;
    private String userpic;
    private String email;
    private String role= "USER";
    private String locale;
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
