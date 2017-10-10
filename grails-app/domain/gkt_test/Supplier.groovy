package gkt_test

class Supplier {

    String name

    static hasMany = [replenishes: ProductReplenish]

    static constraints = {
        name(maxSize: 50)
        replenishes(display: false)
    }

    String toString() {
        return name
    }
}
