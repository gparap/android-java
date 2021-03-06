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
package gparap.apps.password.ui.evaluator

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class EvaluatorViewModel : ViewModel() {
    //handle password
    private val passwordLiveData = MutableLiveData<String>()
    val password: LiveData<String> = passwordLiveData

    //handle password length
    private var passwordLengthLiveData = MutableLiveData<Int>()
    val passwordLength: LiveData<Int> = passwordLengthLiveData
    fun setPasswordLength(length: Int) {
        passwordLengthLiveData.value = length
    }

    //handle password strength feedback
    private var passwordStrengthLiveData = MutableLiveData<String>()
    val passwordStrength: LiveData<String> = passwordStrengthLiveData
    fun setPasswordStrength(strength: String) {
        passwordStrengthLiveData.value = strength
    }

    //handle password title
    private val passwordTitleLiveData = MutableLiveData<String>()
    val passwordTitle: LiveData<String> = passwordTitleLiveData
    fun setPasswordTitle(title: String) {
        passwordTitleLiveData.value = title
    }
}