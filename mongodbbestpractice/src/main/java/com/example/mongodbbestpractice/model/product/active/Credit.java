package com.example.mongodbbestpractice.model.product.active;

import com.example.mongodbbestpractice.model.product.IStrategyProductActive;
import com.example.mongodbbestpractice.model.product.Product;
import com.example.mongodbbestpractice.model.product.ProductType;

public class Credit  extends Product implements IStrategyProductActive {

    @Override
    public ProductType getType() {
        return ProductType.Credit;
    }

    @Override
    public void MakePayments() {

    }
}
