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
import org.specs2.mutable._

class AlignmentSpec extends Specification {

  // -----------------------------------------------------------------------
  // category specifications
  // -----------------------------------------------------------------------

  "Direction" should {
    "include Top"         in { Top         must beLike { case x: Direction => ok } }
    "include Bottom"      in { Bottom      must beLike { case x: Direction => ok } }
    "include Left"        in { Left        must beLike { case x: Direction => ok } }
    "include Right"       in { Right       must beLike { case x: Direction => ok } }
    "include TopLeft"     in { TopLeft     must beLike { case x: Direction => ok } }
    "include TopRight"    in { TopRight    must beLike { case x: Direction => ok } }
    "include BottomLeft"  in { BottomLeft  must beLike { case x: Direction => ok } }
    "include BottomRight" in { BottomRight must beLike { case x: Direction => ok } }
  }

  "Horizontal" should {
    "include Left"   in { Left   must beLike { case x: Horizontal => ok } }
    "include Center" in { Center must beLike { case x: Horizontal => ok } }
    "include Right"  in { Right  must beLike { case x: Horizontal => ok } }
  }

  "Vertical" should {
    "include Top"    in { Top    must beLike { case x: Vertical => ok } }
    "include Center" in { Center must beLike { case x: Vertical => ok } }
    "include Bottom" in { Bottom must beLike { case x: Vertical => ok } }
  }

  "Text" should {
    "include Left"      in { Left      must beLike { case x: Text => ok } }
    "include Center"    in { Center    must beLike { case x: Text => ok } }
    "include Right"     in { Right     must beLike { case x: Text => ok } }
    "include Justified" in { Justified must beLike { case x: Text => ok } }
    "include Leading"   in { Leading   must beLike { case x: Text => ok } }
    "include Trailing"  in { Trailing  must beLike { case x: Text => ok } }
  }

  // -----------------------------------------------------------------------
  // opposite direction specification
  // -----------------------------------------------------------------------

  "Direction opposites" should {
    "work for Top"         in { Top.         opposite must_== Bottom      }
    "work for Bottom"      in { Bottom.      opposite must_== Top         }
    "work for Left"        in { Left.        opposite must_== Right       }
    "work for Right"       in { Right.       opposite must_== Left        }
    "work for TopLeft"     in { TopLeft.     opposite must_== BottomRight }
    "work for BottomRight" in { BottomRight. opposite must_== TopLeft     }
    "work for TopRight"    in { TopRight.    opposite must_== BottomLeft  }
    "work for BottomLeft"  in { BottomLeft.  opposite must_== TopRight    }
  }
}
