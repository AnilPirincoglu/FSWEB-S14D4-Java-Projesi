import product.Bread;
import product.Chocolate;
import product.Coke;
import product.ProductForSale;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products=new ProductForSale[3];
        products[0]=new Chocolate("high quality",100,"so good",75);
        products[1]=new Coke("Coca",50,"too good",Boolean.TRUE);
        products[2]=new Bread("Diet",20,"so ligth","big");
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product:products){
            if(product!= null){
                product.showDetails();
            }
        }
    }
}