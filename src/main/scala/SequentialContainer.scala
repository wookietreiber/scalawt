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

/** A container with a sequential order of components. */
trait SequentialContainer extends Container { self: Widget =>

  private val _components = ArrayBuffer[Component]()

  /** Returns the contained components. */
  override object components extends Buffer[Component] {

    /** Returns the amount of contained components. */
    final def length = _components.length

    /** Returns an iterator of the contained components. */
    final def iterator = _components.iterator

    /** Returns the `n`th component. */
    final def apply(n: Int) = _components(n)

    /** Replaces the `n`th component with the given one. */
    final def update(n: Int, c: Component) {
      if (!(_components exists { _ eq c })) {
        removeChild(apply(n))
        _components(n) = c
        addChild(c)
      }
    }

    /** Appends the given component. */
    final def +=(c: Component) = {
      if (!(_components exists { _ eq c })) {
        _components += c
        addChild(c)
      }
      this
    }

    /** Prepends the given component. */
    final def +=:(c: Component) = {
      if (!(_components exists { _ eq c })) {
        c +=: _components
        addChild(c)
      }
      this
    }

    /** Inserts the components at the given index. */
    final def insertAll(n: Int, cs: Traversable[Component]) {
      val actuallyNew = cs filterNot { _components contains _ }
      _components.insertAll(n, actuallyNew)
      actuallyNew foreach { addChild(_) }
    }

    /** Removes the `n`th component. */
    final def remove(n: Int) = {
      removeChild(apply(n))
      _components.remove(n)
    }

    /** Removes all components. */
    final def clear() {
      _components foreach { removeChild(_) }
      _components.clear()
    }
  }

}
