package Entities;

public interface Products {
     void getaddInventory();
     void getprofabilitycalculator();
     boolean isSeasonalProduct();
     order_item getOrder(String id);
     String getAnylyzeFavouriteProduct(String id);

}
