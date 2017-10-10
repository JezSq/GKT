package gkt_test

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ProductSellController {

    ProductSellService productSellService
    CalculationsService calculationsService
    ProductService productService
    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond productSellService.list(params), model: [productSellCount: productSellService.count()]
    }

    def show(Long id) {
        respond productSellService.get(id)
    }

    def create() {
        respond new ProductSell(params)
    }

    def save(ProductSell productSell) {
        if (productSell == null) {
            notFound()
            return
        }

        try {
            productSellService.save(productSell)
            def productInstance = productService.get(productSell.productId)
            calculationsService.getTotalQuantity(productInstance)
        } catch (ValidationException e) {
            respond productSell.errors, view: 'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'productSell.label', default: 'ProductSell'), productSell.id])
                redirect productSell
            }
            '*' { respond productSell, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond productSellService.get(id)
    }

    def update(ProductSell productSell) {
        if (productSell == null) {
            notFound()
            return
        }

        try {
            productSellService.save(productSell)
            def productInstance = productService.get(productSell.productId)
            calculationsService.getTotalQuantity(productInstance)
        } catch (ValidationException e) {
            respond productSell.errors, view: 'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'productSell.label', default: 'ProductSell'), productSell.id])
                redirect productSell
            }
            '*' { respond productSell, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        productSellService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'productSell.label', default: 'ProductSell'), id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'productSell.label', default: 'ProductSell'), params.id])
                redirect action: "index", method: "GET"
            }
            '*' { render status: NOT_FOUND }
        }
    }
}
