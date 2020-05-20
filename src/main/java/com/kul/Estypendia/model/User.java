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
}
