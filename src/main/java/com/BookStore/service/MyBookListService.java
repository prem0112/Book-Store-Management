package com.BookStore.service;

import com.BookStore.entity.MyBookList;
import com.BookStore.repository.MyBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {

    @Autowired
    private MyBookRepository mybook;  // ✅ Injected here

    public void saveMyBooks(MyBookList book) {
        mybook.save(book);
        // ✅ Use repository to save
    }

    public List<MyBookList> getAllMyBookList() {
        return mybook.findAll();
    }
    public void deleteById(int id) {mybook.deleteById(id);}

}

