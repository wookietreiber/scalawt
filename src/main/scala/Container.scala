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

import collection.mutable.{ Buffer, ArrayBuffer }

/** Contains other widgets. */
trait Container extends Buffer[Component] {
  self: Widget =>

  // -----------------------------------------------------------------------
  // content management
  // -----------------------------------------------------------------------

  /** Returns the contained components. */
  object contents extends ArrayBuffer[Component]

  /** Returns an iterator of the contained components. */
  final def iterator = contents.iterator

  /** Returns the `n`th component. */
  final def apply(n: Int) = contents(n)

  /** Replaces the `n`th component with the given one. */
  final def update(n: Int, c: Component) {
    contents(n) = c
  }

  /** Returns the amount of contained components. */
  final def length = contents.length

  /** Appends the given component. */
  final def +=(c: Component) = {
    contents += c
    this
  }

  /** Prepends the given component. */
  final def +=:(c: Component) = {
    c +=: contents
    this
  }

  /** Inserts the components at the given index. */
  final def insertAll(n: Int, cs: Traversable[Component]) {
    contents.insertAll(n, cs)
  }

  /** Removes the `n`th component. */
  final def remove(n: Int) = contents.remove(n)

  /** Removes all components. */
  final def clear() = contents.clear()

}
