package com.eliza.comps.basic.state.base

import androidx.compose.material.*
import androidx.compose.runtime.*
import com.eliza.comps.basic.ui.theme.AskcTheme
import kotlinx.coroutines.launch

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


/*
状态和逻辑的类型
    在 Android 应用中，需要考虑不同类型的状态：
        界面元素状态是界面元素的提升状态。例如，ScaffoldState 用于处理 Scaffold 可组合项的状态。
        屏幕或界面状态是屏幕上需要显示的内容。例如，CartUiState 类可以包含购物车中的商品信息、向用户显示的消息或加载标记。该状态通常会与层次结构中的其他层相关联，原因是其包含应用数据。
    此外，逻辑还有不同的类型：
        界面行为逻辑或界面逻辑与如何在屏幕上显示状态变化相关。例如，导航逻辑决定着接下来显示哪个屏幕，界面逻辑决定着如何在可能会使用信息提示控件或消息框的屏幕上显示用户消息。界面行为逻辑应始终位于组合中。
        业务逻辑决定着如何处理状态变化，例如如何付款或存储用户偏好设置。该逻辑通常位于业务层或数据层，但绝不会位于界面层。
*
* */
@Composable
fun Img() {
//     painterResource(R.drawable.img01),

}

/**
 * 将可组合项作为可信来源
 * 如果状态和逻辑比较简单，在可组合项中使用界面逻辑和界面元素状态是一种不错的方法。
 *      例如，以下是处理 ScaffoldState 和 CoroutineScope 的 MyApp 可组合项：
 */

@Composable
private fun MyApp() {
    AskcTheme() {
        val scaffoldState = rememberScaffoldState()
        val coroutineScope = rememberCoroutineScope()

        Scaffold(scaffoldState = scaffoldState) {
                showSnackbar = { message ->
                    coroutineScope.launch {
                        scaffoldState.snackbarHostState.showSnackbar(message)
                    }
                }
        }
    }
}