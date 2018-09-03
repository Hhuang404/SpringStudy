package com.hh.service;

import com.hh.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class BookService {
  @Autowired
  private BookDao bookDao;

  public void println(){
    System.out.println(bookDao.toString());
  }
}
