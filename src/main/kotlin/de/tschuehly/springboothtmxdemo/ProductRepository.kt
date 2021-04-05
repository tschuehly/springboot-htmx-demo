package de.tschuehly.springboothtmxdemo

import org.springframework.data.jpa.repository.JpaRepository
interface ProductRepository : JpaRepository<Product,Long> {
}
