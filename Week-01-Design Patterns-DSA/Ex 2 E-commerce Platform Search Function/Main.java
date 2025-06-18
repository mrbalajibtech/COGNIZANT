public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Fashion"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "Shirt", "Fashion"),
            new Product(105, "Mouse", "Electronics")
        };
        System.out.println("🔍 Linear Search:");
        Product linearResult = Search.linearSearch(products, "Keyboard");
        if (linearResult != null)
            System.out.println("Found: " + linearResult);
        else
            System.out.println("Product not found");
        Search.sortProductsByName(products);
        System.out.println("\n🔍 Binary Search:");
        Product binaryResult = Search.binarySearch(products, "Keyboard");
        if (binaryResult != null)
            System.out.println("Found: " + binaryResult);
        else
            System.out.println("Product not found");
    }
}
