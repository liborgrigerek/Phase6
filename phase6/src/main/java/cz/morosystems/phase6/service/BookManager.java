package cz.morosystems.phase6.service;

import java.util.List;

import cz.morosystems.phase6.entity.BookEntity;
import cz.morosystems.phase6.entity.UserEntity;

public interface BookManager {
	public BookEntity getBook(Integer bookId);
    public List<BookEntity> getAllBooks(Integer userId);
    public void addBook(BookEntity book);
    public void editBook(BookEntity book);
    public void deleteBook(Integer bookId);
}
