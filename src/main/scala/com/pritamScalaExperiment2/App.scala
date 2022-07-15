package com.pritamScalaExperiment2

import utils.{Excel_Reader, PropertyReader}

import java.util
import java.util.Collections

object App  {
  def main(args: Array[String]): Unit = {
    var obj = new Excel_Reader
    var prop = new PropertyReader

    var data = obj.getTestData(prop.getProperty().getProperty("TestDataPath"))

    for(i <- 0 until  data.length)
    {
      println(data(i))
    }
    println("*********************")
    println("Distinct elements from our fetched data")
    val result = data.distinct
    for(i <- 0 until result.length )
      println(result(i))

  }



}
