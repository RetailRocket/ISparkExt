package ru.retailrocket.ispark


case class PNGFile(data: String) extends org.tribbloid.ispark.display.PNGDisplayObject {
  def toPNG = data
}
