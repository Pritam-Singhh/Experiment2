package utils

import java.io.{File, FileInputStream}
import java.util.Properties

class PropertyReader
{
  def getProperty(): Properties =
  {
    val file = new FileInputStream(("C:\\Users\\pritam\\IdeaProjects\\Experiment2\\src\\main\\scala\\config.properties"))
    val prop = new Properties()
    prop.load(file)
//     var TestDataPath = prop.getProperty("TestDataPath")
    return prop
  }
}
