package cz.morosystems.phase6.dao;

import java.util.List;

import cz.morosystems.phase6.entity.BookEntity;
import cz.morosystems.phase6.entity.UserEntity;

public interface BookDAO {
	public BookEntity getBook(Integer bookId);
    public void addBook(BookEntity book);
    public void editBook(BookEntity book);
    public void deleteBook(Integer bookId);
}