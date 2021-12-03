package com.frankmoley.lil.learningspring.data.entity;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Generated;

@Component
@Scope(value = "prototype")
public class Resell {
    private int units = 7;
    private int returnUnits = 7;
    private int returnValue = 1;
    private double totalUnits;

    public Resell(int units, int returnUnits, int returnValue) {
        this.units = units;
        this.returnUnits = returnUnits;
        this.returnValue = returnValue;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public int getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(int returnValue) {
        this.returnValue = returnValue;
    }

    public double getTotalUnits() {
        return totalUnits;
    }

    public void setTotalUnits(double totalUnits) {
        this.totalUnits = totalUnits;
    }

    @Override
    public String toString() {
        int resellCount = this.absoluteResellValue(this.units, this.returnUnits, this.returnValue, this.units);
        return "Resell{" +
                "units=" + units +
                ", returnValue=" + returnValue +
                ", totalUnits=" + totalUnits +
                ", resellCount=" + resellCount +
                '}';
    }
    public int absoluteResellValue(int units, int returnUnits, int returnValue, double count) {
        if(returnUnits < 1) return units;
        int remainingUnits = units % returnUnits;
        int retCount = (returnValue * (units / returnUnits));
        if ((remainingUnits + retCount) < returnUnits) return (int)(count + retCount);
        return this.absoluteResellValue(remainingUnits + retCount, returnUnits, returnValue, count + retCount);
    }
}
