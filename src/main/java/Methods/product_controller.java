package Methods;

import Entities.Customer;
import Entities.Customers;
import Entities.Products;
import Entities.order_item;

public class product_controller {
    private final Products repos;
    public product_controller(Products repos){
        this.repos=repos;
    }
    public String getAnylyzeFavouriteProduct(String id) {
        String order_item = repos.getAnylyzeFavouriteProduct(id);
        return "complite";
    }

        public String getOrder(String ID) {
           order_item product = repos.getOrder(ID);

            return (product == null ? "Product was not found!" : product.toString());
        }

    }
