package com.sonia.org.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Admin
{
    @javax.persistence.Id
    @Column(name="ID",columnDefinition = "",nullable = false)
    private  String Id;
    @Column(name ="name",columnDefinition = "VARCHAR(35)",nullable = false)
    private String name;
    @Column(name="surname",columnDefinition = "VARCHAR(100)",nullable = false)
    private String surname;


    protected Admin()
    {

    }

    public Admin (Builder builder)
    {
        this.Id = builder.Id;
        this.name = builder.name;
        this.surname = builder.surname;
    }

    public String getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static class Builder
    {
        private String Id;
        private String name;
        private String surname;

        public Builder Id(String Id)
        {
            this.Id = Id;
            return this;
        }

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder surname(String surname)
        {
            this.Id = surname;
            return this;
        }


        public Admin build()
        {
            return new Admin(this);
        }

    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Admin)) return false;
        Admin admin = (Admin) o;
        return Id.equals(admin.Id) && Objects.equals(name, admin.name) && Objects.equals(surname, admin.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }

    @Override
    public String toString() {
        return "Admin{" + "Id='" + Id + '\'' + ", name='" + name + '\'' + ", surname='" + surname + '\'' + '}';
    }
}
