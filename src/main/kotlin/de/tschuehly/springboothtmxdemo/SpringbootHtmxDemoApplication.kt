package de.tschuehly.springboothtmxdemo

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootHtmxDemoApplication(
    val productRepository: ProductRepository
) : CommandLineRunner {
    override fun run(vararg args: String?) {
        productRepository.save(Product(1L,"Product 1", 500.0))
        productRepository.save(Product(2L,"Product 2", 500.0))
        productRepository.save(Product(3L,"Product 3", 500.0))
    }
}

fun main(args: Array<String>) {
    runApplication<SpringbootHtmxDemoApplication>(*args)
}
