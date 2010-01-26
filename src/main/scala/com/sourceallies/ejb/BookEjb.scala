package com.sourceallies.ejb

import javax.ejb._
import javax.persistence._
import com.sourceallies.model._

@Stateless
@LocalBean
class BookEjb extends CrudEjb[Book]

