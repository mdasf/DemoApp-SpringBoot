package com.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;



@Getter
@Setter
@Entity
@Table(name="insights")
public class InsightModel {

    @Id
    private Integer id;

    @Column
    private String endYear;

    @Column
    private String sector;

    @Column
    private String insight;

    @Column
    private String topic;


}
