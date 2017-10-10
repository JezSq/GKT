package gkt_test

class Customer {

    String name

    static hasMany = [orders:ProductSell]

    static constraints = {
        name()
        orders(display: false)
    }

    String toString(){
        return name
    }

}
