package com.example.mongodbbestpractice.model.product.passive;
import com.example.mongodbbestpractice.model.IBankingFunctions;
import com.example.mongodbbestpractice.model.product.IStrategyProductPassive;
import com.example.mongodbbestpractice.model.product.Product;
import com.example.mongodbbestpractice.model.product.ProductType;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;



public class CurrentAccount extends Product implements IStrategyProductPassive, IBankingFunctions {

    ArrayList<String> idSignatories;
    ArrayList<String> idHolders;



    int valueCurrentAccount;

    public int getValueCurrentAccount() {
        return valueCurrentAccount;
    }

    public void setValueCurrentAccount(int valueCurrentAccount) {
        this.valueCurrentAccount = valueCurrentAccount;
    }


    public CurrentAccount(ArrayList<String> idSignatories,ArrayList<String> idHolders) {
        super();
        this.idSignatories=idSignatories;
        this.idHolders=idHolders;
    }
    public CurrentAccount() {
        super();
    }
    @Override
    public ProductType getType() {
        return ProductType.CurrentAccount;
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
        return 5;
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
