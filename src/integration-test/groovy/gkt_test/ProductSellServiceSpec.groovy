package gkt_test

import grails.test.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ProductSellServiceSpec extends Specification {

    ProductSellService productSellService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ProductSell(...).save(flush: true, failOnError: true)
        //new ProductSell(...).save(flush: true, failOnError: true)
        //ProductSell productSell = new ProductSell(...).save(flush: true, failOnError: true)
        //new ProductSell(...).save(flush: true, failOnError: true)
        //new ProductSell(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //productSell.id
    }

    void "test get"() {
        setupData()

        expect:
        productSellService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ProductSell> productSellList = productSellService.list(max: 2, offset: 2)

        then:
        productSellList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        productSellService.count() == 5
    }

    void "test delete"() {
        Long productSellId = setupData()

        expect:
        productSellService.count() == 5

        when:
        productSellService.delete(productSellId)
        sessionFactory.currentSession.flush()

        then:
        productSellService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ProductSell productSell = new ProductSell()
        productSellService.save(productSell)

        then:
        productSell.id != null
    }
}
