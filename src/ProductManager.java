public class ProductManager {
    public void add(Product product) {
        ProductValidator validator = new ProductValidator();
        if(validator.isValid(product)){
                System.out.println("eklendi");
        }
        else {
            System.out.println("ürün bilgileri geçersizdir ");
        }


    }
    //manager sınıfları static yapılmaz
    // kullan bırak yardımcı araçlar static yapılır
}
