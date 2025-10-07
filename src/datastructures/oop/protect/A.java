package datastructures.oop.protect;

import java.time.LocalDate;
import java.util.UUID;

public class A {
    protected UUID id;

    public A(UUID id, LocalDate createdAt, LocalDate updatedAt) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }
    public A(){}

    protected LocalDate createdAt;
    protected LocalDate updatedAt;
}
