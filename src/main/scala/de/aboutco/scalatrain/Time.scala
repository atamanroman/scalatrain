package de.about.scalatrain

object Time {
  def fromMinutes(minutes: Int): Time = {
    require(minutes >= 0, "minutes must be positive")
    new Time(minutes / 60, minutes % 60)
  }
}

case class Time(hours: Int = 0, minutes: Int = 0) {
  lazy val asMinutes: Int = minutes + 60 * hours

  def -(that: Time) : Int = {
    this.asMinutes - that.asMinutes
  }
}
