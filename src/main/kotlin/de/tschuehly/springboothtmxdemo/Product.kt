package de.tschuehly.springboothtmxdemo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Product(
    @Id
    @GeneratedValue
    val id: Long,
    var name: String,
    var price: Double
) {
}
