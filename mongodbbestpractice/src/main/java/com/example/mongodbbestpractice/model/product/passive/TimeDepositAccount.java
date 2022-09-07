package com.example.mongodbbestpractice.model.product.passive;
import com.example.mongodbbestpractice.model.IBankingFunctions;
import com.example.mongodbbestpractice.model.product.IStrategyProductPassive;
import com.example.mongodbbestpractice.model.product.Product;
import com.example.mongodbbestpractice.model.product.ProductType;

public class TimeDepositAccount  extends Product implements IStrategyProductPassive, IBankingFunctions {

    @Override
    public ProductType getType() {
        return ProductType.TimeDepositAccount;
    }

    @Override
    public float getNumMaintenanceCommission() {
        return -1;
    }

    @Override
    public boolean getBolMaintenanceCommission() {
        return false;
    }

    @Override
    public int getNumLimitMovements() {
        return 1;
    }

    @Override
    public boolean getBolLimitMovements() {
        return true;
    }

    @Override
    public void Deposit() {

    }

    @Override
    public void Withdraw() {

    }
}
