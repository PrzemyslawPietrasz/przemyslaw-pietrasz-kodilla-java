package com.kodilla.stream.invoice;

public final class SimpleProduct {
    private final String productName;
    private final double productPrice;

    public SimpleProduct(String productName, double productPrice) {

        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleProduct that = (SimpleProduct) o;

        return getProductName().equals(that.getProductName());
    }

    @Override
    public int hashCode() {
        return getProductName().hashCode();
    }
}

