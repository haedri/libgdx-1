
package com.badlogic.gdx.input;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Pixmap;

/** <p>
 * A class representing a native cursor.
 * </p>
 * 
 * <p>
 * Cursor instances are created via a call to {@link Input#newCursor(Pixmap,int,int)}.
 * </p>
 * 
 * <p>
 * Cursor are set using {@link Input#setCursor(Cursor)}.
 * </p> **/
public interface Cursor {
	/**
	 * set the desktop mouse cursor to this cursor. 
	 */
	public void setCursor ();
}
