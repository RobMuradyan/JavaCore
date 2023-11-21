package Homework1.onlineStore.storage;

import Homework1.onlineStore.Model.Product;
import Homework1.onlineStore.util.StorageSerializeUtil;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;


public class ProductStorage implements Serializable {

    private Set<Product> products = new HashSet<>();



    public void add(Product product) {
        products.add(product);
        StorageSerializeUtil.serializeProductStorage(this);
    }

    public Product getById(String id) {
        for (Product product : products) {
            if (product.getId().equals(id)){
                return product;

        }

        }
        return null;
    }

    public void print() {
        for (Product product : products) {
            System.out.println(product);

        }
          }
    }



