package gkt_test

class Product {

    String name
    Double price
    String barcode
    String description
    Integer quantity
    static hasMany = [sells: ProductSell, replenishes: ProductReplenish]
    static belongsTo = [category: Category, manufacturer: Manufacturer]

    static constraints = {
        name(maxSize: 50)
        price(nullable: true)
        barcode(nullable: true, maxSize: 15)
        description(nullable: true)
        quantity(nullable: true)
        sells(display: false)
        replenishes(display: false)
        category(nullable: true)
        manufacturer(nullable: true)
    }

    String toString(){
        return name
    }
}
