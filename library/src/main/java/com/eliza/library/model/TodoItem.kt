package com.eliza.library.model

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector
import com.eliza.library.R
import java.util.*


/*-*- coding:utf-8 -*-
 * @Author  : debi
 * @Time    : 5/6/22
 * @Software: Android Studio
 */
data class TodoItem(

    val task: String,
//    val icon: TodoIcon = TodoIcon.Default,
    val id: UUID = UUID.randomUUID()

)


//enum class TodoIcon(
//    val imageVector: ImageVector,
//    @StringRes val contentDescription: Int
//) {
//    //使用了Material Desi gn的图标
//    Square(Icons.Default.CropSquare, R.string.cd_expand),
//    Done(Icons.Default.Done, "Done"),
//    Event(Icons.Default.Event, "Event"),
//    Privacy(Icons.Default.PrivacyTip, "Privacy"),
//    Trash(Icons.Default.RestoreFromTrash, "Restore");
//
//    companion object {
//        val Default = Square
//    }
//}