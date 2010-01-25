package com.sourceallies.model

import javax.persistence._
import scala.reflect._

/** Defines an id field for entities to use as a primary key. */
trait Id {
  @javax.persistence.Id
  @GeneratedValue{val strategy = GenerationType.IDENTITY}
  @BeanProperty
  var id: Long = _
}
