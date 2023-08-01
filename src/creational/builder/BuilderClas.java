package src.creational.builder;

class Product {
    private String name;
    private String brand;
    private String size;
    private int weight;
    private int price;


    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getSize() {
        return this.size;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getPrice() {
        return this.price;
    }
}

class ProductBuilder {
    private final Product product;

    public ProductBuilder() {
        this.product = new Product();
    }

    public ProductBuilder withName(String name) {
        this.product.setName(name);
        return this;
    }

    public ProductBuilder withBrand(String brand) {
        this.product.setBrand(brand);
        return this;
    }

    public ProductBuilder withSize(String size) {
        this.product.setSize(size);
        return this;
    }

    public ProductBuilder withWeight(int weight) {
        this.product.setWeight(weight);
        return this;
    }

    public ProductBuilder withPrice(int price) {
        this.product.setPrice(price);
        return this;
    }

    public Product build() {
        return this.product;
    }
}

class BuilderClass {
    public static void main(String[] args) {
        Product product = new ProductBuilder()
                .withName("Soap")
                .withBrand("Lux")
                .build();

        System.out.println(product.getName() + " : " + product.getBrand());
    }
}