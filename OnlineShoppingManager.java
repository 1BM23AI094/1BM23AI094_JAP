package BMSCE_1BM23AI102;

import java.util.*;

class Product{
    String name;
    int price;
    String category;

    Product(String name,int price,String category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

public class OnlineShoppingManager {
    Vector<Product> inventory = new Vector<>();;

//    OnlineShoppingManger(){
//        inventory = new Vector<>();
//    }

    public void addProduct(String name,int price,String category){
        Product newProduct = new Product(name,price,category);
        inventory.add(newProduct);
        System.out.println("product added: " + name);
    }

    public void removeProduct(String name){
        for(int i = 0;i<inventory.size();i++){
            Product product = inventory.get(i);
            if(product.name == name){
                inventory.remove(i);
            }
        }
        System.out.println(name + "is removed");
    }

    public void displayProduct(){
        for(int i = 0;i<inventory.size();i++){
            Product product = inventory.get(i);
            System.out.println("product"+ (i+1) +"name : " + product.name);
            System.out.println("product"+ (i+1) +"price : " + product.price);
            System.out.println("product"+ (i+1) +"category : " + product.category);
        }
    }

    public static void main(String[] args){

        OnlineShoppingManager obj = new OnlineShoppingManager();

        obj.addProduct("pen",10,"ballpoint pen");
        obj.displayProduct();
    }
}

//product added: pen
//product1name : pen
//product1price : 10
//product1category : ballpoint pen
//
//Process finished with exit code 0