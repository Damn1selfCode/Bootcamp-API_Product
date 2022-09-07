package com.example.mongodbbestpractice.model.product.passive;
import com.example.mongodbbestpractice.model.IBankingFunctions;
import com.example.mongodbbestpractice.model.product.IStrategyProductPassive;
import com.example.mongodbbestpractice.model.product.Product;
import com.example.mongodbbestpractice.model.product.ProductType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SavingAccount extends Product implements IStrategyProductPassive , IBankingFunctions {



    int valueSavingAccount;

    @Override
    public ProductType getType() {
        return ProductType.SavingAccount;
    }

    @Override
    public float getNumMaintenanceCommission() {
        return (float) 7.5;
    }

    @Override
    public boolean getBolMaintenanceCommission() {
        return true;
    }

    @Override
    public int getNumLimitMovements() {
        return -1;
    }

    @Override
    public boolean getBolLimitMovements() {
        return false;
    }

    @Override
    public void Deposit() {

    }

    @Override
    public void Withdraw() {

    }
}
