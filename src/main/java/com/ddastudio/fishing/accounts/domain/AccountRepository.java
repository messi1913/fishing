package com.ddastudio.fishing.accounts.domain;

import com.ddastudio.fishing.common.Constants;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Integer> {

    Optional<Account> findByPhoneNoAndAuditUseYn(String phoneNo, String useYn);
}
