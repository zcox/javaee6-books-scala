package com.sourceallies.model

import javax.persistence._
import scala.reflect._

/** Defines a description field for entities. */
trait Description {
  @Column{val length = 2000}
  @BeanProperty
  var description: String = _
}
