package com.andrasat.springbootrestapi.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

/**
 * User
 */
@Entity
@Table(name = "user")
@Getter
@Setter
@NoArgsConstructor
public class User extends AuditEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "email", nullable = false)
  @NotEmpty
  @NotNull
  private String email;

  @Column(name = "password", nullable = false)
  @Size(min = 8)
  @NotEmpty
  @NotNull
  private String password;

  @Column(name = "first_name", nullable = false)
  private String firstName;

  @Column(name = "last_name", nullable = false)
  private String lastName;

  @Override
  public String toString() {
    return String.format("User[id=%d, email=%s, firstName=%s, lastName=%s]", id, email, firstName, lastName);
  }
}