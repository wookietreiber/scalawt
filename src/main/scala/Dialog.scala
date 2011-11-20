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

/** `Dialog` factory which returns fully set up instances. */
object Dialog {
}

/** Simple window with the ability to be modal.
  *
  * Dialogs usually have no menu and therefore do not use
  * [[scalax.scalawt.RootPaneContainer]] as their default `Container`. Use the
  * companion object to create default dialogs or extend this class to
  * create your own, custom ones.
  */
abstract class Dialog extends Window { self: Container =>

  private var _modal: Boolean = false

  /** Returns the modal property. */
  def modal: Boolean = _modal

  /** Sets the modal property. */
  def modal_=(m: Boolean) {
    _modal = m
  }

}
