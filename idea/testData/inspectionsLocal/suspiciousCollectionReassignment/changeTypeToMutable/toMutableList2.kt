// FIX: Change type to mutable
// WITH_RUNTIME
fun test(a: Any) {
    var list = a as List<Int>
    list <caret>+= 2
}