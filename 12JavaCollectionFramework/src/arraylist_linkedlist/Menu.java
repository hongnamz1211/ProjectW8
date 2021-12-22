package arraylist_linkedlist;

public class Menu {
    public static void main(String[] args) {
        Product p1 = new Product(4,"A1",10000);
        Product p2 = new Product(3,"A2",2000);
        Product p3 = new Product(2,"A3",3000);
        Product p4 = new Product(1,"A4",4000);

        ProductManager productManager = new ProductManager();
        productManager.add(p1);
        productManager.add(p2);
        productManager.add(p3);
        productManager.add(p4);
        System.out.println("Array product: ");
        productManager.display();
        productManager.del(2);
        System.out.println("Array product after delete product: ");
        productManager.display();
        productManager.changeProduct(3,"A20",50000);
        System.out.println("Array product after change product: ");
        productManager.display();
        System.out.println("Product has name is: ");
        productManager.searchProduct("A0");
        System.out.println("Array product after decrease: ");
        productManager.decreaseArray();
        productManager.display();
        System.out.println("Array product after increase: ");
        productManager.increaseArray();
        productManager.display();
    }
}
