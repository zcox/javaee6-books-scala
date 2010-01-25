package com.sourceallies.ejb

import javax.ejb._
import javax.persistence._

import com.sourceallies.model._

@Stateless
@LocalBean
class BookEjb extends CrudEjb[Book]

/*@Stateless
@LocalBean
class BookEjb {
  @PersistenceContext{val unitName = "book"}
  private var manager: EntityManager = _

  def findBooks: java.util.List[_] = manager createNamedQuery "findAllBooks" getResultList

  def createBook(book: Book) = { 
    manager persist book
    book
  }
}*/
