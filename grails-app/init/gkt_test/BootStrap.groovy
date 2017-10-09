package gkt_test

class BootStrap {

    def init = { servletContext ->
        new Category(name: 'Phones').save()
        new Product(name: 'Samsung S8', price:  800, barcode: 'ZZ44HH22', description: 'Lorem ipsum', category: 1).save()
        new Supplier(name: 'Apple').save()
        new Customer(name: 'John Doe').save()
        new ProductReplenish(product:1, supplier: 1, quantity: 15, date: 0).save()
        new ProductSell(product:1, customer: 1, quantity: 5, date: 0).save()
    }
    def destroy = {
    }
}
