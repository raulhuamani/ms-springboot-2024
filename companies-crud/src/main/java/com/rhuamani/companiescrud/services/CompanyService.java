package com.rhuamani.companiescrud.services;

import com.rhuamani.companiescrud.entities.Company;

public interface CompanyService {

    Company create(Company company);
    Company readByName(String name);
    Company update(Company company, String name);
    void delete(String name);

}