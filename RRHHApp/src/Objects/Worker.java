/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author Sistema30
 */
public class Worker {
    private int id;
    private String cedula;
    private String no_inss;
    private String names;
    private String surname;
    private String address;
    private String title;
    private float base_income;

    public Worker() {
    }

    public Worker(int id, String cedula, String no_inss, String names, String surname, String address, String title, float base_income) {
        this.id = id;
        this.cedula = cedula;
        this.no_inss = no_inss;
        this.names = names;
        this.surname = surname;
        this.address = address;
        this.title = title;
        this.base_income = base_income;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNo_inss() {
        return no_inss;
    }

    public void setNo_inss(String no_inss) {
        this.no_inss = no_inss;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getBase_income() {
        return base_income;
    }

    public void setBase_income(float base_income) {
        this.base_income = base_income;
    }

    @Override
    public String toString() {
        return "Worker{" + "id=" + id + ", cedula=" + cedula + ", no_inss=" + no_inss + ", names=" + names + ", surname=" + surname + ", address=" + address + ", title=" + title + ", base_income=" + base_income + '}';
    }
    
    public Object[] toArray(){
        Object[] array={this.id, this.cedula, this.no_inss, this.names, this.surname, this.title, this.base_income};
        return array;
    }
    
    
    
}
