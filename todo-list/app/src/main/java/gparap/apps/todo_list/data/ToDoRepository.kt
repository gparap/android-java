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
package gparap.apps.todo_list.data

import androidx.lifecycle.LiveData

class ToDoRepository(private val dao: ToDoDao) {

    //add a new to-do
    suspend fun addToDo(toDoModel: ToDoModel) {
        dao.addToDo(toDoModel)
    }

    //get to-do list
    val getToDoList: LiveData<List<ToDoModel>> = dao.getToDoList()

    //edit to-do to be done or not (checked/unchecked)
    suspend fun editToDo(id: Long, isDone: Boolean) {
        dao.updateToDo(id, isDone)
    }

    //edit to-do
    suspend fun editToDo(toDoModel: ToDoModel) {
        dao.updateToDo(toDoModel)
    }

    //delete to-do
    suspend fun deleteToDo(toDoModel: ToDoModel) {
        dao.deleteToDo(toDoModel)
    }

    //delete to-do list
    suspend fun deleteToDoList(toDoModelList: List<ToDoModel>) {
        dao.deleteToDoList(toDoModelList)
    }
}