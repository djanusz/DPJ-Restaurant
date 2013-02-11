/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class FoodBillModel {
    private FoodItemModel item = new FoodItemModel();
    private List<String> itemList = new ArrayList<String>();
    private String itemName;
    private double itemPrice;
    private double subtotal;
    private double tax;
    private double total;
    private double suggestedTip;
    private double grandTotal;
    private final double SALES_TAX = 0.055;
    private final double SUGGESTED_GRATUITY_PERCENTAGE = 0.15;
    

    public FoodBillModel(List<String> itemList) {
        this.itemList = itemList;
    }

    public List<String> getItemList() {
        return itemList;
    }

    public void setItemList(List<String> itemList) {
        this.itemList = itemList;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice(String itemName) {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getSubtotal() {
        for (String s: itemList) {
            subtotal = subtotal + item.getPrice(s);
        }
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTax(double subtotal) {
        tax = subtotal * SALES_TAX;
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double getTotal(double subtotal, double tax) {
        total = subtotal + tax;
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getSuggestedTip(double total) {
        suggestedTip = total * SUGGESTED_GRATUITY_PERCENTAGE;
        return suggestedTip;
    }

    public void setSuggestedTip(double suggestedTip) {
        this.suggestedTip = suggestedTip;
    }

    public double getGrandTotal(double total, double suggestedTip) {
        grandTotal = total + suggestedTip;
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.item != null ? this.item.hashCode() : 0);
        hash = 67 * hash + (this.itemList != null ? this.itemList.hashCode() : 0);
        hash = 67 * hash + (this.itemName != null ? this.itemName.hashCode() : 0);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.itemPrice) ^ (Double.doubleToLongBits(this.itemPrice) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.subtotal) ^ (Double.doubleToLongBits(this.subtotal) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.tax) ^ (Double.doubleToLongBits(this.tax) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.total) ^ (Double.doubleToLongBits(this.total) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.suggestedTip) ^ (Double.doubleToLongBits(this.suggestedTip) >>> 32));
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.grandTotal) ^ (Double.doubleToLongBits(this.grandTotal) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "FoodBillModel{" + "item=" + item + ", itemList=" + itemList + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", subtotal=" + subtotal + ", tax=" + tax + ", total=" + total + ", suggestedTip=" + suggestedTip + ", grandTotal=" + grandTotal + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FoodBillModel other = (FoodBillModel) obj;
        if (this.item != other.item && (this.item == null || !this.item.equals(other.item))) {
            return false;
        }
        if (this.itemList != other.itemList && (this.itemList == null || !this.itemList.equals(other.itemList))) {
            return false;
        }
        if ((this.itemName == null) ? (other.itemName != null) : !this.itemName.equals(other.itemName)) {
            return false;
        }
        if (Double.doubleToLongBits(this.itemPrice) != Double.doubleToLongBits(other.itemPrice)) {
            return false;
        }
        if (Double.doubleToLongBits(this.subtotal) != Double.doubleToLongBits(other.subtotal)) {
            return false;
        }
        if (Double.doubleToLongBits(this.tax) != Double.doubleToLongBits(other.tax)) {
            return false;
        }
        if (Double.doubleToLongBits(this.total) != Double.doubleToLongBits(other.total)) {
            return false;
        }
        if (Double.doubleToLongBits(this.suggestedTip) != Double.doubleToLongBits(other.suggestedTip)) {
            return false;
        }
        if (Double.doubleToLongBits(this.grandTotal) != Double.doubleToLongBits(other.grandTotal)) {
            return false;
        }
        return true; 
    }
    
//    public static void main(String[] args) {
//        List<String> items = new ArrayList<String>();
//        items.add("Steak");
//        items.add("Beer");
//        
//        FoodBillModel bill = new FoodBillModel(items);
//        double subTot =  bill.getSubtotal();
//        System.out.println(subTot);
        
        
//    }
    
}
