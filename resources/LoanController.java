@org.springframework.web.bind.annotation.RestController()
@org.springframework.web.bind.annotation.RequestMapping("/api/loan")
@RestController
@RequestMapping("/api/loan")
public class LoanController {

    @GetMapping
    public ResponseEntity<List<String>> getAllLoans() {
        // TODO: Replace with actual loan retrieval logic
        return ResponseEntity.ok(List.of());
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getLoanById(@PathVariable("id") Long id) {
        // TODO: Replace with actual loan retrieval logic
        return ResponseEntity.ok("");
    }

    @PostMapping
    public ResponseEntity<String> createLoan(@RequestBody String loanDto) {
        // TODO: Replace with actual loan creation logic
        return ResponseEntity.ok("");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateLoan(@PathVariable("id") Long id, @RequestBody String loanDto) {
        // TODO: Replace with actual loan update logic
        return ResponseEntity.ok("");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLoan(@PathVariable("id") Long id) {
        // TODO: Replace with actual loan deletion logic
        return ResponseEntity.noContent().build();
    }
}
