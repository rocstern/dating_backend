package com.matching.date.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "ideal")
@NoArgsConstructor
public class Ideal {

    @Id
    @GeneratedValue
    @Column(name = "ideal_id")
    private int id;

    @Column(name = "ideal_type")
    private int type; //0height 1age

    @Column(name = "range_start")
    private int rangeStart;

    @Column(name = "range_end")
    private int rangeEnd;


}
