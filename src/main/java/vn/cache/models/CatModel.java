package vn.cache.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CatModel {
    private String id;
    private String name;
    private String color;
    private Address address;
}
