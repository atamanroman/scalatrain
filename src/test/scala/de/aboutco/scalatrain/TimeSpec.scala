package de.about.scalatrain

import org.specs2.mutable._
import org.scalacheck.Gen._

class TimeSpec extends Specification {
  "Calling fromMinutes" should {
    "throw an IAE for negative minutes" in {
      forall(List(Int.MinValue, -1337, -1)) {
        (minutes: Int) => Time fromMinutes minutes must throwA[IllegalArgumentException]
      }
    }
    "return a correctly initialized Time instance for minutes within [0, 24 * 60 - 1)" in {
      forall(0 to (24 * 60 - 1)) {
        (minutes: Int) => Time fromMinutes minutes must not beNull
      }
    }
  }
}
