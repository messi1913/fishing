package com.ddastudio.fishing;

import com.ddastudio.fishing.accounts.domain.AccountRepository;
import com.ddastudio.fishing.common.util.BeanUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FishingApplicationTests {

    @Test
    public void contextLoads() {

        BeanUtil.getBean(AccountRepository.class);

    }

}
