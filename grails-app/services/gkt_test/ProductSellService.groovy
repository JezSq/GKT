package gkt_test

import grails.gorm.services.Service

@Service(ProductSell)
interface ProductSellService {

    ProductSell get(Serializable id)

    List<ProductSell> list(Map args)

    Long count()

    void delete(Serializable id)

    ProductSell save(ProductSell productSell)

}