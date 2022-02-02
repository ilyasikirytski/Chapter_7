package Kot_B_6

fun main() {
    val text = "Do you think it is a good position? i founded a better position"
    insertSub(text, 0, "t", "#")
}


fun insertSub(text: String, insertOrDelete: Int, insertAfter: String, charToInsert: String) {
    if (insertOrDelete == 0) {
        println(text.replace(insertAfter.toRegex(), insertAfter + charToInsert))
    } else {
        println(text.replace(insertAfter.toRegex(), ""))
    }
}

// а может так?
// fun insertSub(text: String, insertOrDelete: Int, insertAfter: String, charToInsert: String) {
//    val replacement = when (insertOrDelete) {
//        0 -> insertAfter + charToInsert
//        else -> ""
//    }
//    println(text.replace(insertAfter.toRegex(), replacement))
//}
