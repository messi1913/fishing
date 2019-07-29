package com.ddastudio.fishing.bank;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.hateoas.MediaTypes;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(value = "api/banks", produces = MediaTypes.HAL_JSON_UTF8_VALUE)
public class Controller {

}
