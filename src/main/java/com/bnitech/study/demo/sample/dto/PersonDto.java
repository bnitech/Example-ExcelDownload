package com.bnitech.study.demo.sample.dto;

import com.bnitech.study.demo.module.annotation.BlankField;
import com.bnitech.study.demo.module.annotation.Field;
import com.bnitech.study.demo.module.annotation.Sheet;
import com.bnitech.study.demo.module.enumeration.ExcelSheetTheme;
import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
@Sheet(excelSheetTheme = ExcelSheetTheme.WHITE)
public class PersonDto {

    private long id;

    @Field
    private String name;

    @BlankField
    private boolean none;

    @Field
    private String company;

    @Field(name = "급여")
    private int salary;
}