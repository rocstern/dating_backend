package com.matching.date.domain;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "member")
@NoArgsConstructor
public class Member
{
    @Id
    @GeneratedValue
    @Column(name = "member_id")
    private int id;

    @Column(name = "member_name")
    private String name;

    @Column(name = "member_gender")
    private int gender; // 0male 1female

    @Column(name = "member_age") // 0male 1female
    private int age;

    @Column(name = "member_height")
    private int height;

    @Column(name = "member_job")
    private String job;

    @Column(name = "member_address")
    private String address;

    @Column(name = "image")
    private String image;


    @OneToMany(mappedBy = "member", cascade = CascadeType.REMOVE)
    private List<Ideal> ideals;

    @OneToMany(mappedBy = "fromMember", cascade = CascadeType.REMOVE)
    private List<Dating> responseDate;

    @OneToMany(mappedBy = "toMember", cascade = CascadeType.REMOVE)
    private List<Dating> requestDate;

}
