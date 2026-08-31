
package com.example.shareholder_management.shareholder;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShareholderRepository extends JpaRepository<Shareholder, String> {
    boolean existsByFolioBo(String folioBo);
}