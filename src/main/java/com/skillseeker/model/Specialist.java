package com.skillseeker.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "specialists")
@Entity
public class Specialist {

    @Id
    @SequenceGenerator(name = "specialists_id_seq", sequenceName = "specialists_id_seq")
    private Long id;


    @OneToOne
    @PrimaryKeyJoinColumn
    private User user;

    @Column(name = "profile_photo", length = 255)
    private String profilePhoto;

    @Column(name = "")
    private String bio;

    @Column(name = "")
    private String qualification;
    @Column(name = "")
    private Long experienceYears;

    @Column(name = "")
    private String location;

    @CreatedDate
    @Column(name = "", nullable = false,  updatable = false )
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "", nullable = false)
    private LocalDateTime updatetAt;

}