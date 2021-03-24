package org.hibernate.entity;

import javax.persistence.*;

@Entity // данный класс будет иметь отображение в базе данных в виде таблицы
@Table(name="employees") // данный класс будет ассоциироваться с таблицей employees
public class Employee {

    @Column(name="id") // данное поле ассоциируется с колонной id в таблице
    @Id // данное поле - первичный ключ
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name") // если имя столбца совпадает с именем поля, то аргумент name можно не указывать
    private String name;

    @Column(name="surname")
    private String surname;

    @Column(name = "salary")
    private int salary;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private Detail empDetail;

    public Employee(){

    }

    public Employee(String name, String surname, int salary) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    public void setEmpDetail(Detail empDetail) {
        this.empDetail = empDetail;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Detail getEmpDetail() {
        return empDetail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", empDetail=" + empDetail +
                '}';
    }
}
