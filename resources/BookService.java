@org.springframework.stereotype.Service()
@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    public Book save(Book book) {
        return bookRepository.save(book);
    }

    public Book update(Long id, Book book) {
        return bookRepository.findById(id).map(existing -> {
            // Update fields as needed; adjust according to actual Book fields
            existing.setTitle(book.getTitle());
            existing.setAuthor(book.getAuthor());
            existing.setIsbn(book.getIsbn());
            existing.setPublishedDate(book.getPublishedDate());
            return bookRepository.save(existing);
        }).orElseThrow(() -> new IllegalArgumentException("Book with id " + id + " not found"));
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }
}
