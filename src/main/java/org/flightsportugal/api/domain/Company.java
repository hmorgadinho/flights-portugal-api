package org.flightsportugal.api.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Entity
public class Company {

    public enum CompanyName {
        TAP,
        RYANAIR
    }

    @Id
    @GeneratedValue
    private Long id;
    private String code;
    @Enumerated(EnumType.STRING)
    private CompanyName name;
    private String country;


    public Company(String code, CompanyName name, String country) {
        this.code = code;
        this.name = name;
        this.country = country;
    }
}
