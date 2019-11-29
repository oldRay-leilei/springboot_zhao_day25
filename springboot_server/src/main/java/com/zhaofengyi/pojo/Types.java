package com.zhaofengyi.pojo;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "shoptypes")
public class Types {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pid;
    private String types;

    @OneToMany(mappedBy = "types",cascade ={CascadeType.MERGE,CascadeType.REFRESH},fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Users> shopusers;


    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public List<Users> getShopusers() {
        return shopusers;
    }

    public void setShopusers(List<Users> shopusers) {
        this.shopusers = shopusers;
    }
}
