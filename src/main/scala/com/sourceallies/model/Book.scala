package com.sourceallies.model

import javax.persistence._
import scala.reflect._

@Entity
@NamedQuery{val name = "findAllBook", val query = "SELECT b FROM Book b"}
class Book {
  @Id
  @GeneratedValue{val strategy = GenerationType.IDENTITY}
  @BeanProperty
  var id: Long = _
  
  @Column{val nullable = false}
  @BeanProperty
  var title: String = _
  
  @BeanProperty
  var price: Float = _
  
  @Column{val length = 2000}
  @BeanProperty
  var description: String = _
  
  @BeanProperty
  var isbn: String = _
  
  @BeanProperty
  var nbOfPage: Int = _
  
  @BeanProperty
  var illustrations: Boolean = _
}