package utils

import org.apache.poi.hssf.usermodel.HSSFWorkbook
import org.apache.poi.ss.usermodel.{Cell, DataFormatter, Row, WorkbookFactory}
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import java.io.{File, FileInputStream}
import scala.collection.convert.ImplicitConversions.`iterable AsScalaIterable`

class Excel_Reader {

  def getTestData(filePath : String): Array[String] = {

//    val TestDataSheetPath = "C:\\Users\\pritam\\IdeaProjects\\Experiment2\\src\\TestData\\test3.xlsx"
    val myData = new File(filePath)

    val file = new FileInputStream(myData)

    val myWorkbook = new XSSFWorkbook(file)

    val mySheet = myWorkbook.getSheetAt(0)
    var len = mySheet.getLastRowNum
    var num = len +1
    println("Number of elements are : "+num)
    var names : Array[String] = new Array[String](len+1)

    for(i <- 0 to len) {
      names(i) = mySheet.getRow(i).getCell(0).getStringCellValue
    }
   return names

  }
}




