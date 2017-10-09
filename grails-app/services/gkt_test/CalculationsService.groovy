package gkt_test

import grails.gorm.transactions.Transactional

@Transactional
class CalculationsService {

    def getTotalQuantity(productInstance) {
        def totalSells = 0
        def totalReplenishes = 0
        productInstance.replenishes.each {
            totalReplenishes = totalReplenishes + it.quantity
        }

        productInstance.sells.each {
            totalSells = totalSells + it.quantity
        }

        productInstance.quantity = totalReplenishes - totalSells
        return productInstance
    }
}
