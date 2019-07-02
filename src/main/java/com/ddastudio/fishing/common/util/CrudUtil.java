package com.ddastudio.fishing.common.util;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.Record;
import org.jooq.impl.TableImpl;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@Slf4j
@RequiredArgsConstructor
public class CrudUtil {

    private final DSLContext dslContext;

//    public <T extends TableImpl> void create(T t) {
//
//        Record record = dslContext.newRecord(t);
//
//        Field<?>[] fields = record.fields();
//        Arrays.stream(fields).filter(k -> k.)
//
//
//    }





}
