package com.example.Model;

import lombok.*;
import org.springframework.data.annotation.Id;
import javax.persistence.*;
import java.io.Serializable;

@ToString
@Setter
@Getter
@Data
@Entity(name = "user")
@Table(name = "user",uniqueConstraints={@UniqueConstraint(columnNames={"user_name"})})
public class UserModel implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long user_id;

    @Column(name = "account_id")
    private long account_id;

    @Column(name = "user_name", unique = true)
    private String user_name;

    @Column(name = "user_pwd")
    private String user_pwd;
}