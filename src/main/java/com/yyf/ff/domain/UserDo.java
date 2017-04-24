package com.yyf.ff.domain;

import lombok.Data;

import javax.persistence.*;
@Data
@Table(name = "goods_")
public class UserDo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "goods_category")
    private String goodsCategory;

    private String url;

    private String type;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return goods_category
     */
    public String getGoodsCategory() {
        return goodsCategory;
    }

    /**
     * @param goodsCategory
     */
    public void setGoodsCategory(String goodsCategory) {
        this.goodsCategory = goodsCategory;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return type
     */
    public String getType() {

        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {

        this.type = type;
    }
}