package br.com.springkafka.domain

import org.hibernate.annotations.GenericGenerator
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
class Book {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    val id: String = ""

    var name: String? = null

    @ManyToOne
    var people: People? = null

    constructor()

    constructor(name: String, people: People) {
        this.name = name
        this.people = people
    }
}