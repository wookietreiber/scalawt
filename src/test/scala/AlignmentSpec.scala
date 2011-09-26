/* **************************************************************************
 *                                                                          *
 *  Copyright (C)  2011  Christian Krause                                   *
 *                                                                          *
 *  Christian Krause <kizkizzbangbang@googlemail.com>                       *
 *                                                                          *
 ****************************************************************************
 *                                                                          *
 *  This file is part of 'scalawt'.                                         *
 *                                                                          *
 *  This project is free software: you can redistribute it and/or modify    *
 *  it under the terms of the GNU General Public License as published by    *
 *  the Free Software Foundation, either version 3 of the License, or       *
 *  any later version.                                                      *
 *                                                                          *
 *  This project is distributed in the hope that it will be useful,         *
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of          *
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the           *
 *  GNU General Public License for more details.                            *
 *                                                                          *
 *  You should have received a copy of the GNU General Public License       *
 *  along with this project. If not, see <http://www.gnu.org/licenses/>.    *
 *                                                                          *
 ****************************************************************************/


package scalawt

import Alignment._
import org.specs2._

class AlignmentSpec extends Specification { def is =

  // -----------------------------------------------------------------------
  // fragments
  // -----------------------------------------------------------------------

  "Alignment specification"                                                   ^
                                                                             p^
  "Horizontal alignments should include"                                      ^
    "Left"                        ! horizontal(Left)                          ^
    "Center"                      ! horizontal(Center)                        ^
    "Right"                       ! horizontal(Right)                         ^
                                                                             p^
  "Vertical alignments should include"                                        ^
    "Top"                         ! vertical(Top)                             ^
    "Center"                      ! vertical(Center)                          ^
    "Bottom"                      ! vertical(Bottom)                          ^
                                                                             p^
  "Text alignments should include"                                            ^
    "Left"                        ! text(Left)                                ^
    "Center"                      ! text(Center)                              ^
    "Right"                       ! text(Right)                               ^
    "Justified"                   ! text(Justified)                           ^
    "Leading"                     ! text(Leading)                             ^
    "Trailing"                    ! text(Trailing)                            ^
                                                                             p^
  "Directions should include"                                                 ^
    "Top"                         ! direction(Top)                            ^
    "Bottom"                      ! direction(Bottom)                         ^
    "Left"                        ! direction(Left)                           ^
    "Right"                       ! direction(Right)                          ^
    "TopLeft"                     ! direction(TopLeft)                        ^
    "TopRight"                    ! direction(TopRight)                       ^
    "BottomLeft"                  ! direction(BottomLeft)                     ^
    "BottomRight"                 ! direction(BottomRight)                    ^
                                                                             p^
  "Directions should have correct opposites"                                  ^
    "Top         -> Bottom"       ! opposite(Top,         Bottom)             ^
    "Bottom      -> Top"          ! opposite(Bottom,      Top)                ^
    "Left        -> Right"        ! opposite(Left,        Right)              ^
    "Right       -> Left"         ! opposite(Right,       Left)               ^
    "TopLeft     -> BottomRight"  ! opposite(TopLeft,     BottomRight)        ^
    "BottomRight -> TopLeft"      ! opposite(BottomRight, TopLeft)            ^
    "TopRight    -> BottomLeft"   ! opposite(TopRight,    BottomLeft)         ^
    "BottomLeft  -> TopRight"     ! opposite(BottomLeft,  TopRight)           ^
                                                                            end
  // -----------------------------------------------------------------------
  // tests
  // -----------------------------------------------------------------------

  def text(a: Alignment)       = a must beLike { case x: Text       => ok }
  def direction(a: Alignment)  = a must beLike { case x: Direction  => ok }
  def horizontal(a: Alignment) = a must beLike { case x: Horizontal => ok }
  def vertical(a: Alignment)   = a must beLike { case x: Vertical   => ok }

  def opposite(a: Direction, b: Direction) = a.opposite must_== b

}
