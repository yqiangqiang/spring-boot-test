package com.yqq.springBoot.entity;

import javax.persistence.*;

@Entity
@Table(name = "color")
public class Color {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;

    @Column(name = "value")
    private String value;

//    @Column(name = "goods_id")
//    private long goodsId;

//    @OneToOne
//    @JoinColumn(name="goods_id",referencedColumnName="id")


    @ManyToOne( cascade = CascadeType.ALL)
    @JoinColumn(name="goods_id",referencedColumnName = "id")
    private GoodsInfo goodsInfo;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

//    public long getGoodsId() {
//        return goodsId;
//    }
//
//    public void setGoodsId(long goodsId) {
//        this.goodsId = goodsId;
//    }

    public GoodsInfo getGoodsInfo() {
        return goodsInfo;
    }

    public void setGoodsInfo(GoodsInfo goodsInfo) {
        this.goodsInfo = goodsInfo;
    }
}
