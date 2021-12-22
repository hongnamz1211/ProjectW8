package arraylist_linkedlist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ProductManager {
    ArrayList<Product> products = new ArrayList<>();

    public boolean add(Product product) {
        if (products.add(product)) {
            return true ;
        }
        return false;
    }

    public void changeProduct(int id, String name, int price) {
        for (Product pro :
                products) {
            if (pro.getID() == id) {
                pro.setName(name);
                pro.setPrice(price);
            }
        }
    }

    public void del(int id) {
        products.removeIf(product -> product.getID() == id);
    }

    public void searchProduct(String name) {
        for (Product pro :
                products) {
            if (pro.getName().equals(name)) {
                System.out.println(pro);
            }
        }
    }

    public void display() {
        for (Product product :
                products) {
            System.out.println("ID=" + product.getID() +
                    ", name='" + product.getName() + '\'' +
                    ", price=" + product.getPrice());

        }
    }

    public void decreaseArray() {
        Collections.sort(products, getComparator1());
    }

    public void increaseArray() {
        Collections.sort(products, getComparator());
    }

    @Override
    public String toString() {
        return "ProductManager{" + "arrayProduct=" + products + "}";
    }


    private Comparator<Product> getComparator() {
        return new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getPrice() > p2.getPrice()) {
                    return 1;
                } else {
                    if (p1.getPrice() == p2.getPrice()) {
                        return 0;
                    } else
                        return -1;
                }
            }
        };
    }

    private Comparator<Product> getComparator1() {
        return new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                if (p1.getPrice() < p2.getPrice()) {
                    return 1;
                } else {
                    if (p1.getPrice() == p2.getPrice()) {
                        return 0;
                    } else
                        return -1;
                }
            }
        };
    }


}
