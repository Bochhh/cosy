package com.cozy.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.cozy.enumeration.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "brokers")
public class Broker extends User{
    private String phoneNumber;

    public Broker(String firstname, String lastname, String email, String password,
                  Role role, String phoneNumber) {
        super(firstname, lastname, email, password, role);
        this.phoneNumber = phoneNumber;

    }
}

