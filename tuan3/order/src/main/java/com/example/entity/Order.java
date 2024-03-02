package com.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Table(name = "`order`")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Order {

    @GeneratedValue
    @Id
    private long id;

    @Column
    private String orderName;
}
