package com.example.mongodbbestpractice.dto.command;

import com.example.mongodbbestpractice.model.product.ProductType;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class AddProductCommandDTO {

    String id;

    ProductType type;

    String idClient;

    String description;

    ArrayList<String> benefits;

    ArrayList<String> considerations;

    ArrayList<String> restrictions;
    ArrayList<String> idSignatories;
    ArrayList<String> idHolders;

    int valueCurrentAccount;

    int valueSavingAccount;
}
