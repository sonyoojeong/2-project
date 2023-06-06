package com.library.dto;

import com.library.entity.RentBook;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class RentBookDto {
    private String name;
    private String isbn;
    private int count;
    private String imageUrl;

    public RentBookDto(RentBook rentBook, String imageUrl) {
        this.name = rentBook.getBook().getBookName();
        this.isbn = rentBook.getBook().getIsbn();
        this.count = rentBook.getCount();
        this.imageUrl = imageUrl;
    }
}
