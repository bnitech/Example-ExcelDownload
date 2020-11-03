package com.bnitech.study.demo.dto;

import com.bnitech.study.demo.module.dto.ExcelDto;
import com.github.ckpoint.toexcel.annotation.ExcelHeader;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CarExcelDto extends ExcelDto {

    @ExcelHeader(headerName = "회사")
    private String company; // 회사

    @ExcelHeader(headerName = "차종")
    private String name; // 차종

    @ExcelHeader(headerName = "가격")
    private int price; // 가격

    @ExcelHeader(headerName = "평점")
    private double rating; // 평점

    private List<UserDto> userList;

    @Override
    public void setExcelHeader(com.bnitech.study.demo.module.ExcelHeader excelHeader) {
        this.excelHeader = excelHeader;
    }

    @Override
    public int getExcelValue() {
        return 0;
    }
}
