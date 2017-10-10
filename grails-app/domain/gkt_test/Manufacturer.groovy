package gkt_test

class Manufacturer {

    String name

    static hasMany = [products: Product]

    static constraints = {
        name(maxSize: 50)
    }

    String toString() {
        return name
    }
}
