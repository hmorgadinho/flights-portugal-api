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
@Table(name="airports")
public class Airport {

    public enum City {
        LISBON,
        PORTO
    }

    @Id
    @GeneratedValue
    private Long id;
    private String code;
    private String name;
    @Enumerated(EnumType.STRING)
    private City city;
    private String country;

    public Airport(String code, String name, City city, String country) {
        this.code = code;
        this.name = name;
        this.city = city;
        this.country = country;
    }
}

