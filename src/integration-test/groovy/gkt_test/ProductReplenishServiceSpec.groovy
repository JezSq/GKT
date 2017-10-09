package gkt_test

import grails.test.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ProductReplenishServiceSpec extends Specification {

    ProductReplenishService productReplenishService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ProductReplenish(...).save(flush: true, failOnError: true)
        //new ProductReplenish(...).save(flush: true, failOnError: true)
        //ProductReplenish productReplenish = new ProductReplenish(...).save(flush: true, failOnError: true)
        //new ProductReplenish(...).save(flush: true, failOnError: true)
        //new ProductReplenish(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //productReplenish.id
    }

    void "test get"() {
        setupData()

        expect:
        productReplenishService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ProductReplenish> productReplenishList = productReplenishService.list(max: 2, offset: 2)

        then:
        productReplenishList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        productReplenishService.count() == 5
    }

    void "test delete"() {
        Long productReplenishId = setupData()

        expect:
        productReplenishService.count() == 5

        when:
        productReplenishService.delete(productReplenishId)
        sessionFactory.currentSession.flush()

        then:
        productReplenishService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ProductReplenish productReplenish = new ProductReplenish()
        productReplenishService.save(productReplenish)

        then:
        productReplenish.id != null
    }
}
