package vn.cache.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String street;
    private String ward;
    private String province;
    private String city;
}
