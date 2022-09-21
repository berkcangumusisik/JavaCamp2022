public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(); // Product classından bir nesne oluşturduk.
        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image1.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(7500);
        product2.setDiscount(7);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(7500);
        product3.setDiscount(7);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1, product2, product3};
        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer customer1 = new IndividualCustomer();
        customer1.setId(1);
        customer1.setPhone("0522222222222");
        customer1.setCustomerNumber("12345");
        customer1.setFirstName("Berkcan");
        customer1.setLastName("Gümüşışık");

        CorporateCustomer customer2 = new CorporateCustomer();
        customer2.setId(2);
        customer2.setPhone("0533333333333");
        customer2.setCustomerNumber("12345");
        customer2.setCompanyName("Kodlama.io");
        customer2.setTaxNumber("1234567890");

        Customer[] customers = {customer1, customer2};

    }
}

/**
 *  OOP Nesne Yönelimli Programlama demektir.
 *  Java neseye dayalı bir programlama dilidir.
 *  Nesne yönelimli programlama bizi kod tekrarından kurtarır.
 *  Tip değişken = new Tip();
 *  get = okumak
 *  set = yazmak
 *
 */