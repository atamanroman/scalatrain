package de.about.scalatrain

import org.specs2.mutable._


class TrainSpec extends Specification {
  "Creating a Train should" in {
    "throw an IAE for a null kind" >> {
      new Train(null, "number") must throwA[IllegalArgumentException]
    }
    "throw an IAE for a null number" in {
      new Train("kind", null) must throwA[IllegalArgumentException]
    }
  }
}
