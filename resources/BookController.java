@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping("/api/book")
public class BookController {

    public ResponseEntity<List<Book>> getAllBooks() {
        bookService.findAll();
        ResponseEntity.ok(books);
    }

    public ResponseEntity<Book> getBookById() {
        bookService.findById(id);
        book.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
        book.map(ResponseEntity::ok);
        ResponseEntity.notFound();
        ResponseEntity.notFound().build();
    }

    public ResponseEntity<Book> createBook() {
        bookService.save(book);
        ResponseEntity.ok(savedBook);
    }

    public ResponseEntity<Book> updateBook() {
        bookService.findById(id);
        existing.isEmpty();
        ResponseEntity.notFound().build();
        ResponseEntity.notFound();
        book.setId(id);
        bookService.save(book);
        ResponseEntity.ok(updatedBook);
    }

    public ResponseEntity<Void> deleteBook() {
        bookService.existsById(id);
        ResponseEntity.notFound();
        ResponseEntity.notFound().build();
        bookService.deleteById(id);
        ResponseEntity.noContent().build();
        ResponseEntity.noContent();
    }
}
