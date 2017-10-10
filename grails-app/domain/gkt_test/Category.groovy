package gkt_test

class Category {

    String name

    static hasMany = [products: Product]

    static constraints = {
        name(maxSize: 30)
        products(display: false)
    }

    String toString(){
        return name
    }

}
