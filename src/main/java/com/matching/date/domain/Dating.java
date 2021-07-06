package com.matching.date.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "dating")
@NoArgsConstructor
public class Dating {


    @Id
    @GeneratedValue
    @Column(name = "dating_id")
    private int id;

    @ManyToOne
    @JoinColumn(name="member_id")
    private Member fromMember; // fk

    @ManyToOne
    @JoinColumn(name="member_id")
    private Member toMember; // fk

    @Column(name = "create_at")
    private Date createAt;

    @Column(name = "accept")
    private int accept; // 0agree 1deny


}
