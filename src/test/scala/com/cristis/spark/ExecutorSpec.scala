package com.cristis.spark

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{Matchers, WordSpec}

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
@RunWith(classOf[JUnitRunner])
class ExecutorSpec extends WordSpec with Matchers {
  "ExecutorSpec.buildStr" when {
    "passed a valid int" should {
      "parse the string" in {
        val exec = new Executor()
        exec.buildStr(3) shouldBe "string 3"
        exec.buildStr(15) shouldBe  "string 15"
      }
    }
  }
}
