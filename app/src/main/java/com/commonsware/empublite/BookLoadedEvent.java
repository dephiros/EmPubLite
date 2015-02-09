package com.commonsware.empublite;

/**
 * Created by lyan on 2/8/15.
 */
public class BookLoadedEvent {
    private BookContents contents = null;

    public BookLoadedEvent(BookContents contents) {
        this.contents = contents;
    }

    public BookContents getBook() {
        return this.contents;
    }
}
