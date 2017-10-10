package gkt_test

class ProductSell {

    Integer quantity
    Date date

    static belongsTo = [product: Product, customer: Customer]

    static constraints = {
        quantity()
        date()
        product()
        customer()
    }
}
