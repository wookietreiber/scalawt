package scalax.scalawt

import org.specs2._

class ScaleSpec extends Specification { def is =

  // -----------------------------------------------------------------------
  // fragments
  // -----------------------------------------------------------------------

  "Scale DSL syntax should return a Scale with the right"                     ^
    "width"                       ! scalew16(16::10)                          ^
    "height"                      ! scaleh10(16::10)                          ^
                                                                            end
  // -----------------------------------------------------------------------
  // tests
  // -----------------------------------------------------------------------

  def scalew16(s: Scale) = s.w must_== 16
  def scaleh10(s: Scale) = s.h must_== 10

}
