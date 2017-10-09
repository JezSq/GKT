package gkt_test

class ProductReplenish {
    Integer quantity
    Date date

    static belongsTo = [product: Product, supplier: Supplier]

    static constraints = {
        quantity()
        date()
    }
}
