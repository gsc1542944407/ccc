package com.baizhi;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@SpringBootTest
public class CmfzApplicationTests {


    @Test
    public void test1() throws IOException {
        //创建工作薄
        HSSFWorkbook workbook = new HSSFWorkbook();
        //创建工作表
        HSSFSheet sheet = workbook.createSheet("测试表");
        //创建标题行
        HSSFRow row = sheet.createRow(0);
        // String[] title = {"编号","姓名","生日"};
        //创建单元格对象
        HSSFCell cell = row.createCell(0);
        //给单元格赋值
        cell.setCellValue("第一个单元格");
        workbook.write(new FileOutputStream(new File("D:/a.xls")));
    }
}
