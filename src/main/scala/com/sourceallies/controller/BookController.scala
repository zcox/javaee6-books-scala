package com.sourceallies.controller

import javax.ejb._
import javax.faces.bean._

import com.sourceallies.model._
import com.sourceallies.ejb._

@ManagedBean
@RequestScoped
class BookController {
  @EJB
  private var ejb: BookEjb = _
  
  private val book = new Book
  
  def getBook = book
  
  def getBookList = ejb.readAll
  
  def doNew() = "newBook.xhtml"

  def doCreateBook() = {
    ejb create book
    "listBooks.xhtml"
  }
}
