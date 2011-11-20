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


package scalax.scalawt

/** The default `Container` [[scalax.scalawt.Frame]] uses.
  *
  * It provides access to the [[scalax.scalawt.MenuBar]] and the actual
  * [[scalax.scalawt.Container]] where the added [[scalax.scalawt.Component]]s are forwarded
  * to.
  */
trait RootContainer extends Container { self: Window =>

  def components = ???

  private var _menuBar: MenuBar = new MenuBar

  /** Returns this windows menu bar. */
  def menuBar: MenuBar = _menuBar

  /** Sets this windows menu bar. */
  def menuBar_=(m: MenuBar) {
    _menuBar = m
  }

}
