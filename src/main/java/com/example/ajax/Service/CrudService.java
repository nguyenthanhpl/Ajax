package com.example.ajax.Service;

import com.example.ajax.Model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudService {
    @Autowired
    private CrudRepository crudRepository;

    public List<Company> getCompanyList() {
        return (List<Company>) crudRepository.findAll();
    }

    public Company getCompanyById(Integer id) {
        return (Company) crudRepository.findById(id).get();
    }

    public void saveOrUpdateCompany(Company company) {
        crudRepository.save(company);
    }

    public void deleteCompany(Integer id) {
        crudRepository.deleteById(id);
    }
}
