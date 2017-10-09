package gkt_test

import grails.gorm.services.Service

@Service(ProductReplenish)
interface ProductReplenishService {

    ProductReplenish get(Serializable id)

    List<ProductReplenish> list(Map args)

    Long count()

    void delete(Serializable id)

    ProductReplenish save(ProductReplenish productReplenish)

}