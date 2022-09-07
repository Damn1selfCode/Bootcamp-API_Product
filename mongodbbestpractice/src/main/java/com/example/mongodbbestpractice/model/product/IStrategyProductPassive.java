package com.example.mongodbbestpractice.model.product;


public interface IStrategyProductPassive {

   ProductType getType();
   float getNumMaintenanceCommission();
   boolean getBolMaintenanceCommission();
   int getNumLimitMovements();
   boolean getBolLimitMovements();

}

