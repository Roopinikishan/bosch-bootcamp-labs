package com.labs.java.reflections;

import java.lang.reflect.Method;

public class SavingsAccount extends Account {
    @ApplyInterest(roi=7.5)
    public double calculateBalance() {
        double calculateBalance = 0.0;
        try{
            Method method = this.getClass().getMethod("calculateBalance");
            if(method.isAnnotationPresent(ApplyInterest.class)) {
                double roi = method.getAnnotation(ApplyInterest.class).roi();
                calculateBalance = this.balance + (this.balance * roi/100);
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
        return calculateBalance;
    }
}
