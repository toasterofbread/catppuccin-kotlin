/*
 * Copyright (c) 2021 Catppuccin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.catppuccin.kotlin.color

import com.catppuccin.kotlin.Color
import com.catppuccin.kotlin.ColorValues
import com.catppuccin.kotlin.Palette
import com.catppuccin.kotlin.surface0
import com.catppuccin.kotlin.util.whenPalette

public class Surface0PaletteColor(palette: Palette) : PaletteColor(surface0, palette) {

    override val color = whenPalette(
        latte = Color(ColorValues.SURFACE0_LATTE_HEX),
        frappe = Color(ColorValues.SURFACE0_FRAPPE_HEX),
        macchiato = Color(ColorValues.SURFACE0_MACCHIATO_HEX),
        mocha = Color(ColorValues.SURFACE0_MOCHA_HEX)
    )
}
