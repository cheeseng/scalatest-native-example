package com.test

import org.scalatest._

class ExampleSuite extends FunSuite {

  test("1 + 1 should equal 2") {
    assert(Adder.add(1, 1) == 2)
  }

}
