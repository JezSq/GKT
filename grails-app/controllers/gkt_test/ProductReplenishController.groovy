package gkt_test

import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.*

class ProductReplenishController {

    ProductReplenishService productReplenishService

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond productReplenishService.list(params), model:[productReplenishCount: productReplenishService.count()]
    }

    def show(Long id) {
        respond productReplenishService.get(id)
    }

    def create() {
        respond new ProductReplenish(params)
    }

    def save(ProductReplenish productReplenish) {
        if (productReplenish == null) {
            notFound()
            return
        }

        try {
            productReplenishService.save(productReplenish)
        } catch (ValidationException e) {
            respond productReplenish.errors, view:'create'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'productReplenish.label', default: 'ProductReplenish'), productReplenish.id])
                redirect productReplenish
            }
            '*' { respond productReplenish, [status: CREATED] }
        }
    }

    def edit(Long id) {
        respond productReplenishService.get(id)
    }

    def update(ProductReplenish productReplenish) {
        if (productReplenish == null) {
            notFound()
            return
        }

        try {
            productReplenishService.save(productReplenish)
        } catch (ValidationException e) {
            respond productReplenish.errors, view:'edit'
            return
        }

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'productReplenish.label', default: 'ProductReplenish'), productReplenish.id])
                redirect productReplenish
            }
            '*'{ respond productReplenish, [status: OK] }
        }
    }

    def delete(Long id) {
        if (id == null) {
            notFound()
            return
        }

        productReplenishService.delete(id)

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'productReplenish.label', default: 'ProductReplenish'), id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'productReplenish.label', default: 'ProductReplenish'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
