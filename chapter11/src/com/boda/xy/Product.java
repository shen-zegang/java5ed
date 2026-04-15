package com.boda.xy;
import java.util.Objects;
public record Product(Integer id ,String name, String brand, double price) {
    public Product(Integer id) {
    	this(id,"","",0.0);
    }

	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return Double.compare(price, product.price) == 0
				&& Objects.equals(id, product.id)
				&& Objects.equals(name, product.name)
				&& Objects.equals(brand, product.brand);
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, id, name, price);
	}

	@Override
	public String toString() {
		return "Product{" +
				"id=" + id +
				", name='" + name + '\'' +
				", brand='" + brand + '\'' +
				", price=" + price +
				'}';
	}
}
