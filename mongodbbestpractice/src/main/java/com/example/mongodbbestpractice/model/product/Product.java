package com.example.mongodbbestpractice.model.product;

import com.example.mongodbbestpractice.model.product.passive.CurrentAccount;
import com.example.mongodbbestpractice.model.product.passive.SavingAccount;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;


@Getter
@Setter
public class Product  {
    @Id
    String id;

    ProductType type;

    String idClient;

    String description;

    ArrayList<String> benefits;

    ArrayList<String> considerations;

    ArrayList<String> restrictions;


}
