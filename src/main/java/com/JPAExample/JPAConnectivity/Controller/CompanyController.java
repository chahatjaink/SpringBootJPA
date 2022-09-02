package com.JPAExample.JPAConnectivity.Controller;

import com.JPAExample.JPAConnectivity.Repository.CompanyRepository;
import com.JPAExample.JPAConnectivity.Entity.Company;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class CompanyController {

    private CompanyRepository repo;

    public CompanyController(CompanyRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/")
    public String welcome() {
        return "<html><body>"
                + "<h1>WELCOME</h1>"
                + "</body></html>";
    }

    @GetMapping("/company")
    public List<Company> getAllNotes() {
        return repo.findAll();
    }

    @GetMapping("/company/{id}")
    public Company CompanyDetails(@PathVariable(value = "id") int id) {
//        return repo.findById(id);
        return null;
    }

    @PostMapping("/company")
    @ResponseStatus(HttpStatus.CREATED)
    public Company addCompany(@RequestBody Company company) {
        return repo.save(company);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCompany(@PathVariable(value = "id") int id) {
        repo.deleteById(id);
    }

//    @PutMapping("/company/{id}")
//    public ResponseEntity<Object> updateCompany(
//            @RequestBody Company company,
//            @PathVariable(value = "id") int id) {
//        Optional<Company> companyRepo = Optional.ofNullable(repo.findById(id));
//        if (!companyRepo.isPresent())
//            return ResponseEntity
//                    .notFound()
//                    .build();
//        company.setId(id);
//        repo.save(company);
//        return ResponseEntity
//                .noContent()
//                .build();
//    }
}