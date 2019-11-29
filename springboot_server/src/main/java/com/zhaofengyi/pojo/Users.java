package com.zhaofengyi.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String shopname;
    private  String price;
    private  Integer pid;


    @ManyToOne(cascade = CascadeType.ALL,optional = false)
    @JoinColumn(name = "pid",insertable = false,updatable = false)
    @NotFound(action= NotFoundAction.IGNORE)
     private   Types  types;


    public Integer getId() {
        return id;
    }

    public Types getTypes() {
        return types;
    }

    public void setTypes(Types types) {
        this.types = types;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopname() {
        return shopname;
    }

    public void setShopname(String shopname) {
        this.shopname = shopname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getPid() {
        return pid;
    }





    public void setPid(Integer pid) {
        this.pid = pid;
    }
}
