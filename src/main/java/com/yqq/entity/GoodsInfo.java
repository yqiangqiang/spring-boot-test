package com.yqq.entity;

import javax.persistence.*;

@Entity
@Table(name = "goods_info")
public class GoodsInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String goodsName;
    private Double price;

//    @OneToMany(mappedBy = "goodsInfo")
//    private List<Color> color;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

//    public List<Color> getColor() {
//        return color;
//    }
//
//    public void setColor(List<Color> color) {
//        this.color = color;
//    }
}
