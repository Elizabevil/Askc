package com.eliza.comps.basic.state.base

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable


/*
* 在 Compose 中管理状态
    您可以通过可组合函数本身管理简单的状态提升。但是，如果要跟踪的状态数增加，或者可组合函数中出现要执行的逻辑，最好将逻辑和状态事务委派给其他类（状态容器）
    * 请注意，在其他资料中，状态容器也称为“提升的状态对象”。
* */

/*
* 根据可组合项的复杂性，您需要考虑不同的备选方案：
    可组合项：用于管理简单的界面元素状态。
    状态容器：用于管理复杂的界面元素状态，且拥有界面元素的状态和界面逻辑。
    架构组件 ViewModel：一种特殊的状态容器类型，用于提供对业务逻辑以及屏幕或界面状态的访问权限。

* 状态容器的大小不等，具体取决于所管理的界面元素的范围（从底部应用栏等单个微件到整个屏幕）。状态容器可组合使用，也就是说，可将某个状态容器集成到其他状态容器中，尤其是在汇总状态时。
* */
@Composable
fun IMg() {
//     painterResource(R.drawable.img01),

}