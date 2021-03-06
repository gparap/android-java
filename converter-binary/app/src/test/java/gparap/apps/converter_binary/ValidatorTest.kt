/*
 * Copyright 2021 gparap
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package gparap.apps.converter_binary

import org.junit.Before
import org.junit.Test

import org.junit.Assert.*
import kotlin.properties.Delegates

/**
 * Created by gparap on 2021-02-25.
 */
class ValidatorTest {
    private var validator: Validator? = null
    private lateinit var input: String
    private var expected by Delegates.notNull<Boolean>()
    private var actual by Delegates.notNull<Boolean>()

    @Before
    fun setUp() {
        validator = Validator()
    }

    @Test
    fun validateBinary_InputIsCorrect() {
        input = "011001110111000001100001011100100110000101110000"
        expected = true
        actual = validator?.validateBinaryInput(input)!!
        assertEquals("something is wrong, correct input not working?", expected, actual)
    }

    @Test
    fun validateBinary_InputIsNotBinary() {
        input = "a01100111011100000110000101110010011000010111000"
        expected = false
        actual = validator?.validateBinaryInput(input)!!
        assertEquals("input value is not binary", expected, actual)
    }

    @Test
    fun validateBinary_InputIsMissingDigits() {
        input = "01100111011100000110000101110010011000010111000"
        expected = false
        actual = validator?.validateBinaryInput(input)!!
        assertEquals("input is missing digit(s)", validator?.validateBinaryInput(input), false)
    }
}