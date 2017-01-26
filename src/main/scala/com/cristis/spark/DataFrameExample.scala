package com.cristis.spark

import org.apache.spark.sql.{DataFrame, SQLContext}
import org.apache.spark.{SparkConf, SparkContext}

/** ***********************************************************************
  * Copyright (c) Metabiota Incorporated - All Rights Reserved
  * ------------------------------------------------------------------------
  * This material is proprietary to Metabiota Incorporated. The 
  * intellectual and technical concepts contained herein are proprietary
  * to Metabiota Incorporated. Reproduction or distribution of this
  * material, in whole or in part, is strictly forbidden unless prior 
  * written permission is obtained from Metabiota Incorporated.
  * ************************************************************************/

/**
  * Created by cristian.schuszter on 2017-01-26.
  */
object DataFrameReadExample {
  def main(args: Array[String]) : Unit = {
    val conf = new SparkConf().setAppName("spark-example").setMaster("local[2]")
    val sc = new SparkContext(conf)
    val sqlContext = new SQLContext(sc)

    val dfEx = new DataFrameExample(sqlContext)
    val readDf = dfEx.readParquetDf()
    readDf.show()
  }

}


class DataFrameExample(sql: SQLContext) {

  val ParquetPath = "C:\\Users\\cristian.schuszter\\Desktop\\test-csv\\processing_line_metadata_SQL_INVALID\\processing_line_metadata.csv"

  def readParquetDf(path: Option[String] = None): DataFrame =
    path match {
      case Some(p) => sql.read.parquet(p)
      case None => sql.read.parquet(ParquetPath)
  }
}