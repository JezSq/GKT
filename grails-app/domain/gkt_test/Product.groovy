package gkt_test

class Product {

    String name
    Double price
    String barcode
    String description
    Integer quantity
    static hasMany = [sells: ProductSell, replenishes: ProductReplenish]
    static belongsTo = [category:Category]

    static constraints = {
        name(maxSize: 50)
        price(nullable: true)
        barcode(nullable: true, maxSize: 15)
        description(nullable: true)
        quantity(nullable: true)
    }
}
